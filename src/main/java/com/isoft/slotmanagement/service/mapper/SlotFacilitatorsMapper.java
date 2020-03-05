package com.isoft.slotmanagement.service.mapper;


import com.isoft.slotmanagement.domain.*;
import com.isoft.slotmanagement.service.dto.SlotFacilitatorsDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity {@link SlotFacilitators} and its DTO {@link SlotFacilitatorsDTO}.
 */
@Mapper(componentModel = "spring", uses = {SlotInstanceMapper.class})
public interface SlotFacilitatorsMapper extends EntityMapper<SlotFacilitatorsDTO, SlotFacilitators> {

    @Mapping(source = "slot.id", target = "slotId")
    @Mapping(source = "slotInstance.id", target = "slotInstanceId")
    SlotFacilitatorsDTO toDto(SlotFacilitators slotFacilitators);

    @Mapping(source = "slotId", target = "slot")
    @Mapping(source = "slotInstanceId", target = "slotInstance")
    SlotFacilitators toEntity(SlotFacilitatorsDTO slotFacilitatorsDTO);

    default SlotFacilitators fromId(Long id) {
        if (id == null) {
            return null;
        }
        SlotFacilitators slotFacilitators = new SlotFacilitators();
        slotFacilitators.setId(id);
        return slotFacilitators;
    }
}
