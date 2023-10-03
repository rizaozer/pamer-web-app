package ee.pamer.controller;

import ee.pamer.model.Medicine;
import ee.pamer.service.MedicineService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/medicines")
public class MedicineController {

    @Autowired
    private MedicineService medicineService;
    
    @GetMapping
    public ResponseEntity<List<Medicine>> getAllMedicines() {
        return ResponseEntity.ok(medicineService.getAllMedicines());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Medicine> getMedicineById(@PathVariable Long id) {
        return ResponseEntity.ok(medicineService.getMedicineById(id));
    }

    @PostMapping
    public ResponseEntity<Medicine> createMedicine(@RequestBody Medicine medicine) {
        return ResponseEntity.ok(medicineService.saveOrUpdateMedicine(medicine));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Medicine> updateMedicine(@PathVariable Long id, @RequestBody Medicine medicine) {
        // Check if the medicine exists before updating
        return ResponseEntity.ok(medicineService.saveOrUpdateMedicine(medicine));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteMedicine(@PathVariable Long id) {
        medicineService.deleteMedicine(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/patient/{patientId}")
    public ResponseEntity<List<Medicine>> getMedicinesByPatientId(@PathVariable Long patientId) {
        return ResponseEntity.ok(medicineService.getMedicinesByPatientId(patientId));
    }

    // ... other controller methods
}
