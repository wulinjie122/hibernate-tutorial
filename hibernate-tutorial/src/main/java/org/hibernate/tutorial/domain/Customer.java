package org.hibernate.tutorial.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Customer {

	private long id;

	@Id
	@GeneratedValue
	public long getId() {
		return id;
	}

}
