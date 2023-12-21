import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Calcuator<Integer> calc = new Calcuator<>();
        System.out.println(calc.add(3,5));

//        List<Apple>apples = test(new Apple(), new Apple());
        System.out.println(test(5L,"10"));
    }

    public static <T extends Number, V extends String> double test(T item1, V item2){
//        List<T> result1 = new ArrayList<>();
//        List<T> result2 = new ArrayList<>();
//        result.add(item1);
//        result.add(item2);
        return item1.doubleValue() + Double.valueOf(item2).doubleValue();
    }
}