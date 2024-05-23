package com.traini8.tcr.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.Instant;

import java.util.List;

@Entity
@AllArgsConstructor@NoArgsConstructor
@Data
public class TrainingCenter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(max = 40)
    private String centerName;

    @NotNull
    @Pattern(regexp = "^[a-zA-Z0-9]{12}$")
    private String centerCode;

    @Embedded
    private Address address;

    private Integer studentCapacity;

    @ElementCollection
    private List<String> coursesOffered;

    private Long createdOn;

    @Email
    private String contactEmail;

    @Pattern(regexp = "^\\+?[1-9]\\d{1,14}$")
    private String contactPhone;

    // Getters and Setters

    @PrePersist
    protected void onCreate() {
        this.createdOn = Instant.now().getEpochSecond();
    }
}

@Embeddable
@Data
class Address {
    private String detailedAddress;
    private String city;
    private String state;
    private String pincode;

    // Getters and Setters
}
