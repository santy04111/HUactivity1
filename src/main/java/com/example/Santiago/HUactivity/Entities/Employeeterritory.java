package com.example.Santiago.HUactivity.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "employeeterritory")
public class Employeeterritory {
    @EmbeddedId
    private EmployeeterritoryId id;

    @MapsId("employeeid")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "employeeid", nullable = false)
    private Employee employeeid;

    @MapsId("territoryid")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "territoryid", nullable = false)
    private Territory territoryid;

    public EmployeeterritoryId getId() {
        return id;
    }

    public void setId(EmployeeterritoryId id) {
        this.id = id;
    }

    public Employee getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(Employee employeeid) {
        this.employeeid = employeeid;
    }

    public Territory getTerritoryid() {
        return territoryid;
    }

    public void setTerritoryid(Territory territoryid) {
        this.territoryid = territoryid;
    }

}