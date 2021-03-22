import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("This is Employee Management APP!");

        List <Waiter> waiters = new ArrayList<>();
        List <Kitchen> cooks = new ArrayList<>();

        waiters.add(new Waiter(1, "KingKong", 20, 3085.99f, 500.5f));
        waiters.add(new Waiter(2, "James Bond", 40, 9085.86f, 1000.5f));
        waiters.add(new Waiter(3, "Tom cruise", 46, 10335.40f, 2000.5f));

        cooks.add(new Kitchen(4, "Brad pit", 48, 25000.42f, 10000f));
        cooks.add(new Kitchen(5, "Ramsey Gordon", 48, 25000.42f, 10000f));
        cooks.add(new Kitchen(6, "TrumpNaldo", 76, 1500.42f, 400f));

        System.out.println("Waiters List: ");
        printArray(waiters);

        System.out.println("Cooks list: ");
        printArray(cooks);
    }

    public static void printArray(List<? extends Employee> lists) {
        for(Employee i : lists) {
            System.out.println(i.toString());
        }
    } 
}
