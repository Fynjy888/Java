package java1;

public class Degree { //�������� ����� � �������
	public static void main(String[] args) {
    	int number = 3; //�����
    	int degree = 3; //�������
    	int res = number;
    	if (degree == 0) //���� ������� 0, �� ��������� 1
    		res = 1;
		else 
				for (int x = 0; x < (degree - 1); x = x + 1) {
					res = number * res; 
				}
		System.out.print("���������: ");
		System.out.print(res);
	}
}