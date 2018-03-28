package graduation.project.api.exception;

public enum AppFrameworkErrorCode implements ErrorCode {

    NO_PERMISSION           (320_001_400),
    VALIDATION_ERROR        (320_001_401),
    ClASS_LOAD_ERROR        (320_001_500),

    META_DATA_ERROR         (320_002_500),
    LICENSE_ERROR           (320_003_500),
    APPROVAL_ERROR          (320_004_500),
    PAYMENT_ERROR           (320_005_500),
    RECORD_TYPE_ERROR       (320_006_500),
    SIGN_IN_OUT_ERROR       (320_007_500),
    UNLOCK_ERROR            (320_008_500),
    APPROVAL_FILTER_ERROR   (320_009_500)
    ;
    AppFrameworkErrorCode(int code) {
        this.code = code;
    }

    int code;

    public int getCode() {
        return code;
    }

}
