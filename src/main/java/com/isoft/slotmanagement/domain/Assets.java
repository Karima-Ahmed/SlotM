package com.isoft.slotmanagement.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * A Assets.
 */
@Entity
@Table(name = "assets")
public class Assets implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    private Long id;

    @Column(name = "type", precision = 21, scale = 2)
    private BigDecimal type;

    @Column(name = "center_id", precision = 21, scale = 2)
    private BigDecimal centerId;

    @Column(name = "ref_id", precision = 21, scale = 2)
    private BigDecimal refId;

    @ManyToOne
    @JsonIgnoreProperties("assets")
    private SlotAssets slotAsset;

    @ManyToOne
    @JsonIgnoreProperties("assets")
    private SlotAssets slotAssets;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getType() {
        return type;
    }

    public Assets type(BigDecimal type) {
        this.type = type;
        return this;
    }

    public void setType(BigDecimal type) {
        this.type = type;
    }

    public BigDecimal getCenterId() {
        return centerId;
    }

    public Assets centerId(BigDecimal centerId) {
        this.centerId = centerId;
        return this;
    }

    public void setCenterId(BigDecimal centerId) {
        this.centerId = centerId;
    }

    public BigDecimal getRefId() {
        return refId;
    }

    public Assets refId(BigDecimal refId) {
        this.refId = refId;
        return this;
    }

    public void setRefId(BigDecimal refId) {
        this.refId = refId;
    }

    public SlotAssets getSlotAsset() {
        return slotAsset;
    }

    public Assets slotAsset(SlotAssets slotAssets) {
        this.slotAsset = slotAssets;
        return this;
    }

    public void setSlotAsset(SlotAssets slotAssets) {
        this.slotAsset = slotAssets;
    }

    public SlotAssets getSlotAssets() {
        return slotAssets;
    }

    public Assets slotAssets(SlotAssets slotAssets) {
        this.slotAssets = slotAssets;
        return this;
    }

    public void setSlotAssets(SlotAssets slotAssets) {
        this.slotAssets = slotAssets;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Assets)) {
            return false;
        }
        return id != null && id.equals(((Assets) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    @Override
    public String toString() {
        return "Assets{" +
            "id=" + getId() +
            ", type=" + getType() +
            ", centerId=" + getCenterId() +
            ", refId=" + getRefId() +
            "}";
    }
}
