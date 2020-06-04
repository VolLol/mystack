import java.util.List;

public interface MyStackInterface {

    List<Object> list = null;

    void push(Object item);

    Object peek();

    Object pop();

    List show();

}
