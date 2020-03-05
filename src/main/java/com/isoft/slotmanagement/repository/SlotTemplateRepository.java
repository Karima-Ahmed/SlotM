package com.isoft.slotmanagement.repository;

import com.isoft.slotmanagement.domain.SlotTemplate;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data  repository for the SlotTemplate entity.
 */
@SuppressWarnings("unused")
@Repository
public interface SlotTemplateRepository extends JpaRepository<SlotTemplate, Long> {

}
