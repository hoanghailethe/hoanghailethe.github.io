public class SoftwareTester extends Staff {
    public int numOfBugs;
    private float bonusPerBug = 50_000;

    public float totalSalary() {
        return basicSalary + numOfBugs * bonusPerBug;
    }

    public SoftwareTester() {
    }

    public SoftwareTester(int id, String name, int age, String phoneNumber, String email, float basicS, int bugs) {
        super(id, name, age, phoneNumber, email, basicS);
        this.numOfBugs = bugs;
    }

    public int getNumOfBugs() {
        return numOfBugs;
    }

    public void setNumOfBugs(int numOfBugs) {
        this.numOfBugs = numOfBugs;
    }

    public void showDetail() {
        System.out.printf(
                "Id: %d |Name: %s |Age: %d |Phone: %s |Email %s |Lương cơ bản: %.2f |Số lỗi tìm : %d |Tổng lương: %.2f %n",
                id, fullName, age, phoneNumber, email, basicSalary, numOfBugs, totalSalary());
    }

}
