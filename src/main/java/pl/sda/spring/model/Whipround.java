package pl.sda.spring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
public class Whipround {

    @Id
    @GeneratedValue(generator = "whipSeq")
    @SequenceGenerator(name = "whipSeq", sequenceName = "whip_seq", allocationSize = 1)

    private Long id;

    private String description;

    private BigDecimal goal;
    public Whipround(BigDecimal goal, String description) {
        this.goal = goal;
        this.description = description;
    }

    public Whipround() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getGoal() {
        return goal;
    }

    public void setGoal(BigDecimal goal) {
        this.goal = goal;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Whipround)) return false;
        Whipround whipround = (Whipround) o;
        return Objects.equals(getId(), whipround.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return "Whipround{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", goal=" + goal +
                '}';
    }
}
