package com.portfolio.backend.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class About {
    @Id
    private Integer dni;
    private String title;
    private String description;
    private String interest;
    private String history;
    private String tag; 
}