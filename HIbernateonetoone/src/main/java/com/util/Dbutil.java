package com.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Dbutil {
	//Session is an interface that is used to get a connection with the database
	Session session;
public Session gSession() {
	
	//Configuration is a class that is used to configure hibernate
	//configuration is used to load the hibernate configuration file hibernate.cfg.xml file
	//it is used to create a session factory
	Configuration con = new Configuration();
	//configure() method is used to load the hibernate configuration file
	con.configure();
	//Seassionfactory is used to create a session object 
	//buildsessionfactory() method is used to create a sessionfactory object

	SessionFactory sf = con.buildSessionFactory();
	//opensession method is used to create a session object
	
	session = sf.openSession();
	return session;
}
}