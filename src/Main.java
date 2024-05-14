import java.util.concurrent.Callable;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("""
                Circle деген класс тузунуз, анын PI жана radius деген свойствасы, area
                жана circumference деген статик методдору болсун.
                areaны табуу учун: PI * (radius * radius)
                circumferenceти табуу учун PI * 2 * radius деген формулалар колдонулат""");
        Circle circle =  new Circle();
        System.out.println(circle.getArea());
        double a1 = 2;
        System.out.println(Circle.getCircumference(a1));

    }
        }

