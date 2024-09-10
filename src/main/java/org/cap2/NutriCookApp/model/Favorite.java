package org.cap2.NutriCookApp.model;

import javax.persistence.*;
import java.util.*;

@Entity
public class Favorite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Favorite_ID;

    @OneToMany(mappedBy = "User_ID")
    private Set<User> user_ID;

    @OneToMany(mappedBy = "Recipe_ID")
    private Set<Recipe> Recipe_ID;
    private Date date_added;

    public Favorite() {
    }

    public Favorite(int favorite_ID, Set<User> user_ID, Set<Recipe> recipe_ID, Date date_added) {
        Favorite_ID = favorite_ID;
        this.user_ID = user_ID;
        Recipe_ID = recipe_ID;
        this.date_added = date_added;
    }

    public int getFavorite_ID() {
        return Favorite_ID;
    }

    public void setFavorite_ID(int favorite_ID) {
        Favorite_ID = favorite_ID;
    }

    public Set<User> getUser_ID() {
        return user_ID;
    }

    public void setUser_ID(Set<User> user_ID) {
        this.user_ID = user_ID;
    }

    public Set<Recipe> getRecipe_ID() {
        return Recipe_ID;
    }

    public void setRecipe_ID(Set<Recipe> recipe_ID) {
        Recipe_ID = recipe_ID;
    }

    public Date getDate_added() {
        return date_added;
    }

    public void setDate_added(Date date_added) {
        this.date_added = date_added;
    }
}
