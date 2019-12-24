package exception;

/**
 * Created by Piotr on 2019-12-17
 */
public class UserAlreadyExistsException extends RuntimeException {
    public UserAlreadyExistsException(String message) {
        super(message);
    }
}
