import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hãy nhập các số tự nhiên bất kỳ. Chương trình sẽ sắp xếp theo thứ tự tăng dẫn");
        System.out.println("Nhấn Q hoặc q để kết thúc chương trình và nhận kết quả.");

        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.print("Nhập số bất kỳ: ");
        String input = scan.nextLine();

        while (!input.equalsIgnoreCase("q")) {
            try {
                int x = Integer.parseInt(input);
                numbers.add(x);
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println("Không phải số");
            } finally {
                Collections.sort(numbers);
                System.out.println(numbers);
                input = scan.nextLine();
            }
        }
        scan.close();
    }
}
