package graduation.project.api.model;
import com.alibaba.fastjson.annotation.JSONField;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@Getter
public class User {
    @NonNull
    @JSONField(name = "phoneNumber")
    private final String phoneNumber;
    @NonNull
    private final String userId;
    @NonNull
    private  final String sex;

    @Setter
    private String userName;

    private String dormitory;






}
