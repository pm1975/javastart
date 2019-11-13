package exception;

/**
 * Created by Piotr on 2019-11-12
 */
public class InvalidDataException extends RuntimeException {
    public InvalidDataException(String message) {
        super(message);
    }
}
