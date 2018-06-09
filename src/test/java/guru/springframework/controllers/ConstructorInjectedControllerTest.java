package guru.springframework.controllers;

import guru.springframework.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;


public class ConstructorInjectedControllerTest {

    private ConstructorInjectedController classUnderTest;

    @Before
    public void setUp() throws Exception {
        this.classUnderTest = new ConstructorInjectedController(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting() {
        assertEquals(GreetingServiceImpl.HELLO_GURUS, classUnderTest.sayHello());
    }
}