package ee.pamer.model;

import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

@Entity
public class Medicine {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String dosage;
    private String frequency;
    
    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;
    
    // Getters, setters, and other methods
}
