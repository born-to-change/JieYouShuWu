package graduation.project.api.model;

@FunctionalInterface
public interface ActionListener<T> {
    void onAction(T data);
}
