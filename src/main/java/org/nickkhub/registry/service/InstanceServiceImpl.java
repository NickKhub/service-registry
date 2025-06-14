package org.nickkhub.registry.service;

import org.nickkhub.registry.dto.InstanceDto;
import org.nickkhub.registry.model.Instance;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class InstanceServiceImpl implements InstanceService {

    private final List<Instance> serviceRegistry = new ArrayList<>();

    @Override
    public void registerNewServiceInstance(final InstanceDto instanceDto) {
        serviceRegistry.add(new Instance(instanceDto.getIpAddress()));
    }

    @Override
    public List<InstanceDto> getInstanceRegistry() {
        return serviceRegistry.stream()
                .map(instance -> new InstanceDto(instance.getIpAddress()))
                .collect(Collectors.toList());
    }
}
