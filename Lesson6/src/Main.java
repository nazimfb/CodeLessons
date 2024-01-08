import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*List<Apple> apples = new ArrayList<>();
        apples.add(new Apple());
        apples.add(new Golden());

        List<Golden> goldens = new ArrayList<>();
        goldens.add(new Golden());

        List<Orange> oranges = new ArrayList<>();
        oranges.add(new Orange());

        List<Fruit> fruits = new ArrayList<>();
        fruits.add(new Fruit());
        fruits.add(new Apple());
        fruits.add(new Golden());

        List<Person> people = new ArrayList<>();
        people.add(new Person());
//        System.out.println(fruits);
        System.out.println(count(fruits));
        System.out.println(count(apples));
        System.out.println(count(goldens));
        System.out.println(count(oranges));
//        System.out.println(count(people));

        List<?> a = fruits;
        List<?> b = oranges;*/
        int[] nums = new int[1900000000+556676572];
        System.out.println(nums.length);
        Scanner sc = new Scanner(System.in);
        sc.nextLine();

//        Calcuator<Integer> calc = new Calcuator<>();
//        System.out.println(calc.add(3,5));
//
////        List<Apple>apples = test(new Apple(), new Apple());
//        System.out.println(test(510l,"10"));
    }

    public static <T extends Number, V extends String> double test(T item1, V item2){
//        List<T> result1 = new ArrayList<>();
//        List<T> result2 = new ArrayList<>();
//        result.add(item1);
//        result.add(item2);
        return item1.doubleValue() + Double.valueOf(item2).doubleValue();
    }

    public static int count(List<? extends Fruit> fruits){
//        fruits.add(new Golden());
//        fruits.add(new Apple());
//        fruits.add(new Orange());
        fruits.getFirst();
        return fruits.size();
    }
}