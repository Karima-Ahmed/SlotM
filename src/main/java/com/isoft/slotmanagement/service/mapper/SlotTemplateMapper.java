package com.isoft.slotmanagement.service.mapper;


import com.isoft.slotmanagement.domain.*;
import com.isoft.slotmanagement.service.dto.SlotTemplateDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity {@link SlotTemplate} and its DTO {@link SlotTemplateDTO}.
 */
@Mapper(componentModel = "spring", uses = {})
public interface SlotTemplateMapper extends EntityMapper<SlotTemplateDTO, SlotTemplate> {


    @Mapping(target = "tempAssets", ignore = true)
    @Mapping(target = "removeTempAssets", ignore = true)
    @Mapping(target = "tempFacilitators", ignore = true)
    @Mapping(target = "removeTempFacilitators", ignore = true)
    @Mapping(target = "slots", ignore = true)
    @Mapping(target = "removeSlots", ignore = true)
    SlotTemplate toEntity(SlotTemplateDTO slotTemplateDTO);

    default SlotTemplate fromId(Long id) {
        if (id == null) {
            return null;
        }
        SlotTemplate slotTemplate = new SlotTemplate();
        slotTemplate.setId(id);
        return slotTemplate;
    }
}
