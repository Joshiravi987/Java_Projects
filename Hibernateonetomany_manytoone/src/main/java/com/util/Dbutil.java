package com.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Dbutil {
	Session session;
	public  Session gSession()
	{
		/* Configuration is a class that is used to configure hibernate
		configuration is used to load the hibernate configuration file hibernate.cfg.xml file
		it's used to create a session factory */
		
		Configuration con = new Configuration();
		// configure method is used to load the hibernate configuration file
		con.configure();
		// sessionFactory is used to create a session object
		SessionFactory sf = con.buildSessionFactory();
		session = sf.openSession();
		return session;
}
}