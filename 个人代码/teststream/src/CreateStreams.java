import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CreateStreams {

    public static<T> void show (String title, Stream<T> stream){
        final int SIZE = 10;
        List<T> firstElements = stream
                                .limit(SIZE+1)
                                .collect(Collectors.toList());
        System.out.println(title+": ");
        for (int i = 0; i < firstElements.size(); i++){
            if (i > 0) {
                System.out.println(" ,");
            }
            if (i < SIZE){
                System.out.println(firstElements.get(i));
            }else {
                System.out.print("...");
            }

        }
        System.out.println();
    }

    public static void main(String[] args) {
        Path path = Path.get("")
    }
}
