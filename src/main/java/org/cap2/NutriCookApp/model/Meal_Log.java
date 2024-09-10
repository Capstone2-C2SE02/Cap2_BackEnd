package org.cap2.NutriCookApp.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Meal_Log {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Meal_Log_ID;
    @ManyToOne
    @JoinColumn(name = "User_ID")
    private User User_ID;
    private Enum Meal_Type;
    private Date date;

    public Meal_Log() {
    }

    public Meal_Log(Date date, Enum meal_Type, User user_ID, int meal_Log_ID) {
        this.date = date;
        Meal_Type = meal_Type;
        User_ID = user_ID;
        Meal_Log_ID = meal_Log_ID;
    }

    public int getMeal_Log_ID() {
        return Meal_Log_ID;
    }

    public void setMeal_Log_ID(int meal_Log_ID) {
        Meal_Log_ID = meal_Log_ID;
    }

    public User getUser_ID() {
        return User_ID;
    }

    public void setUser_ID(User user_ID) {
        User_ID = user_ID;
    }

    public Enum getMeal_Type() {
        return Meal_Type;
    }

    public void setMeal_Type(Enum meal_Type) {
        Meal_Type = meal_Type;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}

