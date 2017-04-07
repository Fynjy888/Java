package figures;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a,b,c;
        
        System.out.println("Для какой фигуры вы хотите посчитать параметры? (круг, квадрат, прямоугольник, треугольник)");
        String answer = in.nextLine();
        
        switch(answer) {
        case "круг":
            System.out.println("введите диаметр круга");
            a = in.nextInt();
            figure s1 = new Circle (a);
            System.out.println("периметр круга: "+s1.getPerimeter());
    		System.out.println("площадь круга: "+s1.getArea());
            break;
        case "квадрат":
            System.out.println("введите сторону квадрата");
            a = in.nextInt();
            figure s2 = new Square (a);
            System.out.println("периметр квадрата: "+s2.getPerimeter());
    		System.out.println("площадь квадрата: "+s2.getArea());
            break;
        case "пр¤моугольник":
            System.out.println("введите ширину пр¤моугольника");
            a = in.nextInt();
            System.out.println("введите высоту пр¤моугольника");
            b = in.nextInt();
            figure s3 = new Rectangle (a, b);
            System.out.println("периметр пр¤моугольника: "+s3.getPerimeter());
    		System.out.println("площадь пр¤моугольника: "+s3.getArea());
            break;
        case "треугольник":
            System.out.println("введите первую сторону треугольника");
            a = in.nextInt();
            System.out.println("введите вторую сторону треугольника");
            b = in.nextInt();
            System.out.println("введите угол между сторонами треугольника");
            c = in.nextInt();            
            figure s4 = new Triangle (a, b, c);
            System.out.println("периметр треугольника: "+s4.getPerimeter());
    		System.out.println("площадь треугольника: "+s4.getArea());
            break;
        default:
            System.out.println("вы ввели неподходящий символ");
        }
    }
}