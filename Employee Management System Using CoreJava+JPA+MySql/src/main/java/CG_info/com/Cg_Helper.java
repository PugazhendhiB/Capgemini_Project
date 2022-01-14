package CG_info.com;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

class Cg_Helper {

	public static Session getSession() {
		Session s = null;
		try {
			System.out.println("inside try....");
			Configuration cf = new Configuration();
			cf = cf.configure("hibernate.cfg.xml");
			SessionFactory sf = cf.buildSessionFactory();
			s = sf.openSession();
		} catch (HibernateException e) {
			System.out.println("hibernate error " + e);
		} catch (Exception e) {
			System.out.println("General other than hibernate error " + e);
		}

		return s;

	}

}
