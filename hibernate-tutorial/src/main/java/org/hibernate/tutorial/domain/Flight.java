package org.hibernate.tutorial.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name = "t_flight")
public class Flight implements Serializable {

	String id;
	String companyPrefix;
	String number;
	Date insertTime;

	public Flight() {

	}

	@Id
	// @GeneratedValue(strategy = GenerationType.TABLE, generator = "SEQ_GEN")
	// @javax.persistence.TableGenerator(name = "SEQ_GEN", table =
	// "t_sequence_gene", initialValue = 1, allocationSize =
	// 1,pkColumnName="sequence_name")
	
	//@GeneratedValue(generator = "idGenerator")
	//@GenericGenerator(name = "idGenerator", strategy = "uuid2", parameters = {
	//		@Parameter(name = "separator", value = "-"),
	//		@Parameter(name = "uuid_gen_strategy_class", value = "org.hibernate.id.uuid.StandardRandomStrategy") })
	
	@GeneratedValue(generator="guid")
	@GenericGenerator(name="guid", strategy = "guid")
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Column(name = "comp_prefix")
	public String getCompanyPrefix() {
		return companyPrefix;
	}

	public void setCompanyPrefix(String companyPrefix) {
		this.companyPrefix = companyPrefix;
	}

	@Column(name = "flight_number")
	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	@Column(name = "insert_time")
	public Date getInsertTime() {
		return insertTime;
	}

	public void setInsertTime(Date insertTime) {
		this.insertTime = insertTime;
	}

}
