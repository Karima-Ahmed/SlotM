package com.isoft.slotmanagement.repository;

import com.isoft.slotmanagement.domain.SlotTemplateFacilitators;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data  repository for the SlotTemplateFacilitators entity.
 */
@SuppressWarnings("unused")
@Repository
public interface SlotTemplateFacilitatorsRepository extends JpaRepository<SlotTemplateFacilitators, Long> {

}
