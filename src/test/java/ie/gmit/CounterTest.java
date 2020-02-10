package ie.gmit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;

public class CounterTest  {

    Counter myCounter = new Counter();




    @BeforeEach
    void init() {
        myCounter = new Counter();
    }

    @DisplayName("checking constructor is initialsed")
    @Test
    void testConstructor() {
        myCounter = new Counter();
        assertEquals(0,myCounter.getCount());
    }

/*
    @DisplayName("checking constructor with value")
    @Test
    void testConstructorWithValue()
    {
        myCounter = new Counter();
        assertThrows(IllegalAccessException.class,()->{new Counter();});
    }

/*
    @DisplayName("testing increment method")
    @Test
    void testIncrement() {
        assertEquals(1,myCounter.increment());
    }

    @DisplayName("testing increment method with -1")
    @Test
    void testDecrement() {
        assertEquals(-1,myCounter.decrement());
    }

*/


}
