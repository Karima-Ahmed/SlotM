package com.isoft.slotmanagement.service;

import com.isoft.slotmanagement.domain.SlotInstance;
import com.isoft.slotmanagement.repository.SlotInstanceRepository;
import com.isoft.slotmanagement.service.dto.SlotInstanceDTO;
import com.isoft.slotmanagement.service.mapper.SlotInstanceMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Service Implementation for managing {@link SlotInstance}.
 */
@Service
@Transactional
public class SlotInstanceService {

    private final Logger log = LoggerFactory.getLogger(SlotInstanceService.class);

    private final SlotInstanceRepository slotInstanceRepository;

    private final SlotInstanceMapper slotInstanceMapper;

    public SlotInstanceService(SlotInstanceRepository slotInstanceRepository, SlotInstanceMapper slotInstanceMapper) {
        this.slotInstanceRepository = slotInstanceRepository;
        this.slotInstanceMapper = slotInstanceMapper;
    }

    /**
     * Save a slotInstance.
     *
     * @param slotInstanceDTO the entity to save.
     * @return the persisted entity.
     */
    public SlotInstanceDTO save(SlotInstanceDTO slotInstanceDTO) {
        log.debug("Request to save SlotInstance : {}", slotInstanceDTO);
        SlotInstance slotInstance = slotInstanceMapper.toEntity(slotInstanceDTO);
        slotInstance = slotInstanceRepository.save(slotInstance);
        return slotInstanceMapper.toDto(slotInstance);
    }

    /**
     * Get all the slotInstances.
     *
     * @return the list of entities.
     */
    @Transactional(readOnly = true)
    public List<SlotInstanceDTO> findAll() {
        log.debug("Request to get all SlotInstances");
        return slotInstanceRepository.findAll().stream()
            .map(slotInstanceMapper::toDto)
            .collect(Collectors.toCollection(LinkedList::new));
    }

    /**
     * Get one slotInstance by id.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    @Transactional(readOnly = true)
    public Optional<SlotInstanceDTO> findOne(Long id) {
        log.debug("Request to get SlotInstance : {}", id);
        return slotInstanceRepository.findById(id)
            .map(slotInstanceMapper::toDto);
    }

    /**
     * Delete the slotInstance by id.
     *
     * @param id the id of the entity.
     */
    public void delete(Long id) {
        log.debug("Request to delete SlotInstance : {}", id);
        slotInstanceRepository.deleteById(id);
    }
}
