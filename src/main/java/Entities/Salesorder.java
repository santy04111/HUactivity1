package Entities;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "salesorder")
public class Salesorder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "orderid", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "custid")
    private Customer custid;

    @Column(name = "empid")
    private Integer empid;

    @Column(name = "orderdate")
    private Instant orderdate;

    @Column(name = "requireddate")
    private Instant requireddate;

    @Column(name = "shippeddate")
    private Instant shippeddate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "shipperid")
    private Shipper shipperid;

    @Column(name = "freight", precision = 10, scale = 2)
    private BigDecimal freight;

    @Column(name = "shipname", length = 40)
    private String shipname;

    @Column(name = "shipaddress", length = 60)
    private String shipaddress;

    @Column(name = "shipcity", length = 15)
    private String shipcity;

    @Column(name = "shipregion", length = 15)
    private String shipregion;

    @Column(name = "shippostalcode", length = 10)
    private String shippostalcode;

    @Column(name = "shipcountry", length = 15)
    private String shipcountry;

    @OneToMany(mappedBy = "orderid")
    private Set<Orderdetail> orderdetails = new LinkedHashSet<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Customer getCustid() {
        return custid;
    }

    public void setCustid(Customer custid) {
        this.custid = custid;
    }

    public Integer getEmpid() {
        return empid;
    }

    public void setEmpid(Integer empid) {
        this.empid = empid;
    }

    public Instant getOrderdate() {
        return orderdate;
    }

    public void setOrderdate(Instant orderdate) {
        this.orderdate = orderdate;
    }

    public Instant getRequireddate() {
        return requireddate;
    }

    public void setRequireddate(Instant requireddate) {
        this.requireddate = requireddate;
    }

    public Instant getShippeddate() {
        return shippeddate;
    }

    public void setShippeddate(Instant shippeddate) {
        this.shippeddate = shippeddate;
    }

    public Shipper getShipperid() {
        return shipperid;
    }

    public void setShipperid(Shipper shipperid) {
        this.shipperid = shipperid;
    }

    public BigDecimal getFreight() {
        return freight;
    }

    public void setFreight(BigDecimal freight) {
        this.freight = freight;
    }

    public String getShipname() {
        return shipname;
    }

    public void setShipname(String shipname) {
        this.shipname = shipname;
    }

    public String getShipaddress() {
        return shipaddress;
    }

    public void setShipaddress(String shipaddress) {
        this.shipaddress = shipaddress;
    }

    public String getShipcity() {
        return shipcity;
    }

    public void setShipcity(String shipcity) {
        this.shipcity = shipcity;
    }

    public String getShipregion() {
        return shipregion;
    }

    public void setShipregion(String shipregion) {
        this.shipregion = shipregion;
    }

    public String getShippostalcode() {
        return shippostalcode;
    }

    public void setShippostalcode(String shippostalcode) {
        this.shippostalcode = shippostalcode;
    }

    public String getShipcountry() {
        return shipcountry;
    }

    public void setShipcountry(String shipcountry) {
        this.shipcountry = shipcountry;
    }

    public Set<Orderdetail> getOrderdetails() {
        return orderdetails;
    }

    public void setOrderdetails(Set<Orderdetail> orderdetails) {
        this.orderdetails = orderdetails;
    }

}