package org.nickkhub.registry.service;

import org.nickkhub.registry.dto.InstanceDto;

import java.util.List;

public interface InstanceService {
    void registerNewServiceInstance(final InstanceDto instanceDto);
    List<InstanceDto> getInstanceRegistry();
}
