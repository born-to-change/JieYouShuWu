package graduation.project.api.model;

public interface Action<A,R> {

    R act(A arg);

    A getArg();
}
