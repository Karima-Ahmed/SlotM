package com.isoft.slotmanagement.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * A SlotFacilitators.
 */
@Entity
@Table(name = "slot_facilitators")
public class SlotFacilitators implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    private Long id;

    @Column(name = "user_id", precision = 21, scale = 2)
    private BigDecimal userId;

    @ManyToOne
    @JsonIgnoreProperties("slotFacilitators")
    private SlotInstance slot;

    @ManyToOne
    @JsonIgnoreProperties("facilitators")
    private SlotInstance slotInstance;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getUserId() {
        return userId;
    }

    public SlotFacilitators userId(BigDecimal userId) {
        this.userId = userId;
        return this;
    }

    public void setUserId(BigDecimal userId) {
        this.userId = userId;
    }

    public SlotInstance getSlot() {
        return slot;
    }

    public SlotFacilitators slot(SlotInstance slotInstance) {
        this.slot = slotInstance;
        return this;
    }

    public void setSlot(SlotInstance slotInstance) {
        this.slot = slotInstance;
    }

    public SlotInstance getSlotInstance() {
        return slotInstance;
    }

    public SlotFacilitators slotInstance(SlotInstance slotInstance) {
        this.slotInstance = slotInstance;
        return this;
    }

    public void setSlotInstance(SlotInstance slotInstance) {
        this.slotInstance = slotInstance;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SlotFacilitators)) {
            return false;
        }
        return id != null && id.equals(((SlotFacilitators) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    @Override
    public String toString() {
        return "SlotFacilitators{" +
            "id=" + getId() +
            ", userId=" + getUserId() +
            "}";
    }
}
