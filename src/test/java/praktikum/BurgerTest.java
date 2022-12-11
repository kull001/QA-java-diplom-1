package praktikum;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class BurgerTest {
    Burger burger = new Burger();
    Ingredient ingredient1 = new Ingredient(IngredientType.SAUCE, "Maionez",150);
    Ingredient ingredient2 = new Ingredient(IngredientType.FILLING, "Potato",180);
    String expected = "(==== Burger ====)\r\n"+"= sauce Maionez =\r\n"+"(==== Burger ====)\r\n"+"\r\n"+"Price: 350,000000\r\n";

    @Mock
    Bun bun;
    @Mock
    Ingredient ingredient;


    @Test
    public void addIngredientTest() {
        burger.addIngredient(ingredient1);
        assertTrue(burger.ingredients.contains(ingredient1));
    }

    @Test
    public void removeIngredientTest() {
        burger.addIngredient(ingredient1);
        burger.removeIngredient(0);
        assertFalse(burger.ingredients.contains(ingredient1));
    }

    @Test
    public void moveIngredientTest() {
        burger.addIngredient(ingredient1);
        burger.addIngredient(ingredient2);
        burger.moveIngredient(0,1);
        assertEquals(ingredient1, burger.ingredients.get(1));
    }


    @Test
    public void getPriceTest() {
        Mockito.when(bun.getPrice()).thenReturn(150F);
        Mockito.when(ingredient.getPrice()).thenReturn(100F);
        burger.setBuns(bun);
        burger.addIngredient(ingredient);
        assertEquals(400,burger.getPrice(),0.1);
    }

    @Test
    public void getReceiptTest() {
        burger.setBuns(new Bun("Burger",100));
        burger.addIngredient(ingredient1);
        assertEquals(expected, burger.getReceipt());

    }
}