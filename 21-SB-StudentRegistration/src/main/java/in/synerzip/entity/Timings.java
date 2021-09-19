package in.synerzip.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TIMINGS")
public class Timings {
	
	@Id
	private Integer timingId;
    private String timingName;
	public Integer getTimingId() {
		return timingId;
	}
	public void setTimingId(Integer timingId) {
		this.timingId = timingId;
	}
	public String getTimingName() {
		return timingName;
	}
	public void setTimingName(String timingName) {
		this.timingName = timingName;
	}
	
}
