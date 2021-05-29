import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Object> list = new ArrayList<>();
        list.add(2);
        list.add(7);
        list.add(8);
        list.add(84);
        list.add(0, 14);
        list.set(1, 6);
        list.remove(4);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
