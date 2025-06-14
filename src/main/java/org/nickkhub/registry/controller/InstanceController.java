package org.nickkhub.registry.controller;

import lombok.RequiredArgsConstructor;
import org.nickkhub.registry.dto.InstanceDto;
import org.nickkhub.registry.service.InstanceService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/instances")
public class InstanceController {

    private final InstanceService instanceService;

    @PostMapping
    public ResponseEntity<Void> registerNewInstance(@RequestBody InstanceDto instanceDto) {
        instanceService.registerNewServiceInstance(instanceDto);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<List<InstanceDto>> getInstanceRegistry() {
        return ResponseEntity.ok(instanceService.getInstanceRegistry());
    }
}
