import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        System.out.println("Hãy nhập số N nguyên dương. ĐK: 8< N < 14");
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap N: ");
        int n = Integer.valueOf(scan.nextLine());

        // tao mang ngau nhien n phan tu
        int[] createdNumber = randomNumbers(n);
        System.out.println("Mang ngau nhien la: " + Arrays.toString(createdNumber));

        // Nhap so X
        System.out.print("Nhập số X trong khoảng 10 đến -10: ");
        int target = Integer.valueOf(scan.nextLine());
        scan.close();

        // tao ArrayList chứa các cặp số thỏa mãn điều kiện:
        ArrayList<Integer> bestPairs = checkCondition(createdNumber, target);

        // in các kết quả:
        System.out.println("Các cặp số có tổng gần nhất với " + target + " trong dãy ban đầu là");
        printResult(bestPairs);
    }

    public static int[] randomNumbers(int n) {
        int[] randomNumbers = new int[n];
        for (int i = 0; i < n; i++) {
            randomNumbers[i] = (int) (Math.random() * 21) - 10;
        }
        return randomNumbers;
    }

    public static ArrayList<Integer> checkCondition(int[] numbers, int target) {
        int a = Math.abs(numbers[0] + numbers[1] - target);
        ArrayList<Integer> bestPairs = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                int b = Math.abs(numbers[i] + numbers[j] - target);
                if (a == b) {
                    bestPairs.add(numbers[i]);
                    bestPairs.add(numbers[j]);
                }
                if (a > b) {
                    bestPairs.clear();
                    bestPairs.add(numbers[i]);
                    bestPairs.add(numbers[j]);
                    a = b;
                }
            }
        }
        return bestPairs;
    }


    public static void printResult(ArrayList<Integer> bestPairs) {
        for (int i = 0; i < bestPairs.size(); i += 2) {
            int num1 = bestPairs.get(i);
            int num2 = bestPairs.get(i + 1);
            int sum = num1 + num2;
            System.out.println("Số " + num1 + " và " + num2 + " có tổng là " + sum);
        }
    }
}
