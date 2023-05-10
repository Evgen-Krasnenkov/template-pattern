package org.kras.pizza;

public class VegetarianPizza extends Pizza {
    public void addToppings() {
        super.addToppings();
        func.accept("topping", "Add peppers");
        func.accept("topping", "Add olives");
    }

    public void cook() {
        System.out.println("Cook in the oven for 15 minutes");
    }

}
