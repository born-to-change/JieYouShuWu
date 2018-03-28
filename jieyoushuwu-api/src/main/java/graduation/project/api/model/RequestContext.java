package graduation.project.api.model;

import com.google.common.base.Splitter;
import com.google.common.collect.Maps;
import graduation.project.api.exception.PermissionError;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.util.Map;
import java.util.Objects;
import java.util.Optional;

@Builder
@Getter
@ToString
public class RequestContext {
    /**
     * 请求代表的租户
     */
    private final String tenantId;

    /**
     * 请求上下文中的认证用户，不是所有请求中都有认证用户
     */
    private final Optional<User> user;

    /**
     * 请求内容格式
     */
    private final ContentType contentType;

    /**
     * 请求ID用于请求去重
     */
    private String postId;

    /**
     * 终端类型及版本信息
     */
    private String clientInfo;

    private Map<Object, Object> attributes = Maps.newHashMap();

    /**
     * 请求来源，处理异常的时候用来区分返回数据的格式
     */
    private RequestSource requestSource;

    public <V> V getAttribute(Object key) {
        return (V) attributes.get(key);
    }

    public void setAttribute(Object key, Object value) {
        attributes.put(key, value);
    }

    public User getUser() {
        return user.orElseThrow(() -> new PermissionError("无认证用户"));
    }

    public static final String CLIENT_INFO = "client_info";

    public static final String Android_CLIENT_INFO_PREFIX = "Android";

    public static final String IOS_CLIENT_INFO_PREFIX = "iOS";

    public enum ContentType {
        SIMPLE_JSON,
        FULL_JSON;

        public static ContentType getType(String contentType) {
            String formatted = Splitter.on(';').trimResults().splitToList(contentType).get(0).toLowerCase();
            ContentType type = map.get(formatted);
            return Objects.nonNull(type) ? type : FULL_JSON;
        }

        private static Map<String, ContentType> map = Maps.newHashMap();

        static {
            map.put("application/json", FULL_JSON);
            map.put("application/vnd.fs+json", SIMPLE_JSON);
            map.put("application/simplejson", SIMPLE_JSON);
        }
    }

    public enum RequestSource {
        CEP, INNER;
    }
}
