import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Chương trình quản lý nhân sự trường học");

        List<Student> studentList = new ArrayList<>();
        List<Teacher> teacherList = new ArrayList<>();

        //Add 5 students
        studentList.add(new Student(4, "Hoang Thuy", 26, "HCM", 9f));
        studentList.add(new Student(8, "Duong Bui", 28, "Vinh", 8.5f));
        studentList.add(new Student(2, "Sang Nguyen", 30, "Ha Noi", 7.9f));
        studentList.add(new Student(6, "Le Dung", 24, "Nghe An", 9.5f));
        studentList.add(new Student(10, "Hoang Long", 26, "Vinh", 9.6f));
        studentList.add(new Student(22, "Nguyen Ngoc", 26, "Long An", 10f));
        //add 5 teachers
        teacherList.add(new Teacher(202, "Bui Duc", 35, "Nam Dinh", 2600f));
        teacherList.add(new Teacher(102, "Nguyen Quyen", 36, "HN", 2200f));
        teacherList.add(new Teacher(308, "Le Linh", 45, "HCM", 1500f));
        teacherList.add(new Teacher(14, "Hoang GIap", 30, "Thanh Hoa", 6000f));
        teacherList.add(new Teacher(15, "Vu Thu", 29, "Hue", 4000f));
        teacherList.add(new Teacher(1, "Tuan Anh", 27, "Bac Ninh", 3000f));

        System.out.println();
        System.out.println("Danh sách học sinh ban đầu");
        printArray(studentList);
        System.out.println();
        System.out.println("Danh sách giáo viên ban đầu");
        printArray(teacherList);

        System.out.println();
        System.out.println("Danh sách học sinh sắp xếp theo tên");
        Collections.sort(studentList, new Comparator<Student>(){
                @Override
                public int compare(Student o1, Student o2) {
                    // TODO Auto-generated method stub
                    return o1.getName().compareTo(o2.getName());
                }
        });
        printArray(studentList);

        System.out.println();
        System.out.println("Danh sách học sinh sắp xếp theo GPA: ");
        Collections.sort(studentList, new Comparator<Student>(){
                @Override
                public int compare(Student o1, Student o2) {
                    // TODO Auto-generated method stub
                    if (o1.getGpa() > o2.getGpa()) {
                        return 1;
                    } else {return (-1);}
                }
        });
        printArray(studentList);

        System.out.println();
        System.out.println("Học sinh có GPA cao nhất là: " + Collections.max(studentList));

        System.out.println();
        System.out.println("Danh sách giáo viên sắp xếp theo tên");
        Collections.sort(teacherList, new Comparator<Teacher>(){
            @Override
            public int compare(Teacher o1, Teacher o2) {
                // TODO Auto-generated method stub
                return o1.getName().compareTo(o2.getName());
            }
        });
        printArray(teacherList);

        System.out.println();
        System.out.println("Danh sách giáo viên sắp xếp theo lương");
        Collections.sort(teacherList);
        printArray(teacherList);

        System.out.println();
        System.out.println("Giáo viên có lương cao nhất: " + Collections.max(teacherList));
    }

    public static void printArray (List<? extends Person> lists) {
        for (Person i : lists) {
            System.out.println(i.toString());
        }
    }
}
