package ee.pamer.model;

import jakarta.persistence.*;
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
    @ManyToMany
    private List<Medicine> medications;
    @OneToOne
    private Patient patient;
}