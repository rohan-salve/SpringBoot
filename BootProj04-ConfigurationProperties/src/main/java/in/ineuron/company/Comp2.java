package in.ineuron.company;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource(value = "/in/ineuron/common/input.properties")
@ConfigurationProperties(prefix = "in.pw")
public class Comp2 {
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
		return "Comp2 [compName=" + compName + ", compSize=" + compSize + "]";
	}
	
	
}
