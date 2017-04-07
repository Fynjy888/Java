package figures;

class Rectangle extends figure {  // Класс прямоугольник наследуется от класса фигура
	 
    private double sideA; //Поле класса, хранит значение стороны А в описываемом прямоугольнике
    private double sideB; //Поле класса, хранит значение стороны В в описываемом прямоугольнике
    
    public Rectangle(double sideA, double sideB) { // Конструктор, на вход 2 параметра - сторона А, сторона В
        this.sideA = sideA;
        this.sideB = sideB;
    }
 
    public double getArea(){ //Метод получить площадь прямоугольника
        double square = this.sideA * this.sideB;
        return square; //Возвращает площадь прямоугольника
    }
	
	public double getPerimeter(){ //Метод получить периметр прямоугольника
        double perimeter = (this.sideA + this.sideB)*2;
        return perimeter; //Возвращает периметр прямоугольника
    }
}