package org.hibernate.tutorial.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_patient")
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private int age;
	private String firstname;
	private String lastname;

	public Person() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	private Set events = new HashSet();

	protected Set getEvents() {
		return events;
	}

	protected void setEvents(Set events) {
		this.events = events;
	}

	private Set emailAddresses = new HashSet();

	public Set getEmailAddresses() {
		return emailAddresses;
	}

	public void setEmailAddresses(Set emailAddresses) {
		this.emailAddresses = emailAddresses;
	}

	public void addToEvent(Event event) {
		this.getEvents().add(event);
		event.getParticipants().add(this);
	}

	public void removeFromEvent(Event event) {
		this.getEvents().remove(event);
		event.getParticipants().remove(this);
	}

}
