package com.isoft.slotmanagement.service.mapper;


import com.isoft.slotmanagement.domain.*;
import com.isoft.slotmanagement.service.dto.SlotInstanceDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity {@link SlotInstance} and its DTO {@link SlotInstanceDTO}.
 */
@Mapper(componentModel = "spring", uses = {SlotTemplateMapper.class})
public interface SlotInstanceMapper extends EntityMapper<SlotInstanceDTO, SlotInstance> {

    @Mapping(source = "temp.id", target = "tempId")
    @Mapping(source = "slotTemplate.id", target = "slotTemplateId")
    SlotInstanceDTO toDto(SlotInstance slotInstance);

    @Mapping(target = "facilitators", ignore = true)
    @Mapping(target = "removeFacilitators", ignore = true)
    @Mapping(target = "assets", ignore = true)
    @Mapping(target = "removeAssets", ignore = true)
    @Mapping(target = "slotReservations", ignore = true)
    @Mapping(target = "removeSlotReservations", ignore = true)
    @Mapping(source = "tempId", target = "temp")
    @Mapping(source = "slotTemplateId", target = "slotTemplate")
    SlotInstance toEntity(SlotInstanceDTO slotInstanceDTO);

    default SlotInstance fromId(Long id) {
        if (id == null) {
            return null;
        }
        SlotInstance slotInstance = new SlotInstance();
        slotInstance.setId(id);
        return slotInstance;
    }
}
