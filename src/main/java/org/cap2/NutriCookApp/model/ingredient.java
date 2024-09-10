package org.cap2.NutriCookApp.model;

import javax.persistence.*;

@Entity
public class ingredient {
    @Id
    @GeneratedValue
    private int Ingredient_ID;
    private String ingredient_name;
    private double calorie;
    private double protein;
    private double fat;
    private double carbs;

    public ingredient() {
    }

    public ingredient(int ingredient_ID, String ingredient_name, double calorie, double protein, double fat, double carbs) {
        Ingredient_ID = ingredient_ID;
        this.ingredient_name = ingredient_name;
        this.calorie = calorie;
        this.protein = protein;
        this.fat = fat;
        this.carbs = carbs;
    }

    public int getIngredient_ID() {
        return Ingredient_ID;
    }

    public void setIngredient_ID(int ingredient_ID) {
        Ingredient_ID = ingredient_ID;
    }

    public String getIngredient_name() {
        return ingredient_name;
    }

    public void setIngredient_name(String ingredient_name) {
        this.ingredient_name = ingredient_name;
    }

    public double getCalorie() {
        return calorie;
    }

    public void setCalorie(double calorie) {
        this.calorie = calorie;
    }

    public double getProtein() {
        return protein;
    }

    public void setProtein(double protein) {
        this.protein = protein;
    }

    public double getFat() {
        return fat;
    }

    public void setFat(double fat) {
        this.fat = fat;
    }

    public double getCarbs() {
        return carbs;
    }

    public void setCarbs(double carbs) {
        this.carbs = carbs;
    }
}
