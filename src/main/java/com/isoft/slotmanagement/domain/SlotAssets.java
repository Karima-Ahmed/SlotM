package com.isoft.slotmanagement.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * A SlotAssets.
 */
@Entity
@Table(name = "slot_assets")
public class SlotAssets implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    private Long id;

    @OneToMany(mappedBy = "slotAssets")
    private Set<Assets> assets = new HashSet<>();

    @ManyToOne
    @JsonIgnoreProperties("slotAssets")
    private SlotInstance slot;

    @ManyToOne
    @JsonIgnoreProperties("slotAssets")
    private SlotInstance slotInstance;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Set<Assets> getAssets() {
        return assets;
    }

    public SlotAssets assets(Set<Assets> assets) {
        this.assets = assets;
        return this;
    }

    public SlotAssets addAssets(Assets assets) {
        this.assets.add(assets);
        assets.setSlotAssets(this);
        return this;
    }

    public SlotAssets removeAssets(Assets assets) {
        this.assets.remove(assets);
        assets.setSlotAssets(null);
        return this;
    }

    public void setAssets(Set<Assets> assets) {
        this.assets = assets;
    }

    public SlotInstance getSlot() {
        return slot;
    }

    public SlotAssets slot(SlotInstance slotInstance) {
        this.slot = slotInstance;
        return this;
    }

    public void setSlot(SlotInstance slotInstance) {
        this.slot = slotInstance;
    }

    public SlotInstance getSlotInstance() {
        return slotInstance;
    }

    public SlotAssets slotInstance(SlotInstance slotInstance) {
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
        if (!(o instanceof SlotAssets)) {
            return false;
        }
        return id != null && id.equals(((SlotAssets) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    @Override
    public String toString() {
        return "SlotAssets{" +
            "id=" + getId() +
            "}";
    }
}
