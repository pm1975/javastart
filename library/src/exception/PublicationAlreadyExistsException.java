package exception;

/**
 * Created by Piotr on 2019-12-17
 */
public class PublicationAlreadyExistsException extends RuntimeException {
    public PublicationAlreadyExistsException(String message) {
        super(message);
    }
}
