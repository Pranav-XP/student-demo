package com.example.student_demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity

public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;



    @NotBlank(message = "Enter Name Dipshit")
    @Size(min = 2, max = 50, message = "Name is too Long")
    private String name;

    @NotBlank (message = "Give Email Dipshit")
    @Email(message = "Give Valid One Dipshit")
    private String email;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public @NotBlank(message = "Enter Name Dipshit") @Size(min = 2, max = 50, message = "Name is too Long") String getName() {
        return name;
    }

    public void setName(@NotBlank(message = "Enter Name Dipshit") @Size(min = 2, max = 50, message = "Name is too Long") String name) {
        this.name = name;
    }

    public @NotBlank(message = "Give Email Dipshit") @Email(message = "Give Valid One Dipshit") String getEmail() {
        return email;
    }

    public void setEmail(@NotBlank(message = "Give Email Dipshit") @Email(message = "Give Valid One Dipshit") String email) {
        this.email = email;
    }
}
