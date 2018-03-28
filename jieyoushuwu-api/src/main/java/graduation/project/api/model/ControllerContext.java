package graduation.project.api.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.Delegate;

@AllArgsConstructor
@Getter
public class ControllerContext {
    @Delegate
    private final RequestContext requestContext;
    private final String objectApiName;
    private final String methodName;
}