package graduation.project.api.model;

public interface Controller<A, R> {

    R service(A arg);

    A getArg();
}
