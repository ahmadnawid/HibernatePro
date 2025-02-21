package org.hibernate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public record Alien(
        @Id
        int anInt,
        String name,
        String tech
) {
}
