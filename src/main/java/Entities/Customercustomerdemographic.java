package Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "customercustomerdemographic")
public class Customercustomerdemographic {
    @EmbeddedId
    private CustomercustomerdemographicId id;

    @MapsId("customerid")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "customerid", nullable = false)
    private Customer customerid;

    @MapsId("customertypeid")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "customertypeid", nullable = false)
    private Customerdemographic customertypeid;

    public CustomercustomerdemographicId getId() {
        return id;
    }

    public void setId(CustomercustomerdemographicId id) {
        this.id = id;
    }

    public Customer getCustomerid() {
        return customerid;
    }

    public void setCustomerid(Customer customerid) {
        this.customerid = customerid;
    }

    public Customerdemographic getCustomertypeid() {
        return customertypeid;
    }

    public void setCustomertypeid(Customerdemographic customertypeid) {
        this.customertypeid = customertypeid;
    }

}