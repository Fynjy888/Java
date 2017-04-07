package java1;

public class Factorial { //��������� ����� ��� ������ ��������
    public static int recursion(int n) {
        if (n == 1) {    // ������� ������ �� ��������
            return 1;
        }
        return recursion(n - 1) * n;   // ��� �������� ��� ����������� �������
    }
    public static void main(String[] args) {
        int n = 5; //����� �� �������� ����� ���������
    	System.out.println(n + "! = " + recursion(n)); // ����� ����������� �������
    }
}