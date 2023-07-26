package in.ineuron.company;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("org.my")
public class Comp4 {
	
	@Value("${comname}")
	String compName;
	
	@Value("${comsize}")
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
		return "Comp4 [compName=" + compName + ", compSize=" + compSize + "]";
	}
	
	
}
