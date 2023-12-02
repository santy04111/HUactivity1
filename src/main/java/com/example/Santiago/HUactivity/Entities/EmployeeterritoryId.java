package com.example.Santiago.HUactivity.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class EmployeeterritoryId implements Serializable {
    private static final long serialVersionUID = -8255744922656486599L;
    @Column(name = "employeeid", nullable = false)
    private Integer employeeid;

    @Column(name = "territoryid", nullable = false, length = 20)
    private String territoryid;

    public Integer getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(Integer employeeid) {
        this.employeeid = employeeid;
    }

    public String getTerritoryid() {
        return territoryid;
    }

    public void setTerritoryid(String territoryid) {
        this.territoryid = territoryid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        EmployeeterritoryId entity = (EmployeeterritoryId) o;
        return Objects.equals(this.territoryid, entity.territoryid) &&
                Objects.equals(this.employeeid, entity.employeeid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(territoryid, employeeid);
    }

}