package in.ineuron.company;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "org.example")
public class Company {
	String compName;
	long compSize;
	public String getCompName() {
		return compName;
	}
	public void setCompName(String compName) {
		this.compName = compName;
	}
	public long getCompSize() {
		return compSize;
	}
	public void setCompSize(long compSize) {
		this.compSize = compSize;
	}
	@Override
	public String toString() {
		return "Company [compName=" + compName + ", compSize=" + compSize + "]";
	}
	
	
}
