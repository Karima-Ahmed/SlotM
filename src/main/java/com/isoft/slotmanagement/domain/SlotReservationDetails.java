package com.isoft.slotmanagement.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.ZonedDateTime;

/**
 * A SlotReservationDetails.
 */
@Entity
@Table(name = "slot_reservation_details")
public class SlotReservationDetails implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    private Long id;

    @Column(name = "applicant_id", precision = 21, scale = 2)
    private BigDecimal applicantId;

    @Column(name = "status", precision = 21, scale = 2)
    private BigDecimal status;

    @Column(name = "time_from")
    private ZonedDateTime timeFrom;

    @Column(name = "time_to")
    private ZonedDateTime timeTo;

    @Column(name = "request_no", precision = 21, scale = 2)
    private BigDecimal requestNo;

    @ManyToOne
    @JsonIgnoreProperties("slotReservationDetails")
    private SlotInstance slot;

    @ManyToOne
    @JsonIgnoreProperties("slotReservations")
    private SlotInstance slotInstance;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getApplicantId() {
        return applicantId;
    }

    public SlotReservationDetails applicantId(BigDecimal applicantId) {
        this.applicantId = applicantId;
        return this;
    }

    public void setApplicantId(BigDecimal applicantId) {
        this.applicantId = applicantId;
    }

    public BigDecimal getStatus() {
        return status;
    }

    public SlotReservationDetails status(BigDecimal status) {
        this.status = status;
        return this;
    }

    public void setStatus(BigDecimal status) {
        this.status = status;
    }

    public ZonedDateTime getTimeFrom() {
        return timeFrom;
    }

    public SlotReservationDetails timeFrom(ZonedDateTime timeFrom) {
        this.timeFrom = timeFrom;
        return this;
    }

    public void setTimeFrom(ZonedDateTime timeFrom) {
        this.timeFrom = timeFrom;
    }

    public ZonedDateTime getTimeTo() {
        return timeTo;
    }

    public SlotReservationDetails timeTo(ZonedDateTime timeTo) {
        this.timeTo = timeTo;
        return this;
    }

    public void setTimeTo(ZonedDateTime timeTo) {
        this.timeTo = timeTo;
    }

    public BigDecimal getRequestNo() {
        return requestNo;
    }

    public SlotReservationDetails requestNo(BigDecimal requestNo) {
        this.requestNo = requestNo;
        return this;
    }

    public void setRequestNo(BigDecimal requestNo) {
        this.requestNo = requestNo;
    }

    public SlotInstance getSlot() {
        return slot;
    }

    public SlotReservationDetails slot(SlotInstance slotInstance) {
        this.slot = slotInstance;
        return this;
    }

    public void setSlot(SlotInstance slotInstance) {
        this.slot = slotInstance;
    }

    public SlotInstance getSlotInstance() {
        return slotInstance;
    }

    public SlotReservationDetails slotInstance(SlotInstance slotInstance) {
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
        if (!(o instanceof SlotReservationDetails)) {
            return false;
        }
        return id != null && id.equals(((SlotReservationDetails) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    @Override
    public String toString() {
        return "SlotReservationDetails{" +
            "id=" + getId() +
            ", applicantId=" + getApplicantId() +
            ", status=" + getStatus() +
            ", timeFrom='" + getTimeFrom() + "'" +
            ", timeTo='" + getTimeTo() + "'" +
            ", requestNo=" + getRequestNo() +
            "}";
    }
}
