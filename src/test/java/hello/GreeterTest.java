import org.junit.Test;
import static org.junit.Assert.*;
import hello.Greeter;

public class GreeterTest {

    @Test
    public void sayHelloMustReturnHelloWorld() {
        Greeter g = new Greeter();
        assertEquals("Hello world!", g.sayHello());
    }
}