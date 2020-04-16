import javafx.scene.shape.Circle;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class TestComparator {
    public static void main(String[] args) {
        Circle[] list = new Circle[3];
        list[0] = new Circle(5);
        list[1] = new Circle();
        list[2] = new Circle(3.5);
        System.out.println("Before sort: ");
        for (Circle c:list){
            System.out.println(c);
        }
        Comparator circleComparator = new CircleComparator();
        Arrays.sort(list,circleComparator);

        System.out.println("After sorted:");
        for (Circle c:list){
            System.out.println(c);
        }
    }
}
