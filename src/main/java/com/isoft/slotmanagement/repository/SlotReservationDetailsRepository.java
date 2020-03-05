package com.isoft.slotmanagement.repository;

import com.isoft.slotmanagement.domain.SlotReservationDetails;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data  repository for the SlotReservationDetails entity.
 */
@SuppressWarnings("unused")
@Repository
public interface SlotReservationDetailsRepository extends JpaRepository<SlotReservationDetails, Long> {

}
