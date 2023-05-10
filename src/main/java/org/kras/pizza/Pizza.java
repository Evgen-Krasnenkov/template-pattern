package org.kras.pizza;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;

public abstract class Pizza {
    private Map<String, List<String>> ingredients;

    public Map<String, List<String>> getIngredients() {
        return ingredients;
    }

    public void makeBase() {
        ingredients.computeIfAbsent("base", k -> new ArrayList<>());
        func.accept("base", "Mix flour, yeast and salt");
        func.accept("base", "Roll out the dough");
    }

    public void addToppings() {
        ingredients.computeIfAbsent("topping", k -> new ArrayList<>());
        func.accept("topping", "Add tomato");
        func.accept("topping", "Add cheese");
    }

    public void cook() {
    }

    public void printRecipe() {
        ingredients = new HashMap<>();
        makeBase();
        addToppings();
        cook();
        System.out.println(ingredients);
    }

    protected BiConsumer<String, String> func = (key, msg) -> {
        List<String> topic = ingredients.get(key);
        topic.add(msg);
    };
}
