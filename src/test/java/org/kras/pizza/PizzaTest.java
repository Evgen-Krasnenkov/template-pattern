package org.kras.pizza;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PizzaTest {
    @Test
    void givenTwoPizzas_whenPrintRecipe_thenIngredientsNotNull() {
        Pizza meatFeastPizza = new MeatFeastPizza();
        Pizza vegetarianPizza = new VegetarianPizza();
        Assertions.assertNull(vegetarianPizza.getIngredients());
        Assertions.assertNull(meatFeastPizza.getIngredients());
        meatFeastPizza.printRecipe();
        vegetarianPizza.printRecipe();
        Assertions.assertNotNull(vegetarianPizza.getIngredients());
        Assertions.assertNotNull(meatFeastPizza.getIngredients());
    }

}