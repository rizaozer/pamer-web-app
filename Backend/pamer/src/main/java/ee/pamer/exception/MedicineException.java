package ee.pamer.exception;

public class MedicineException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public MedicineException(String message) {
        super(message);
    }

    public MedicineException(String message, Throwable cause) {
        super(message, cause);
    }
}
