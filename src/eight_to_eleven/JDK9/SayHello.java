package eight_to_eleven.JDK9;

/**
 * 允许在接口中使用私有方法
 */
public interface SayHello {

    private String buildMessage() {
        return "hello,world!";
    }

    default String sayHello() {
        return buildMessage();
    }
}
