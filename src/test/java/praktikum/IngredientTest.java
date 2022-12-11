package praktikum;

import org.junit.Test;

import static org.junit.Assert.*;

public class IngredientTest {
    Ingredient ingredient1 = new Ingredient(IngredientType.SAUCE, "Maionez",150);
    Ingredient ingredient2 = new Ingredient(IngredientType.FILLING, "Potato",180);

    @Test
    public void getPriceReturn150() {
        assertEquals(150,ingredient1.getPrice(),0.1);
    }

    @Test
    public void getNameReturnPotato() {
        assertEquals("Potato", ingredient2.getName());
    }

    @Test
    public void getTypeReturnSauce() {
        assertEquals(IngredientType.SAUCE, ingredient1.getType());
    }
}