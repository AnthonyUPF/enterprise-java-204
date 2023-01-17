import org.Lab2Sem2.Person;
import org.Lab2Sem2.PersonsList;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class PersonTest {
    @Test
    public void shouldReturnException_WhenInvalidArguments(){
        assertThrows(IllegalArgumentException.class,()-> new Person("id","name",-30,"occupation"));

        assertThrows(IllegalArgumentException.class,()-> new Person("","name",30,"occupation"));
        assertThrows(IllegalArgumentException.class,()-> new Person(null,"name",30,"occupation"));

        assertThrows(IllegalArgumentException.class,()-> new Person("id","",30,"occupation"));
        assertThrows(IllegalArgumentException.class,()-> new Person("id",null,30,"occupation"));

        assertThrows(IllegalArgumentException.class,()-> new Person("id","name",30,""));
        assertThrows(IllegalArgumentException.class,()-> new Person("id","name",30,null));
    }

    @Test
    public void shouldReturnException_WhenInvalidName(){
        assertThrows(IllegalArgumentException.class,()-> PersonsList.findByName("Alma"));
    }

    @Test
    public void shouldReturnException_WhenNameNotExist(){
        Person person=new Person("id","Fernando Pozo",29,"student");
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(person);
        assertThrows(IllegalArgumentException.class,()-> (new PersonsList(persons)).findByName("Fernando Poz"));
    }

    @Test
    public void shouldReturnPerson_WhenNameExist(){
        Person person=new Person("id","Fernando Pozo",29,"student");
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(person);
        Person person1=(new PersonsList(persons)).findByName("Fernando Pozo");
        assertEquals(person.getName(),person1.getName());
    }



}
