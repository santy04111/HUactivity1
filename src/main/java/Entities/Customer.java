package Entities;

import jakarta.persistence.*;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @Column(name = "custid", nullable = false, length = 15)
    private String custid;

    @Column(name = "companyname", nullable = false, length = 40)
    private String companyname;

    @Column(name = "contactname", length = 30)
    private String contactname;

    @Column(name = "contacttitle", length = 30)
    private String contacttitle;

    @Column(name = "address", length = 60)
    private String address;

    @Column(name = "city", length = 15)
    private String city;

    @Column(name = "region", length = 15)
    private String region;

    @Column(name = "postalcode", length = 10)
    private String postalcode;

    @Column(name = "country", length = 15)
    private String country;

    @Column(name = "phone", length = 24)
    private String phone;

    @Column(name = "fax", length = 24)
    private String fax;

    @ManyToMany
    @JoinTable(name = "customercustomerdemographic",
            joinColumns = @JoinColumn(name = "customerid"),
            inverseJoinColumns = @JoinColumn(name = "customertypeid"))
    private Set<Customerdemographic> customerdemographics = new LinkedHashSet<>();

    @OneToMany(mappedBy = "custid")
    private Set<Salesorder> salesorders = new LinkedHashSet<>();

    public String getCustid() {
        return custid;
    }

    public void setCustid(String custid) {
        this.custid = custid;
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }

    public String getContactname() {
        return contactname;
    }

    public void setContactname(String contactname) {
        this.contactname = contactname;
    }

    public String getContacttitle() {
        return contacttitle;
    }

    public void setContacttitle(String contacttitle) {
        this.contacttitle = contacttitle;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getPostalcode() {
        return postalcode;
    }

    public void setPostalcode(String postalcode) {
        this.postalcode = postalcode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public Set<Customerdemographic> getCustomerdemographics() {
        return customerdemographics;
    }

    public void setCustomerdemographics(Set<Customerdemographic> customerdemographics) {
        this.customerdemographics = customerdemographics;
    }

    public Set<Salesorder> getSalesorders() {
        return salesorders;
    }

    public void setSalesorders(Set<Salesorder> salesorders) {
        this.salesorders = salesorders;
    }

}