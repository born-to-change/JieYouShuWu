package graduation.project.api.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.Delegate;
import org.apache.tomcat.util.http.fileupload.RequestContext;

@AllArgsConstructor
@Getter
public class ActionContext {
    @Delegate
    private final RequestContext requestContext;
    private final String objectApiName;
    private final String actionCode;

}
