package figures;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a,b,c;
        
        System.out.println("��� ����� ������ �� ������ ��������� ���������? (����, �������, �������������, �����������)");
        String answer = in.nextLine();
        
        switch(answer) {
        case "����":
            System.out.println("������� ������� �����");
            a = in.nextInt();
            figure s1 = new Circle (a);
            System.out.println("�������� �����: "+s1.getPerimeter());
    		System.out.println("������� �����: "+s1.getArea());
            break;
        case "�������":
            System.out.println("������� ������� ��������");
            a = in.nextInt();
            figure s2 = new Square (a);
            System.out.println("�������� ��������: "+s2.getPerimeter());
    		System.out.println("������� ��������: "+s2.getArea());
            break;
        case "�������������":
            System.out.println("������� ������ ��������������");
            a = in.nextInt();
            System.out.println("������� ������ ��������������");
            b = in.nextInt();
            figure s3 = new Rectangle (a, b);
            System.out.println("�������� ��������������: "+s3.getPerimeter());
    		System.out.println("������� ��������������: "+s3.getArea());
            break;
        case "�����������":
            System.out.println("������� ������ ������� ������������");
            a = in.nextInt();
            System.out.println("������� ������ ������� ������������");
            b = in.nextInt();
            System.out.println("������� ���� ����� ��������� ������������");
            c = in.nextInt();            
            figure s4 = new Triangle (a, b, c);
            System.out.println("�������� ������������: "+s4.getPerimeter());
    		System.out.println("������� ������������: "+s4.getArea());
            break;
        default:
            System.out.println("�� ����� ������������ ������");
        }
    }
}