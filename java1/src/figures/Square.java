package figures;

class Square extends figure {  // ����� ������� ����������� �� ������ ������
	 
    private double sideA; //���� ������, ������ �������� ������� � � ����������� ��������

    public Square(double sideA) { // �����������, �� ���� 1 �������� - ������� �
        this.sideA = sideA;
    }
 
    public double getArea(){ //����� �������� ������� ��������
        double square = this.sideA * this.sideA;
        return square; //���������� ������� �����
    }
	
	public double getPerimeter(){ //����� �������� �������� ��������
        double perimeter = this.sideA * 4;
        return perimeter; //���������� �������� ��������
    }
}