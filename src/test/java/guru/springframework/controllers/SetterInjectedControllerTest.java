package guru.springframework.controllers;

import guru.springframework.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;


@RunWith(SpringJUnit4ClassRunner.class)
public class SetterInjectedControllerTest {

    private SetterInjectedController classUnderTest;

    @Before
    public void setUp() throws Exception {
        this.classUnderTest = new SetterInjectedController();
        this.classUnderTest.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting() {
        assertEquals(GreetingServiceImpl.HELLO_GURUS, classUnderTest.sayHello());
    }
}