package graduation.project.metadata.dto;

import graduation.project.metadata.model.Book;
import graduation.project.metadata.model.UserInfo;

import java.util.List;

public interface UserMapper {
    UserInfo createUser(UserInfo userInfo);

    UserInfo updateUser(UserInfo userInfo);

    boolean deleteUser(String userId);

    UserInfo getUserInfoByIds(String userId, String tenantId);

}
