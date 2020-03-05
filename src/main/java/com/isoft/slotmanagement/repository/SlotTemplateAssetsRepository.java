package com.isoft.slotmanagement.repository;

import com.isoft.slotmanagement.domain.SlotTemplateAssets;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data  repository for the SlotTemplateAssets entity.
 */
@SuppressWarnings("unused")
@Repository
public interface SlotTemplateAssetsRepository extends JpaRepository<SlotTemplateAssets, Long> {

}
