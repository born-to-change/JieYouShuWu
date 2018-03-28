package graduation.project.api.exception;

public class APPException extends RuntimeException {

    public APPException(String message) {
        super(message);
    }

    public APPException(String message, Throwable cause) {
        super(message, cause);
    }
}
