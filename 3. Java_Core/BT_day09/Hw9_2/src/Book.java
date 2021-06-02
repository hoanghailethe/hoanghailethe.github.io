import java.util.Scanner;

public class Book {
    private int id;
    private String title;
    private String publisher;
    private int yearPublished;
    private int quantity;

    Scanner scan = new Scanner(System.in);
    
    public Book() {
        //default
    }

    public void input() {
        // Give the input to book
        System.out.print("Nhap id : ");
        setId(Integer.valueOf(scan.nextLine()));
        System.out.print("Nhap ten sach : ");
        setTitle(scan.nextLine());
        System.out.print("Nhap nha xuat ban : ");
        setPublisher(scan.nextLine());
        System.out.print("Nhap nam phat hanh : ");
        setYearPublished(Integer.valueOf(scan.nextLine()));
        System.out.print("Nhap so luong sach : ");
        setQuantity(Integer.valueOf(scan.nextLine()));
    }

    public String toString() {
        return "id: " + id + "|Title: " + title + "|Publisher: " + publisher + "|Year of publish : " + yearPublished
                + "|Quantity: " + quantity;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Book(int id, String title, String publisher, int yearPublished, int quantity) {
        this.id = id;
        this.title = title;
        this.publisher = publisher;
        this.yearPublished = yearPublished;
        this.quantity = quantity;
    }

    
}
