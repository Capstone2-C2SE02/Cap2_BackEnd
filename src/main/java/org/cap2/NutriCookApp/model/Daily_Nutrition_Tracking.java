package org.cap2.NutriCookApp.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Daily_Nutrition_Tracking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Tracking_ID;

    @ManyToOne
    @JoinColumn(name = "User_ID")
    private User User_ID;
    private Date date;
    private int toal_calories;
    private int total_protein;
    private int total_fat;
    private int total_carbs;

    public Daily_Nutrition_Tracking() {
    }

    public Daily_Nutrition_Tracking(int Tracking_ID, User User_ID, Date date, int toal_calories, int total_protein, int total_fat, int total_carbs) {
        this.Tracking_ID = Tracking_ID;
        this.User_ID = User_ID;
        this.date = date;
        this.toal_calories = toal_calories;
        this.total_protein = total_protein;
        this.total_fat = total_fat;
        this.total_carbs = total_carbs;
    }

    public int getTracking_ID() {
        return Tracking_ID;
    }

    public void setTracking_ID(int tracking_ID) {
        Tracking_ID = tracking_ID;
    }

    public User getUser_ID() {
        return User_ID;
    }

    public void setUser_ID(User user_ID) {
        User_ID = user_ID;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getToal_calories() {
        return toal_calories;
    }

    public void setToal_calories(int toal_calories) {
        this.toal_calories = toal_calories;
    }

    public int getTotal_protein() {
        return total_protein;
    }

    public void setTotal_protein(int total_protein) {
        this.total_protein = total_protein;
    }

    public int getTotal_fat() {
        return total_fat;
    }

    public void setTotal_fat(int total_fat) {
        this.total_fat = total_fat;
    }

    public int getTotal_carbs() {
        return total_carbs;
    }

    public void setTotal_carbs(int total_carbs) {
        this.total_carbs = total_carbs;
    }
}
