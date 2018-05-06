package graduation.project.metadata.model;
import lombok.Data;
import lombok.NonNull;

@Data
public class UserInfo {
    @NonNull
    private final String telephone;
    @NonNull
    private String password;
    @NonNull
    private final  String token;
    @NonNull
    private final String userId;
    @NonNull
    private final String storeId;

    private String userName;
    private String address;
    private String userImage;
    private String studentNo;

}
