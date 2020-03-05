package com.isoft.slotmanagement.service.dto;

import java.time.ZonedDateTime;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

/**
 * A DTO for the {@link com.isoft.slotmanagement.domain.SlotReservationDetails} entity.
 */
public class SlotReservationDetailsDTO implements Serializable {

    private Long id;

    private BigDecimal applicantId;

    private BigDecimal status;

    private ZonedDateTime timeFrom;

    private ZonedDateTime timeTo;

    private BigDecimal requestNo;


    private Long slotId;

    private Long slotInstanceId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getApplicantId() {
        return applicantId;
    }

    public void setApplicantId(BigDecimal applicantId) {
        this.applicantId = applicantId;
    }

    public BigDecimal getStatus() {
        return status;
    }

    public void setStatus(BigDecimal status) {
        this.status = status;
    }

    public ZonedDateTime getTimeFrom() {
        return timeFrom;
    }

    public void setTimeFrom(ZonedDateTime timeFrom) {
        this.timeFrom = timeFrom;
    }

    public ZonedDateTime getTimeTo() {
        return timeTo;
    }

    public void setTimeTo(ZonedDateTime timeTo) {
        this.timeTo = timeTo;
    }

    public BigDecimal getRequestNo() {
        return requestNo;
    }

    public void setRequestNo(BigDecimal requestNo) {
        this.requestNo = requestNo;
    }

    public Long getSlotId() {
        return slotId;
    }

    public void setSlotId(Long slotInstanceId) {
        this.slotId = slotInstanceId;
    }

    public Long getSlotInstanceId() {
        return slotInstanceId;
    }

    public void setSlotInstanceId(Long slotInstanceId) {
        this.slotInstanceId = slotInstanceId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        SlotReservationDetailsDTO slotReservationDetailsDTO = (SlotReservationDetailsDTO) o;
        if (slotReservationDetailsDTO.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), slotReservationDetailsDTO.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "SlotReservationDetailsDTO{" +
            "id=" + getId() +
            ", applicantId=" + getApplicantId() +
            ", status=" + getStatus() +
            ", timeFrom='" + getTimeFrom() + "'" +
            ", timeTo='" + getTimeTo() + "'" +
            ", requestNo=" + getRequestNo() +
            ", slotId=" + getSlotId() +
            ", slotInstanceId=" + getSlotInstanceId() +
            "}";
    }
}
