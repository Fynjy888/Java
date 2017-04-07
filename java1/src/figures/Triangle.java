package figures;

class Triangle extends figure {  // Класс треугольник наследуется от класса фигура
	 
    private double sideA; //Поле класса, хранит значение стороны А в описываемом треугольнике
    private double sideB; //Поле класса, хранит значение стороны Б в описываемом треугольнике
    private double angleAB; //Поле класса, хранит угла(в градусах) между двумя сторонами в описываемом треугольнике
 
    public Triangle(double sideA, double sideB, double angleAB) { // Конструктор, на вход 3 параметра - сторона А, сторона В и угол
        this.sideA = sideA;
        this.sideB = sideB;
        this.angleAB = angleAB;
    }
 
    public double getArea(){ //Метод получить площадь треугольника
        double square = (this.sideA * this.sideB * Math.sin(this.angleAB * Math.PI / 180))/2;
        return square; //Возвращает площадь треугольника
    }
	
	public double getPerimeter(){ //Метод получить периметр треугольника
        double sideC = Math.sqrt(Math.pow(this.sideA, 2) + Math.pow(this.sideB, 2) - 2 * this.sideA * this.sideB * Math.cos(this.angleAB * Math.PI / 180));
        double perimeter = this.sideA + this.sideB + sideC;
        return perimeter; //Возвращает периметр треугольника
    }
}