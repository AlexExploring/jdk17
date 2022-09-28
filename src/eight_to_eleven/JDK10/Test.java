package eight_to_eleven.JDK10;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        //局部变量类型推断
        var list = new ArrayList<String>(Arrays.asList("1",",2","3"));
        System.out.println(list);
    }
}
