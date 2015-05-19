package org.hibernate.tutorial.util;

import java.io.Serializable;

import org.hibernate.cfg.ImprovedNamingStrategy;
import org.hibernate.cfg.NamingStrategy;


public class TNamingStrategy extends ImprovedNamingStrategy implements NamingStrategy,Serializable {

	@Override
	public String tableName(String tableName) {
		// TODO Auto-generated method stub
		return "T_" + super.tableName(tableName);
	}

	

}
