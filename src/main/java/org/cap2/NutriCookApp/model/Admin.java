package org.cap2.NutriCookApp.model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Admin_ID;
    private String username;
    private String password;
    private String email;
    private String fullname;
    private Timestamp created_at;

    public Admin() {
    }

    public Admin(int admin_ID, String username, String password, String email, String fullname) {
        Admin_ID = admin_ID;
        this.username = username;
        this.password = password;
        this.email = email;
        this.fullname = fullname;
    }

    public int getAdmin_ID() {
        return Admin_ID;
    }

    public void setAdmin_ID(int admin_ID) {
        Admin_ID = admin_ID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public Timestamp getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Timestamp created_at) {
        this.created_at = created_at;
    }
}
