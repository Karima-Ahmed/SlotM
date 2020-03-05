package com.isoft.slotmanagement.service.mapper;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SlotTemplateFacilitatorsMapperTest {

    private SlotTemplateFacilitatorsMapper slotTemplateFacilitatorsMapper;

    @BeforeEach
    public void setUp() {
        slotTemplateFacilitatorsMapper = new SlotTemplateFacilitatorsMapperImpl();
    }

    @Test
    public void testEntityFromId() {
        Long id = 1L;
        assertThat(slotTemplateFacilitatorsMapper.fromId(id).getId()).isEqualTo(id);
        assertThat(slotTemplateFacilitatorsMapper.fromId(null)).isNull();
    }
}
