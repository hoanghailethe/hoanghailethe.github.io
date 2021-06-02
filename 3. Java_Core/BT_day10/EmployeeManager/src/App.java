import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("This is Employee Data Management Program!! Welcome admin.");
        Scanner scan = new Scanner(System.in);
        String choice = "";
        ArrayList<Employee> listE = new ArrayList<>();
        
        while (choice != "exit") {
            System.out.println("What do you want to do???");
            System.out.println("1. Add a new Employee ");
            System.out.println("2. See all Employee's info");
            System.out.println("3. Insert a new Employee to the list ");
            System.out.println("4. Delete an employee");
            System.out.println("5. Edit name of an employee");
            System.out.println("6. Write an employee's info to a new File");
            System.out.println("7. Exit!");
            System.out.print("Enter number (1-7): ");
            int choice1 = scan.nextInt();
            scan.nextLine();
            
            switch (choice1) {
                case 1:
                    add(listE);
                    break;
                case 2:
                    System.out.println(listE);
                    break;
                case 3:
                    insert(listE);
                    break;
                case 4:
                    System.out.print("Enter (1. Delete by name?) OR (2. Delete by Id?) : ");
                    String choice2 = scan.nextLine();
                    if (choice2.equals("1")) {
                        deleteByName(listE);
                    } else if (choice2.equals("2")) {
                        deleteById(listE);
                    } else {
                        System.out.println("ERROR!! Auto back");
                    }
                    break;
                case 5:
                    editName(listE);
                    break;
                case 6:
                    System.out.print("Enter Id of employee to Write to new file: ");
                    int num = scan.nextInt();
                    scan.nextLine();
                    for ( int i = 0; i< listE.size(); i++) {
                        if (num == listE.get(i).getId()) {
                            System.out.println("Founded employee!");
                            System.out.println("New file will store in Local Disk (D:) , file name:" +num+".txt");
                            File myFile = new File ("D:\\"+num+".txt");
                            myFile.createNewFile();
                            FileWriter myPen = new FileWriter(myFile);
                            myPen.write(listE.get(i).toString());
                            myPen.close();
                        }
                    }
                    break;    
                case 7:
                    //exit!
                    System.out.println("Exiting!");
                    choice = "exit" ;
                    break;
                default:
                    System.out.println("Invalid choice! Please try again!");
            }
                
        }
        scan.close();
    }

    static void add( ArrayList<Employee> listE ) {
        Employee person = new Employee();
        person.input();
        listE.add(person);

    }

    static void insert (ArrayList<Employee> listE ) {
        Scanner scan = new Scanner (System.in);
        Employee person = new Employee();
        person.input();
        System.out.print("Enter the position to insert: ");
        int n = Integer.valueOf(scan.nextLine());
        listE.add(n-1, person);

    }


    static void deleteByName(ArrayList<Employee> listE){
        Scanner scan = new Scanner (System.in);
        System.out.print("Enter name to delete employee: ");
        String delName = scan.nextLine();
        for (int i = 0; i < listE.size(); i++) {
            if (listE.get(i).getName().equals(delName)) {
                listE.remove(i);
            }
        }
        System.out.println("DONE DELETING!");
    }

    static void deleteById(ArrayList<Employee> listE){
        Scanner scan = new Scanner (System.in);
        System.out.print("Enter Id of employee: ");
        int delId = Integer.valueOf(scan.nextLine());
        for (int i = 0; i < listE.size(); i++) {
            if (listE.get(i).getId() == delId) {
                listE.remove(i);
            }
        }
        System.out.println("DONE DELETING!!");
    }

    static void editName(ArrayList<Employee> listE) {
        Scanner scan = new Scanner (System.in);
        System.out.print("Enter Id of employee need changing name: ");
        int Id = Integer.valueOf(scan.nextLine());
        for (int i = 0; i < listE.size(); i++) {
            if (listE.get(i).getId() == Id) {
                System.out.print("Type new name : ");
                String newName = scan.nextLine();
                listE.get(i).setName(newName);
            }
        }
    }

}
 