package om.model;

import org.hibernate.Session;
import org.hibernate.Transaction;

import om.model.Employee;
import om.model.HbUtil;
import om.model.RegEmployee;
import om.model.Trainee;

public class TCPExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Session ses=HbUtil.getSessionFactory().openSession())
		{
		    Transaction tr=ses.beginTransaction();
			Employee e1=new Employee("Ramesh");
			RegEmployee e2=new RegEmployee("Suhas",20000,1000);
			Trainee e3=new Trainee("Saranya",1000,"12 months");
			ses.persist(e1);
			ses.persist(e2);
			ses.persist(e3);
			tr.commit();
			ses.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
