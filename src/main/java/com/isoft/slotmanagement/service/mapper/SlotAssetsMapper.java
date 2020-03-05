package com.isoft.slotmanagement.service.mapper;


import com.isoft.slotmanagement.domain.*;
import com.isoft.slotmanagement.service.dto.SlotAssetsDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity {@link SlotAssets} and its DTO {@link SlotAssetsDTO}.
 */
@Mapper(componentModel = "spring", uses = {SlotInstanceMapper.class})
public interface SlotAssetsMapper extends EntityMapper<SlotAssetsDTO, SlotAssets> {

    @Mapping(source = "slot.id", target = "slotId")
    @Mapping(source = "slotInstance.id", target = "slotInstanceId")
    SlotAssetsDTO toDto(SlotAssets slotAssets);

    @Mapping(target = "assets", ignore = true)
    @Mapping(target = "removeAssets", ignore = true)
    @Mapping(source = "slotId", target = "slot")
    @Mapping(source = "slotInstanceId", target = "slotInstance")
    SlotAssets toEntity(SlotAssetsDTO slotAssetsDTO);

    default SlotAssets fromId(Long id) {
        if (id == null) {
            return null;
        }
        SlotAssets slotAssets = new SlotAssets();
        slotAssets.setId(id);
        return slotAssets;
    }
}
