import java.util.HashSet;
import java.util.Set;

public class SetExample {

    //Cách xây dựng class SET - Video

    //Cách sử dụng SET 
    public static void main(String[] args) {
        Set<Integer> mySet = new HashSet<>();

        mySet.add(1);
        mySet.add(2);
        mySet.add(3);

        mySet.add(1);
        mySet.add(3);

        // for(Integer integer: mySet) {
        //     System.out.println(integer);
        // }

        mySet.forEach(System.out::println);


        Set<MyNumber> setMyNumber = new HashSet<>();

        setMyNumber.add(new MyNumber(1));
        setMyNumber.add(new MyNumber(2));
        setMyNumber.add(new MyNumber(3));

        setMyNumber.add(new MyNumber(1));
        setMyNumber.add(new MyNumber(2));

        //Try before Override and after Override
        // for(MyNumber myNumber: setMyNumber) {
        //     System.out.println(myNumber.value);
        // }
        setMyNumber.forEach( x -> System.out.println(x));

    }
    

}
