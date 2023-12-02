package com.example.Santiago.HUactivity.Entities;

import jakarta.persistence.*;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "shipper")
public class Shipper {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "shipperid", nullable = false)
    private Integer id;

    @Column(name = "companyname", nullable = false, length = 40)
    private String companyname;

    @Column(name = "phone", length = 44)
    private String phone;

    @OneToMany(mappedBy = "shipperid")
    private Set<Salesorder> salesorders = new LinkedHashSet<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Set<Salesorder> getSalesorders() {
        return salesorders;
    }

    public void setSalesorders(Set<Salesorder> salesorders) {
        this.salesorders = salesorders;
    }

}