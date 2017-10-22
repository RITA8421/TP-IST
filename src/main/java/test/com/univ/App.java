package test.com.univ;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.univ.Car;
import com.univ.Person;
import com.univ.Rent;
import com.univ.Van;
import com.univ.Vehicule;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    		EntityManagerFactory emf = Persistence.createEntityManagerFactory("manager1");
		EntityManager entityManager = emf.createEntityManager();
		
		EntityTransaction tx = entityManager.getTransaction();
		
    	try{
    		
			tx.begin();
			
			Person p1 = new Person();
			Person p2 = new Person();
			Person p3 = new Person();
			Rent rent = new Rent();
			Rent rent1 = new Rent();
			Rent rent2= new Rent();
			Vehicule v1 = new Vehicule();
			Car v2 = new Car();
			Van v3 = new Van();
			
			p1.setName("Tintin");
			p2.setName("Jiajia");
			p3.setName("Haohao");
					
			DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
			Date Date = dateFormat.parse("23/09/2015");
			Date Date1 = dateFormat.parse("16/09/2015");
			Date Date2 = dateFormat.parse("25/12/2015");
			
			p1.setDate(Date);
			p2.setDate(Date1);
			p3.setDate(Date2);
			
			v1.setPlatNumber("京FP8421");
			v1.setMarque("DS");
			
			v2.setMarque("BMW");
			v2.setNumberOfSeats(5);
			v2.setPlatNumber("京NH3M78");
			
			v3.setPlatNumber("京FG2413");
			v3.setMaxWeight(20);
			v3.setMarque("五菱宏光");
			
			rent.setBeginRent(Date);
			rent.setEndRent(Date1);
			rent.setDriver(p2);
			rent.setVehicule(v1);
			rent2.setDriver(p1);
			rent2.setVehicule(v2);
			rent2.setBeginRent(Date);
			rent2.setEndRent(Date2);
			rent1.setDriver(p3);
			rent2.setVehicule(v3);
			rent1.setBeginRent(Date);
			rent1.setEndRent(Date2);
			rent1.setVehicule(v3);
			
			entityManager.persist(p1);
			entityManager.persist(p2);
			entityManager.persist(p3);
			entityManager.persist(rent);	
			entityManager.persist(rent1);
			entityManager.persist(rent2);
			entityManager.persist(v1);
			entityManager.persist(v2);
			entityManager.persist(v3);
			tx.commit();			
		
		}catch(Exception e){
			tx.rollback();
		}
		
	}
}
