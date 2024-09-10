package org.cap2.NutriCookApp.model;


import javax.persistence.*;

@Entity
public class Meal_Log_Detail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Meal_Log_Detail_ID;
    @ManyToOne
    @JoinColumn(name = "Meal_Log_ID")
    private Meal_Log Meal_Log_ID;
    private int Recipe_ID;
    private double calories;
    private double protein;
    private double fat;
    private double carbs;

    public Meal_Log_Detail() {
    }

    public Meal_Log_Detail(int meal_Log_Detail_ID, Meal_Log meal_Log_ID, int recipe_ID, double calories, double protein, double fat, double carbs) {
        Meal_Log_Detail_ID = meal_Log_Detail_ID;
        Meal_Log_ID = meal_Log_ID;
        Recipe_ID = recipe_ID;
        this.calories = calories;
        this.protein = protein;
        this.fat = fat;
        this.carbs = carbs;
    }

    public int getMeal_Log_Detail_ID() {
        return Meal_Log_Detail_ID;
    }

    public void setMeal_Log_Detail_ID(int meal_Log_Detail_ID) {
        Meal_Log_Detail_ID = meal_Log_Detail_ID;
    }

    public Meal_Log getMeal_Log_ID() {
        return Meal_Log_ID;
    }

    public void setMeal_Log_ID(Meal_Log meal_Log_ID) {
        Meal_Log_ID = meal_Log_ID;
    }

    public int getRecipe_ID() {
        return Recipe_ID;
    }

    public void setRecipe_ID(int recipe_ID) {
        Recipe_ID = recipe_ID;
    }

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
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
