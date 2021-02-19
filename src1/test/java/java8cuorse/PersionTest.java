package java8cuorse;
//111
import java8cuorse.lesson2.Person;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class PersionTest {
    @Test
    public void shouldReturnHelloWorld(){
        Person marcus= new Person();
        assertEquals("HelloWorld",marcus.helloWorld());
    }

    @Test
    public void shouldReturnHelloMarcus(){
        Person person= new Person();
        assertEquals("Hello Marcus",person.hello("Marcus"));
    }
    @Test
    public void shouldReturnNumberOfPersons(){
        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
        Person person4 = new Person();
        Person myPerson = new Person();
        assertEquals(5,Person.numberOfPersons());
    }
}

