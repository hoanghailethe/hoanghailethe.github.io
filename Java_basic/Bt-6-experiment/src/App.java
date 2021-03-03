import java.util.Scanner;

//Goals of this TEST:
    //1. Put the Scan Method in Parent and Children class (Subclass and...Overwrite the Input method) /Done
    //2. Add the Choose case (choices to add what kind of Job to input) /Done
    //3. try to explain the Issue of AUTO CASTINg when put one OBject in an PARRENT's arraya dn give out as Type of the child
        //(UNDERSTANDEd: 3)
    //4. Understand USe of toString();

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Chào mừng đến với trang quản lý nhân viên!");
        System.out.println("Đầu tiên hãy nhập thông tin của các nhân viên");
        Scanner scan = new Scanner(System.in);
        int numOfDevs;
        int numOfTesters;

        System.out.println("Chon vi tri nhan vien muon nhap : 1. Dev  2. Software Tester ");
        int choice = scan.nextInt();

        Staff[] staff = new Staff[10];

        if (choice == 1) {
            System.out.println("nhap so nhan vien Dev : ");
            numOfDevs = scan.nextInt();
            for (int i = 0 ; i< numOfDevs; i++) {
                staff[i] = new Developer();
                staff[i].input();
            }
        } else {
            System.out.println("nhap so nhan vien Tester : ");
            numOfTesters = scan.nextInt();
            for (int i = 0 ; i< numOfTesters; i++) {
                staff[i] = new Developer();
                staff[i].input();
                }
            }
        scan.close();
        
        System.out.println("Thông tin các nhân viên vừa nhập :");
        for (Staff i : staff) {
            i.showDetail();
        }
    }
}