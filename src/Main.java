import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Object user = new Object("Max", 34, 12, 1699);
        Object user1 = new Object("Felix", 12, 2, 123);
        Object user2 = new Object("Lola", 22, 5, 444);
        Object user3 = new Object("Zen", 18, 8, 7985);


        List<Object> list = new ArrayList<>();
        list.add(user);
        list.add(user1);
        list.add(user2);
        list.add(user3);
        list.remove(1);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
