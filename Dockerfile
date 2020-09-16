FROM gradle:6.5.1-jdk as builder
RUN mkdir -p /home/gradle/src
COPY --chown=gradle:gradle build.gradle /home/gradle/src
WORKDIR /home/gradle/src
RUN gradle clean build --no-daemon > /dev/null 2>&1 || true
COPY --chown=gradle:gradle . /home/gradle/src
RUN gradle build --no-daemon --stacktrace
RUN mkdir -p build/dependency && (cd build/dependency; jar -xf ../libs/*.jar)

FROM openjdk:8-jdk-alpine
RUN addgroup -S spring && adduser -S spring -G spring
USER spring:spring
COPY --from=builder /home/gradle/src/build/dependency/BOOT-INF/lib /app/lib
COPY --from=builder /home/gradle/src/build/dependency/META-INF /app/META-INF
COPY --from=builder /home/gradle/src/build/dependency/BOOT-INF/classes /app

ENTRYPOINT ["java","-cp","app:app/lib/*","gateway.Application"]
