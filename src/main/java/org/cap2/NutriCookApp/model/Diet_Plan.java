package org.cap2.NutriCookApp.model;

import javax.persistence.*;

@Entity
public class Diet_Plan {
    @Id
    @GeneratedValue
    private int Diet_Plan_ID;
    private Enum diet_type;
    private String diet_description;
    private double calories_range_min;
    private double calories_range_max;
    private double protein_range_min;
    private double protein_range_max;
    private double fat_range_min;
    private double fat_range_max;
    private double carbs_range_min;
    private double carbs_range_max;

    public Diet_Plan() {
    }

    public Diet_Plan(double carbs_range_max, double carbs_range_min, double fat_range_max, double fat_range_min, double protein_range_max, double protein_range_min, double calories_range_max, double calories_range_min, String diet_description, Enum diet_type, int diet_Plan_ID) {
        this.carbs_range_max = carbs_range_max;
        this.carbs_range_min = carbs_range_min;
        this.fat_range_max = fat_range_max;
        this.fat_range_min = fat_range_min;
        this.protein_range_max = protein_range_max;
        this.protein_range_min = protein_range_min;
        this.calories_range_max = calories_range_max;
        this.calories_range_min = calories_range_min;
        this.diet_description = diet_description;
        this.diet_type = diet_type;
        Diet_Plan_ID = diet_Plan_ID;
    }

    public int getDiet_Plan_ID() {
        return Diet_Plan_ID;
    }

    public void setDiet_Plan_ID(int diet_Plan_ID) {
        Diet_Plan_ID = diet_Plan_ID;
    }

    public Enum getDiet_type() {
        return diet_type;
    }

    public void setDiet_type(Enum diet_type) {
        this.diet_type = diet_type;
    }

    public String getDiet_description() {
        return diet_description;
    }

    public void setDiet_description(String diet_description) {
        this.diet_description = diet_description;
    }

    public double getCalories_range_min() {
        return calories_range_min;
    }

    public void setCalories_range_min(double calories_range_min) {
        this.calories_range_min = calories_range_min;
    }

    public double getCalories_range_max() {
        return calories_range_max;
    }

    public void setCalories_range_max(double calories_range_max) {
        this.calories_range_max = calories_range_max;
    }

    public double getProtein_range_min() {
        return protein_range_min;
    }

    public void setProtein_range_min(double protein_range_min) {
        this.protein_range_min = protein_range_min;
    }

    public double getProtein_range_max() {
        return protein_range_max;
    }

    public void setProtein_range_max(double protein_range_max) {
        this.protein_range_max = protein_range_max;
    }

    public double getFat_range_min() {
        return fat_range_min;
    }

    public void setFat_range_min(double fat_range_min) {
        this.fat_range_min = fat_range_min;
    }

    public double getFat_range_max() {
        return fat_range_max;
    }

    public void setFat_range_max(double fat_range_max) {
        this.fat_range_max = fat_range_max;
    }

    public double getCarbs_range_min() {
        return carbs_range_min;
    }

    public void setCarbs_range_min(double carbs_range_min) {
        this.carbs_range_min = carbs_range_min;
    }

    public double getCarbs_range_max() {
        return carbs_range_max;
    }

    public void setCarbs_range_max(double carbs_range_max) {
        this.carbs_range_max = carbs_range_max;
    }
}
