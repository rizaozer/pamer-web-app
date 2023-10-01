package ee.pamer.controller;

import ee.pamer.model.Medication;
import ee.pamer.repository.MedicationRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/medications")
public class MedicationController {

    private final MedicationRepository medicationRepository;

    public MedicationController(MedicationRepository medicationRepository) {
        this.medicationRepository = medicationRepository;
    }

    @GetMapping
    public List<Medication> getAllMedications() {
        return medicationRepository.findAll();
    }

    @PostMapping
    public Medication addMedication(@RequestBody Medication medication) {
        // Add validation and business logic as needed
        return medicationRepository.save(medication);
    }

    // Implement other CRUD operations and endpoints as needed
}