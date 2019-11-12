package exception;

/**
 * Created by Piotr on 2019-11-12
 */
public class NoSuchFileTypeException extends RuntimeException {
    public NoSuchFileTypeException(String message) {
        super(message);
    }
}
