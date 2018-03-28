package graduation.project.api.exception;

public abstract class AppBusinessException extends APPException {

    protected ErrorCode errorCode;

    protected int status = 200; //default 200


    public int getErrorCode() {
        return errorCode.getCode();
    }

    public AppBusinessException(String message, ErrorCode errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

    public boolean isSupportI18nCode() {
        return false;
    }

    public int getStatus() {
        return status;
    }
}
