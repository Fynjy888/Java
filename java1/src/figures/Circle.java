package figures;

class Circle extends figure {  // ����� ���� ����������� �� ������ ������
	 
    private double diameter; //���� ������, ������ �������� �������� ����� �����
 
    public Circle(double diameter) { // �����������, �� ���� 1 �������� - �������
        this.diameter = diameter;
	} 
 
    public double getArea(){ //����� �������� ������� �����
        double radius = diameter / 2.0;
        return Math.PI * radius * radius; //���������� ������� �����
    }
	
	public double getPerimeter(){ //����� �������� �������� �����
        return Math.PI * diameter; //���������� �������� �����
    }
}