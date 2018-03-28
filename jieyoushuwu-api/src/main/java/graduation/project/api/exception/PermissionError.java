package graduation.project.api.exception;

public class PermissionError extends AppBusinessException {
    public PermissionError(String message) {
        super(message, AppFrameworkErrorCode.NO_PERMISSION);
    }

}
