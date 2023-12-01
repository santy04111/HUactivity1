package Entities;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "productid", nullable = false)
    private Integer id;

    @Column(name = "productname", nullable = false, length = 40)
    private String productname;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "supplierid")
    private Supplier supplierid;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "categoryid")
    private Category categoryid;

    @Column(name = "quantityperunit", length = 20)
    private String quantityperunit;

    @Column(name = "unitprice", precision = 10, scale = 2)
    private BigDecimal unitprice;

    @Column(name = "unitsinstock")
    private Short unitsinstock;

    @Column(name = "unitsonorder")
    private Short unitsonorder;

    @Column(name = "reorderlevel")
    private Short reorderlevel;

    @Column(name = "discontinued", nullable = false, length = Integer.MAX_VALUE)
    private String discontinued;

    @OneToMany(mappedBy = "productid")
    private Set<Orderdetail> orderdetails = new LinkedHashSet<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public Supplier getSupplierid() {
        return supplierid;
    }

    public void setSupplierid(Supplier supplierid) {
        this.supplierid = supplierid;
    }

    public Category getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(Category categoryid) {
        this.categoryid = categoryid;
    }

    public String getQuantityperunit() {
        return quantityperunit;
    }

    public void setQuantityperunit(String quantityperunit) {
        this.quantityperunit = quantityperunit;
    }

    public BigDecimal getUnitprice() {
        return unitprice;
    }

    public void setUnitprice(BigDecimal unitprice) {
        this.unitprice = unitprice;
    }

    public Short getUnitsinstock() {
        return unitsinstock;
    }

    public void setUnitsinstock(Short unitsinstock) {
        this.unitsinstock = unitsinstock;
    }

    public Short getUnitsonorder() {
        return unitsonorder;
    }

    public void setUnitsonorder(Short unitsonorder) {
        this.unitsonorder = unitsonorder;
    }

    public Short getReorderlevel() {
        return reorderlevel;
    }

    public void setReorderlevel(Short reorderlevel) {
        this.reorderlevel = reorderlevel;
    }

    public String getDiscontinued() {
        return discontinued;
    }

    public void setDiscontinued(String discontinued) {
        this.discontinued = discontinued;
    }

    public Set<Orderdetail> getOrderdetails() {
        return orderdetails;
    }

    public void setOrderdetails(Set<Orderdetail> orderdetails) {
        this.orderdetails = orderdetails;
    }

}