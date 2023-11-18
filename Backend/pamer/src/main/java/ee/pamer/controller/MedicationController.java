package ee.pamer.controller;

import ee.pamer.exception.MedicationException;
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
        try {
            return medicationRepository.findAll();
        } catch (Exception e) {
            throw new MedicationException("Error retrieving medications", e);
        }
    }

    @PostMapping
    public Medication addMedication(@RequestBody Medication medication) {
        try {
            return medicationRepository.save(medication);
        } catch (Exception e) {
            throw new MedicationException("Error saving medication", e);
        }
    }
}
