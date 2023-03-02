package Admin;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.entity.customer;
import com.entity.product;
import com.util.Hbutil;

public class controller {
	
	public static void main(String[] args) {
		SessionFactory sf=Hbutil.getSessionFactory();
		Session session=sf.openSession();
		
		customer c=new customer();
		c.setName("rajshri");
		c.setAdress("pune");
		for(int i=0 ; i < 2 ;i++) {
			product product = new product();
			product.setPname("Mobile");
			product.setPrice(24500);
			c.getList().add(product);
		}
		
		session.save(c);
		session.beginTransaction().commit();
	}

}
