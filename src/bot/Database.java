package bot;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;
import org.hibernate.service.ServiceRegistry;



public class Database {

    private static Configuration   configuration;

    private static SessionFactory  factory;

    private static ServiceRegistry serviceRegistry;

    static {
        try {
            Properties props = new Properties();
            props.load(Database.class.getResourceAsStream("/log4j.properties"));

            configuration = new Configuration().configure("hibernate.cfg.xml");
            serviceRegistry = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
            factory = new Configuration().configure().buildSessionFactory(serviceRegistry);

            Runtime.getRuntime().addShutdownHook(new Thread() {
                @Override
                public void run() {
                    StandardServiceRegistryBuilder.destroy(serviceRegistry);
                }
            });

        } catch (Throwable e) {
        }
    }




    public static void main(String[] args) {
    	Database.save(new Babarendorf(444, 444));
       
    
        }

    

    public static void save(Gegnerdorf angriff) {
        Session session = factory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            session.save(angriff);
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null)
                tx.rollback();

        } finally {
            session.close();
        }
    }
}
