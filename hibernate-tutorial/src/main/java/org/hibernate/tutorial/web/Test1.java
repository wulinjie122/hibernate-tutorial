package org.hibernate.tutorial.web;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.tutorial.domain.Flight;
import org.hibernate.tutorial.domain.MedicalHistory;
import org.hibernate.tutorial.domain.Person;
import org.hibernate.tutorial.util.HibernateUtil;

public class Test1 {

	public static void main(String[] args) {
		
		Session s = HibernateUtil.getSessionFactory().openSession();
		Transaction tx = s.beginTransaction();

		//Flight flight = new Flight();
		//flight.setId("12");
		//flight.setNumber("102");
		//flight.setCompanyPrefix("JIEYUE");
		//flight.setInsertTime(new Date());
		
		//s.save(flight);
		
		//1.病人
		Person patient = new Person();
		patient.setFirstname("Li");
		patient.setLastname("Hua");
		patient.setAge(23);
		Set emails = new HashSet();
		emails.add("lihua@jinlufund.com");
		patient.setEmailAddresses(emails);
		s.save(patient);
		
		//2.就诊历史
		//MedicalHistory history = new MedicalHistory();
		//history.setPatient(patient);
		
		//s.save(history);
		
		tx.commit();
		s.flush();
		s.close();
		
	}

}
