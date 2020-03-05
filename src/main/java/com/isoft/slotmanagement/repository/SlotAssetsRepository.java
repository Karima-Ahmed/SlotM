package com.isoft.slotmanagement.repository;

import com.isoft.slotmanagement.domain.SlotAssets;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data  repository for the SlotAssets entity.
 */
@SuppressWarnings("unused")
@Repository
public interface SlotAssetsRepository extends JpaRepository<SlotAssets, Long> {

}
