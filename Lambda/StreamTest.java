package Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class StreamTest {

    public static void main(String[] args) {
        List<String> elements = Arrays.asList(
                "N40", "N36",
                "812", "N86",
                "GG3", "G49", "G50", "g64",
                "126", "117","I29",
                "071"
        );

        Predicate<String> findStartWithG = (String element) -> element.toUpperCase().startsWith("G");

        for (String e : elements) {
            if (findStartWithG.test(e)) {
                System.out.println(e);
            }
        }

        elements
                .stream()
                .map(String::toUpperCase) // :: <- reduce
                .filter(s->s.startsWith("G")) // it is Predicate
                .sorted()
                .forEach(System.out::println);

    }
}
