package ee.pamer.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Data;
import org.springframework.data.annotation.Id;
import java.util.Date;
import java.util.List;

@Entity
@Data
public class Medication {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String dosage;
    private Date startDate;
    private Date endDate;
    private List<Medicine> medications;
    private Patient patient;
    // Add more fields as needed
}