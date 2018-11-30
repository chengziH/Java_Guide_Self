package com.autowiring.service;

public class AutoWiringService {
	private AutoWiringDAO autoWiringDAO;
	public AutoWiringService(AutoWiringDAO autoWiringDAO){
		this.autoWiringDAO = autoWiringDAO;
	}
//	public void setAutoWiringDAO(AutoWiringDAO autoWiringDAO) {
//		this.autoWiringDAO = autoWiringDAO;
//	}
	public void say(String word){
		autoWiringDAO.say(word);
	}
}
