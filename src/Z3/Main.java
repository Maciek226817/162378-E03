import java.io.File;
import java.util.List;

public class Main {
    public  static String[] print(String path, String extension) {
        String[] res = {};
        try {
            File f = new File(path);
            res = f.list((dir, name) -> !name.endsWith(extension));
        }
        catch (Exception ignored) {
        }
        return res;
    }

    public static void main(String[] args) {
        List.of(print("src",".txt")).forEach(System.out::println);
    }
}
