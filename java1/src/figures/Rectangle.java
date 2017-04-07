package figures;

class Rectangle extends figure {  // ����� ������������� ����������� �� ������ ������
	 
    private double sideA; //���� ������, ������ �������� ������� � � ����������� ��������������
    private double sideB; //���� ������, ������ �������� ������� � � ����������� ��������������
    
    public Rectangle(double sideA, double sideB) { // �����������, �� ���� 2 ��������� - ������� �, ������� �
        this.sideA = sideA;
        this.sideB = sideB;
    }
 
    public double getArea(){ //����� �������� ������� ��������������
        double square = this.sideA * this.sideB;
        return square; //���������� ������� ��������������
    }
	
	public double getPerimeter(){ //����� �������� �������� ��������������
        double perimeter = (this.sideA + this.sideB)*2;
        return perimeter; //���������� �������� ��������������
    }
}