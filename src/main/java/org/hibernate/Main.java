package org.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Main {
    public static void main(String[] args) {
            Alien a1 = new Alien(103, "John", "Devops");

            Configuration config = new Configuration();
            config.addAnnotatedClass(org.hibernate.Alien.class);
            config.configure();


            SessionFactory factory = config.buildSessionFactory();

            Session session = factory.openSession();

            Transaction transaction = session.beginTransaction();

            //Alien a2 = session.find(Alien.class,102);

            session.merge(a1);


            transaction.commit();

            //System.out.println(a2);

            session.close();
            factory.close();


    }
}