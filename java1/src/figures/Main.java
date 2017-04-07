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
            System.out.println("Введите диаметр круга");
            a = in.nextInt();
            figure s1 = new Circle (a);
            System.out.println("Периметр круга: "+s1.getPerimeter());
    		System.out.println("Площадь круга: "+s1.getArea());
            break;
        case "квадрат":
            System.out.println("Введите сторону квадрата");
            a = in.nextInt();
            figure s2 = new Square (a);
            System.out.println("Периметр квадрата: "+s2.getPerimeter());
    		System.out.println("Площадь квадрата: "+s2.getArea());
            break;
        case "прямоугольник":
            System.out.println("Введите ширину прямоугольника");
            a = in.nextInt();
            System.out.println("Введите высоту прямоугольника");
            b = in.nextInt();
            figure s3 = new Rectangle (a, b);
            System.out.println("Периметр прямоугольника: "+s3.getPerimeter());
    		System.out.println("Площадь прямоугольника: "+s3.getArea());
            break;
        case "треугольник":
            System.out.println("Введите первую сторону треугольника");
            a = in.nextInt();
            System.out.println("Введите вторую сторону треугольника");
            b = in.nextInt();
            System.out.println("Введите угол между сторонами треугольника");
            c = in.nextInt();            
            figure s4 = new Triangle (a, b, c);
            System.out.println("Периметр треугольника: "+s4.getPerimeter());
    		System.out.println("Площадь треугольника: "+s4.getArea());
            break;
        default:
            System.out.println("Вы ввели неподходящий символ");
        }
    }
}