import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        String str = "AABBBCDDD";
        String collect = Arrays.asList(str.split("")).stream()
                .distinct().collect(Collectors.joining());
        System.out.println("collect = " + collect);

    }
}