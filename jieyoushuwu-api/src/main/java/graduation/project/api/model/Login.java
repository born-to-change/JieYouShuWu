package graduation.project.api.model;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@Getter
public class Login {
    @NonNull
    private String phoneNumber;
    @NonNull
    private String passWord;


}
