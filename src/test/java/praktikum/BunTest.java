package praktikum;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BunTest {
    Bun burger = new Bun("Burger",100);

    @Test
    public void getNameReturnBurgerTest() {
        assertEquals("Burger",burger.getName());
    }

    @Test
    public void getPriceReturn100Test() {
        assertEquals(100,burger.getPrice(),0.1);
    }
}