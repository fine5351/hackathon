package com.jkos.hackathon.entity;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
public class Vacancy extends BaseEntity {

    private String title;

}
