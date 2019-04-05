import java.util.Arrays;
import java.util.List;
import java.util.Optional;

class StreamTest {

    public static void main(String[] argv) {

        List<String> values = Arrays.asList("un", "dois", "tres", "quatro");

        //String result = values.stream().filter(s -> s.contains("o")).map(s -> s.toUpperCase()).findFirst().get();
        String result = values.stream().filter(s -> s.contains("o")).map(String::toUpperCase).findFirst().get();

        System.out.println(result);

        result = Optional.ofNullable(values.stream().filter(s -> s.contains("z")).map(String::toUpperCase).findFirst().map(s-> s).orElse("defauklt")).orElse("dd");

        System.out.println(result);

     //   result = Optional.ofNullable(values.stream().filter(s -> s.contains("z")).map(String::toUpperCase).findFirst().get()).orElse("dd");
        result = values.stream().filter(s -> s.contains("z")).map(String::toUpperCase).findFirst().orElse("dd");

        System.out.println(result);

        result = values.stream().filter(s -> s.contains("r")).map(String::toUpperCase).findFirst().orElse("dd");

        System.out.println(result);



    }


}