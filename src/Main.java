
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {



        Set<Person> persons = new TreeSet<>();
        persons.add(new Person(65,"Andrei"));
        persons.add(new Person(40,"Ion"));
        persons.add(new Person(70,"Ana"));
        persons.add(new Person(34,"Petru"));
        persons.add(new Person(20,"Vasile"));
        persons.add(new Person(60,"Alina"));



        for (Person person : persons)
        {
            if(person.getAge()>60){
                System.out.println(person);
            }

        }








    }
}
