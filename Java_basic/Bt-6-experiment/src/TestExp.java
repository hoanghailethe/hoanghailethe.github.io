public class TestExp {
    public static void main(String[] args) throws Exception {
        college a = new college();
        college b = new univ();
        a.move();
        b.move();
    }
}
//okay this is I understand....

class college {
    public void move() {
     System.out.println("College is open");
    }
   }

class univ extends college {
    public void move() {
     System.out.println("University is open too");
    }
   }

