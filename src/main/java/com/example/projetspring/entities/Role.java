package com.example.projetspring.entities;

import javax.persistence.*;

@Entity
@Table(name = "roles")

public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 45)
    private String role;

    public Role() { }

    public Role(String name) {
        this.role = name;
    }

    public Role(Integer id, String name) {
        this.id = id;
        this.role = name;
    }

    public Role(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String name) {
        this.role = name;
    }

    @Override
    public String toString() {
        return this.role;
    }
}
