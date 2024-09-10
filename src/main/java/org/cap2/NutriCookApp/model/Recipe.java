package org.cap2.NutriCookApp.model;


import javax.persistence.*;

@Entity
public class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Recipe_ID;

    private String recipe_name;
    private String recipe_description;
    private String cooking_instructions;
    private double total_calories;
    private double total_fat;
    private double total_carbs;
    private double total_protein;

    public Recipe() {
    }

    public Recipe(int recipe_ID, String recipe_name, String recipe_description, String cooking_instructions, double total_calories, double total_fat, double total_carbs, double total_protein) {
        Recipe_ID = recipe_ID;
        this.recipe_name = recipe_name;
        this.recipe_description = recipe_description;
        this.cooking_instructions = cooking_instructions;
        this.total_calories = total_calories;
        this.total_fat = total_fat;
        this.total_carbs = total_carbs;
        this.total_protein = total_protein;
    }

    public int getRecipe_ID() {
        return Recipe_ID;
    }

    public void setRecipe_ID(int recipe_ID) {
        Recipe_ID = recipe_ID;
    }

    public String getRecipe_name() {
        return recipe_name;
    }

    public void setRecipe_name(String recipe_name) {
        this.recipe_name = recipe_name;
    }

    public String getRecipe_description() {
        return recipe_description;
    }

    public void setRecipe_description(String recipe_description) {
        this.recipe_description = recipe_description;
    }

    public String getCooking_instructions() {
        return cooking_instructions;
    }

    public void setCooking_instructions(String cooking_instructions) {
        this.cooking_instructions = cooking_instructions;
    }

    public double getTotal_calories() {
        return total_calories;
    }

    public void setTotal_calories(double total_calories) {
        this.total_calories = total_calories;
    }

    public double getTotal_fat() {
        return total_fat;
    }

    public void setTotal_fat(double total_fat) {
        this.total_fat = total_fat;
    }

    public double getTotal_carbs() {
        return total_carbs;
    }

    public void setTotal_carbs(double total_carbs) {
        this.total_carbs = total_carbs;
    }

    public double getTotal_protein() {
        return total_protein;
    }

    public void setTotal_protein(double total_protein) {
        this.total_protein = total_protein;
    }
}
