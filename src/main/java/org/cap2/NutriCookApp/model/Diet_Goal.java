package org.cap2.NutriCookApp.model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class Diet_Goal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Diet_Goal_ID;

    @ManyToOne
    @JoinColumn(name = "User_ID")
    private User User_ID;
    private double calorie_target;
    private double protein_target;
    private double fat_target;
    private double carbs_target;
    private int meal_frequency;
    private Timestamp created_at;

    public Diet_Goal() {
    }

    public Diet_Goal(int diet_Goal_ID, User user_ID, double calorie_target, double protein_target, double fat_target, double carb_target, int meal_frequency, Timestamp created_at) {
        Diet_Goal_ID = diet_Goal_ID;
        User_ID = user_ID;
        this.calorie_target = calorie_target;
        this.protein_target = protein_target;
        this.fat_target = fat_target;
        this.carbs_target = carb_target;
        this.meal_frequency = meal_frequency;
        this.created_at = created_at;
    }

    public int getDiet_Goal_ID() {
        return Diet_Goal_ID;
    }

    public void setDiet_Goal_ID(int diet_Goal_ID) {
        Diet_Goal_ID = diet_Goal_ID;
    }

    public User getUser_ID() {
        return User_ID;
    }

    public void setUser_ID(User user_ID) {
        User_ID = user_ID;
    }

    public double getCalorie_target() {
        return calorie_target;
    }

    public void setCalorie_target(double calorie_target) {
        this.calorie_target = calorie_target;
    }

    public double getProtein_target() {
        return protein_target;
    }

    public void setProtein_target(double protein_target) {
        this.protein_target = protein_target;
    }

    public double getFat_target() {
        return fat_target;
    }

    public void setFat_target(double fat_target) {
        this.fat_target = fat_target;
    }

    public double getCarb_target() {
        return carbs_target;
    }

    public void setCarb_target(double carb_target) {
        this.carbs_target = carb_target;
    }

    public int getMeal_frequency() {
        return meal_frequency;
    }

    public void setMeal_frequency(int meal_frequency) {
        this.meal_frequency = meal_frequency;
    }

    public Timestamp getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Timestamp created_at) {
        this.created_at = created_at;
    }
}
