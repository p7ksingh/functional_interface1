import java.util.Arrays;
import java.util.List;

public class ArrayListEXPrint {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("pankaj","dhiraj","niraj");
        list.forEach(s->System.out.println(s));
    }
}
