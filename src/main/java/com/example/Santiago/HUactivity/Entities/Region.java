package com.example.Santiago.HUactivity.Entities;

import jakarta.persistence.*;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "region")
public class Region {
    @Id
    @Column(name = "regionid", nullable = false)
    private Integer id;

    @Column(name = "regiondescription", nullable = false, length = 50)
    private String regiondescription;

    @OneToMany(mappedBy = "regionid")
    private Set<Territory> territories = new LinkedHashSet<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRegiondescription() {
        return regiondescription;
    }

    public void setRegiondescription(String regiondescription) {
        this.regiondescription = regiondescription;
    }

    public Set<Territory> getTerritories() {
        return territories;
    }

    public void setTerritories(Set<Territory> territories) {
        this.territories = territories;
    }

}