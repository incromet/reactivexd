package test;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;
import org.powermock.core.classloader.annotations.PrepareForTest;

import co.edu.icesi.eketal.automaton.AutomatonConstructor;
import co.edu.icesi.eketal.handlercontrol._EventHandler;
import co.edu.icesi.ketal.core.Automaton;
import co.edu.icesi.ketal.core.Event;
import co.edu.icesi.ketal.core.NamedEvent;
import core.HelloWorld;

public class TestAutomaton {

	Automaton instance = AutomatonConstructor.getInstance();

    @Test
    @PrepareForTest({AutomatonConstructor.class})
    public void testAutomaton(){
    	System.setProperty("java.net.preferIPv4Stack" , "true");
    	
        Event eventHello = new NamedEvent("eventHello");
        Event eventWorld = new NamedEvent("eventWorld");
        
		System.out.println("co.edu.escuelaing.reactivexd.core.State@bc6893");
		String state = instance.getCurrentState().toString();
		assertFalse(instance.evaluate(eventWorld));
		
		System.out.println("Entered value was: Hello");
		
		System.out.println("co.edu.escuelaing.reactivexd.core.State@bc6893");
		assertEquals(state, instance.getCurrentState().toString());
		assertTrue(instance.evaluate(eventHello));
		
		System.out.println("Entered value was: Hi");
		
		System.out.println("co.edu.escuelaing.reactivexd.core.State@f7fead");
		assertNotEquals(state, instance.getCurrentState().toString());
		assertTrue(instance.evaluate(eventWorld));
		
		System.out.println("Entered value was: How are you");
		
		System.out.println("co.edu.escuelaing.reactivexd.core.State@f7fead");
		assertFalse(instance.getCurrentState().getAccept());
		
		System.out.println("Entered value was: Good");
		
    }
    
    @Test
    @PrepareForTest({AutomatonConstructor.class})
    public void testCase(){
    	HelloWorld hw = new HelloWorld();
         
        hw.helloMethod();
 		hw.worldMethod();
    }

}
