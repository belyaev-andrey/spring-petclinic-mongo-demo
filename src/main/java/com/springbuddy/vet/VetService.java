package com.springbuddy.vet;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class VetService {

    private final VetRepository vetRepository;

    public Vet findVetOnDuty() {
        return vetRepository.findAll().stream().findAny().orElseThrow();
    }
}
