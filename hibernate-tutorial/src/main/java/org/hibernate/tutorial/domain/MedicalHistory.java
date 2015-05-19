package org.hibernate.tutorial.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="t_medical_history")
public class MedicalHistory implements Serializable {
	@Id
	Integer id;

	@MapsId
	@OneToOne
	@JoinColumn(name = "patient_id")
	Person patient;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Person getPatient() {
		return patient;
	}

	public void setPatient(Person patient) {
		this.patient = patient;
	}

}
