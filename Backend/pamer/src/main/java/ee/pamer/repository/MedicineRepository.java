package ee.pamer.repository;

@Repository
public interface MedicineRepository extends JpaRepository<Medicine, Long> {
    
    List<Medicine> findByPatientId(Long patientId);
    
    // You can define other custom query methods if required
}
