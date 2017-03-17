package service;
import model.Person;
import java.util.Hashtable;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

	Hashtable<String, Person> persons = new Hashtable<String, Person>();

	public PersonService() {
		
		// TODO Auto-generated constructor stub
		Person p = new Person();
		p.setId("1");
		p.setFirstName("sowmith");
		p.setLastName("daram");
		p.setAge(24);
		persons.put("1", p);
		
		p = new Person();
		p.setId("2");
		p.setFirstName("anudeep");
		p.setLastName("daram");
		p.setAge(26);
		persons.put("2", p);
		
	}
	
	public Person getPerson(String id)	{
		if(persons.containsKey(id))
		{
			return persons.get(id);
		}
		else
			return null;
	}
	
	public Hashtable<String, Person> getAll(){
		return persons;
	}
	
}
