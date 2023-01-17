import org.Lab2Sem2.Person;
import org.junit.Test;

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


}
