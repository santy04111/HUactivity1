package com.example.Santiago.HUactivity.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class CustomercustomerdemographicId implements Serializable {
    private static final long serialVersionUID = -1871072819212612209L;
    @Column(name = "customerid", nullable = false, length = 5)
    private String customerid;

    @Column(name = "customertypeid", nullable = false, length = 10)
    private String customertypeid;

    public String getCustomerid() {
        return customerid;
    }

    public void setCustomerid(String customerid) {
        this.customerid = customerid;
    }

    public String getCustomertypeid() {
        return customertypeid;
    }

    public void setCustomertypeid(String customertypeid) {
        this.customertypeid = customertypeid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        CustomercustomerdemographicId entity = (CustomercustomerdemographicId) o;
        return Objects.equals(this.customerid, entity.customerid) &&
                Objects.equals(this.customertypeid, entity.customertypeid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerid, customertypeid);
    }

}