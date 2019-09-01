package pl.sda.spring.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
public class Donation {

    @Id
    @GeneratedValue(generator = "donationSeq")
    @SequenceGenerator(name = "donationSeq", sequenceName = "donation_seq", allocationSize = 1)
    private Long id;
    @ManyToOne (targetEntity = Whipround.class)
    private Whipround whipround;
    private BigDecimal amount;

    @Embedded
    private User user;

    public Donation() {
    }

    public Donation(Whipround whipround, BigDecimal amount) {
        this.whipround = whipround;
        this.amount = amount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Whipround getWhipround() {
        return whipround;
    }

    public void setWhipround(Whipround whipround) {
        this.whipround = whipround;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Donation)) return false;
        Donation donation = (Donation) o;
        return Objects.equals(getId(), donation.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
