package com.isoft.slotmanagement.service.mapper;


import com.isoft.slotmanagement.domain.*;
import com.isoft.slotmanagement.service.dto.SlotTemplateFacilitatorsDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity {@link SlotTemplateFacilitators} and its DTO {@link SlotTemplateFacilitatorsDTO}.
 */
@Mapper(componentModel = "spring", uses = {SlotTemplateMapper.class})
public interface SlotTemplateFacilitatorsMapper extends EntityMapper<SlotTemplateFacilitatorsDTO, SlotTemplateFacilitators> {

    @Mapping(source = "slotTemp.id", target = "slotTempId")
    @Mapping(source = "slotTemplate.id", target = "slotTemplateId")
    SlotTemplateFacilitatorsDTO toDto(SlotTemplateFacilitators slotTemplateFacilitators);

    @Mapping(source = "slotTempId", target = "slotTemp")
    @Mapping(source = "slotTemplateId", target = "slotTemplate")
    SlotTemplateFacilitators toEntity(SlotTemplateFacilitatorsDTO slotTemplateFacilitatorsDTO);

    default SlotTemplateFacilitators fromId(Long id) {
        if (id == null) {
            return null;
        }
        SlotTemplateFacilitators slotTemplateFacilitators = new SlotTemplateFacilitators();
        slotTemplateFacilitators.setId(id);
        return slotTemplateFacilitators;
    }
}
