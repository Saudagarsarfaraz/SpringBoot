package in.synerzip.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name="INSURANCE_PLAN")
public class InsurancePlan {

	@Id
	@GeneratedValue
	private Integer planId;
	
	private String planName;
	
	private String planStatus;
	
	@CreationTimestamp
	@Column(updatable = false)
	private LocalDate createdDAte;
	
	@UpdateTimestamp
	@Column(updatable = false)
	private LocalDate updatesDAte;

	public Integer getPlanId() {
		return planId;
	}

	public void setPlanId(Integer planId) {
		this.planId = planId;
	}

	public String getPlanName() {
		return planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public String getPlanStatus() {
		return planStatus;
	}

	public void setPlanStatus(String planStatus) {
		this.planStatus = planStatus;
	}

	public LocalDate getCreatedDAte() {
		return createdDAte;
	}

	public void setCreatedDAte(LocalDate createdDAte) {
		this.createdDAte = createdDAte;
	}

	public LocalDate getUpdatesDAte() {
		return updatesDAte;
	}

	public void setUpdatesDAte(LocalDate updatesDAte) {
		this.updatesDAte = updatesDAte;
	}

	@Override
	public String toString() {
		return "InsurancePlan [planId=" + planId + ", planName=" + planName + ", planStatus=" + planStatus
				+ ", createdDAte=" + createdDAte + ", updatesDAte=" + updatesDAte + "]";
	}
     

}
