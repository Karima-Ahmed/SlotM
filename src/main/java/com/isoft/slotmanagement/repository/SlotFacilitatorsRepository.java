package com.isoft.slotmanagement.repository;

import com.isoft.slotmanagement.domain.SlotFacilitators;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data  repository for the SlotFacilitators entity.
 */
@SuppressWarnings("unused")
@Repository
public interface SlotFacilitatorsRepository extends JpaRepository<SlotFacilitators, Long> {

}
