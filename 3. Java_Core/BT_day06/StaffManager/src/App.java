import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Chào mừng đến với trang quản lý nhân viên!");
        System.out.println("Đầu tiên hãy nhập thông tin của các nhân viên");
        Scanner scan = new Scanner(System.in);
        int numOfDevs;
        int numOfTesters;

        System.out.println("Số lập trình viên muốn nhập : ");
        numOfDevs = Integer.parseInt(scan.nextLine());
        Developer[] devList = new Developer[numOfDevs];
        for (int i = 0; i < numOfDevs; i++) {
            System.out.println("Đang nhập thông tin lập trình viên thứ " + i + 1 + " trong danh sách");
            Developer iDeveloper = new Developer();
            devList[i] = iDeveloper;
            System.out.println("Mã nhân viên : ");
            iDeveloper.setId(Integer.valueOf(scan.nextLine()));
            System.out.println();
            System.out.println("Họ tên : ");
            iDeveloper.setFullName(scan.nextLine());
            System.out.println();
            System.out.println("Tuổi : ");
            iDeveloper.setAge(Integer.valueOf(scan.nextLine()));
            System.out.println();
            System.out.println("Số điện thoại : ");
            iDeveloper.setPhoneNumber(scan.nextLine());
            System.out.println();
            System.out.println("Email : ");
            iDeveloper.setEmail(scan.nextLine());
            System.out.println();
            System.out.println("Lương cơ bản : ");
            iDeveloper.setBasicSalary(Float.valueOf(scan.nextLine()));
            System.out.println();
            System.out.println("Số giờ làm thêm : ");
            iDeveloper.setOverTimehour(Float.valueOf(scan.nextLine()));
            System.out.println();
        }

        System.out.println("");
        System.out.println("Số Kiểm chứng viên muốn nhập :");
        numOfTesters = Integer.parseInt(scan.nextLine());
        SoftwareTester[] testerList = new SoftwareTester[numOfTesters];
        for (int i = 0; i < numOfTesters; i++) {
            System.out.println("Đang nhập thông tin lập trình viên thứ " + i + 1 + " trong danh sách");
            SoftwareTester iTester = new SoftwareTester();
            testerList[i] = iTester;
            System.out.println("Mã nhân viên : ");
            iTester.setId(Integer.valueOf(scan.nextLine()));
            System.out.println();
            System.out.println("Họ tên : ");
            iTester.setFullName(scan.nextLine());
            System.out.println();
            System.out.println("Tuổi : ");
            iTester.setAge(Integer.valueOf(scan.nextLine()));
            System.out.println();
            System.out.println("Số điện thoại : ");
            iTester.setPhoneNumber(scan.nextLine());
            System.out.println();
            System.out.println("Email : ");
            iTester.setEmail(scan.nextLine());
            System.out.println();
            System.out.println("Lương cơ bản : ");
            iTester.setBasicSalary(Float.valueOf(scan.nextLine()));
            System.out.println();
            System.out.println("Số lỗi phát hiện : ");
            iTester.setNumOfBugs(Integer.valueOf(scan.nextLine()));
            System.out.println();
        }
        scan.close();

        System.out.println("Thông tin các lập trình viên :");
        for (Developer i : devList) {
            i.showDetail();
        }

        System.out.println("");
        System.out.println("Thông tin các Software Tester :");
        for (SoftwareTester i : testerList) {
            i.showDetail();
        }
    }
}
