package ee.pamer.exception;

public class MedicationException extends RuntimeException {
    
    private static final long serialVersionUID = 1L;

    public MedicationException(String message) {
        super(message);
    }

    public MedicationException(String message, Throwable cause) {
        super(message, cause);
    }
}
