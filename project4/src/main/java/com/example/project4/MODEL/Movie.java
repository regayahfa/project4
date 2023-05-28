package com.example.project4.MODEL;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "movie")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ID;
    @NotEmpty(message = "not be Empty")
    @Column(columnDefinition = "Not null  ")

    private String name;
    @NotEmpty(message = "not be empty")
    @Column(columnDefinition = "check(genre='Drama' or genre='Action' or genre='Comedy'")

    private String genre;
    @NotEmpty(message = "not be empty")
    @Column(columnDefinition = "check(rating between 1 and 5")
    private Integer  rating;
    @NotEmpty(message = "not be empty")
    @Column(columnDefinition = "not null  duration > 60")
    private Integer duration;
    @Column(columnDefinition = "F")
    private Integer ID_Director;
}
