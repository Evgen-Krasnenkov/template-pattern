package org.kras.pizza;

public class MeatFeastPizza extends Pizza {

    public void addToppings() {
        super.addToppings();
        func.accept("topping", "Add pepperoni");
        func.accept("topping", "Add ham");
        func.accept("topping", "Add chicken");
    }

    public void cook() {
        System.out.println("Cook in the oven for 20 minutes");
    }

}
