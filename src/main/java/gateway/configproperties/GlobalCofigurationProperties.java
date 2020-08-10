package gateway.configproperties;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("app")
public class GlobalCofigurationProperties {
	
	private String host;
	private String name;
	private String httpUri;
	private String pathWebTaxco;
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHttpUri() {
		return httpUri;
	}
	public void setHttpUri(String httpUri) {
		this.httpUri = httpUri;
	}
	
	public String getPathWebTaxco() {
		return pathWebTaxco;
	}
	public void setPathWebTaxco(String pathWebTaxco) {
		this.pathWebTaxco = pathWebTaxco;
	}
	public GlobalCofigurationProperties() {
		System.out.println(" >>>>>>>>inside constructor GlobalCofigurationProperties");
		System.out.println(String.format("property: %s", this.host));
		System.out.println(String.format("property: %s", this.name));
		System.out.println(String.format("property: %s", this.httpUri));
	}
	
	

}
