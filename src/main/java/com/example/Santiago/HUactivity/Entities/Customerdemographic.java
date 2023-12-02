package com.example.Santiago.HUactivity.Entities;

import jakarta.persistence.*;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "customerdemographic")
public class Customerdemographic {
    @Id
    @Column(name = "customertypeid", nullable = false, length = 10)
    private String customertypeid;

    @Column(name = "customerdesc", length = Integer.MAX_VALUE)
    private String customerdesc;

    @ManyToMany(mappedBy = "customerdemographics")
    private Set<Customer> customers = new LinkedHashSet<>();

    public String getCustomertypeid() {
        return customertypeid;
    }

    public void setCustomertypeid(String customertypeid) {
        this.customertypeid = customertypeid;
    }

    public String getCustomerdesc() {
        return customerdesc;
    }

    public void setCustomerdesc(String customerdesc) {
        this.customerdesc = customerdesc;
    }

    public Set<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(Set<Customer> customers) {
        this.customers = customers;
    }

}