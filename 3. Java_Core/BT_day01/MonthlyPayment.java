public class MonthlyPayment {
    public static void main (String[]arg) throws Exception{
        //bai 3
        System.out.println("Bài 3 - Tính tiền lãi hàng tháng của khoản vay với Số nợ = 100.000.000; Lãi xuất năm: 12% ");
        
        float baseDebt = 100_000_000f;
        float yearInterestRate = 0.12f;

        float monthInterestRate = yearInterestRate / 12;
        float monthlyInterestPayment = monthInterestRate * baseDebt;
        float monthlyTotalPayment = baseDebt / 12 + monthlyInterestPayment;

        System.out.printf("Số tiền phải trả hàng tháng là : %.4f " + "\n", monthlyTotalPayment);
    }
}
