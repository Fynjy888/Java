package figures;

class Triangle extends figure {  // ����� ����������� ����������� �� ������ ������
	 
    private double sideA; //���� ������, ������ �������� ������� � � ����������� ������������
    private double sideB; //���� ������, ������ �������� ������� � � ����������� ������������
    private double angleAB; //���� ������, ������ ����(� ��������) ����� ����� ��������� � ����������� ������������
 
    public Triangle(double sideA, double sideB, double angleAB) { // �����������, �� ���� 3 ��������� - ������� �, ������� � � ����
        this.sideA = sideA;
        this.sideB = sideB;
        this.angleAB = angleAB;
    }
 
    public double getArea(){ //����� �������� ������� ������������
        double square = (this.sideA * this.sideB * Math.sin(this.angleAB * Math.PI / 180))/2;
        return square; //���������� ������� ������������
    }
	
	public double getPerimeter(){ //����� �������� �������� ������������
        double sideC = Math.sqrt(Math.pow(this.sideA, 2) + Math.pow(this.sideB, 2) - 2 * this.sideA * this.sideB * Math.cos(this.angleAB * Math.PI / 180));
        double perimeter = this.sideA + this.sideB + sideC;
        return perimeter; //���������� �������� ������������
    }
}