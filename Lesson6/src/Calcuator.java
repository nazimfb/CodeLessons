import javax.swing.text.NumberFormatter;

import static java.lang.Double.sum;

public class Calcuator<T extends Number> {
    public T add(T a, T b){
        return  (T)Double.valueOf(a.doubleValue()+ b.doubleValue());
    }
}
