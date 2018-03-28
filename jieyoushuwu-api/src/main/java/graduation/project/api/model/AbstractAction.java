package graduation.project.api.model;

import graduation.project.api.util.Types;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Action 抽象类
 * <p>
 * Created by liyiguang on 2017/6/17.
 */
public abstract class AbstractAction<A, R> implements Action<A, R> {

    protected Logger log = LoggerFactory.getLogger(getClass());

    protected Class<A> argClass;
    protected A arg;
    protected ActionContext actionContext;

    public AbstractAction() {
        argClass = Types.detectFirstGenericArgType(getClass());
    }

    protected abstract R doAct(A arg);

    protected void before(A arg) {

    }

    protected R after(A arg, R result) {
        return result;
    }

    protected void finallyDo() {

    }
    public final R act(A arg) {
        R result;
        try {
            before(arg);
            result = doAct(arg);
            log.debug("Action arg:{},result:{}", arg, result);
            after(arg, result);
        } finally {
            finallyDo();
        }
        return result;
    }

    public Class<A> getArgClass() {
        return argClass;
    }

    public A getArg() {
        return arg;
    }

    public void setArg(A arg) {
        this.arg = arg;
    }

    public ActionContext getActionContext() {
        return actionContext;
    }

    public void setActionContext(ActionContext actionContext) {
        this.actionContext = actionContext;
    }

}
