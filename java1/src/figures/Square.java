package figures;

class Square extends figure {  // Класс квадрат наследуется от класса фигура
	 
    private double sideA; //Поле класса, хранит значение стороны А в описываемом квадрате

    public Square(double sideA) { // Конструктор, на вход 1 параметр - сторона А
        this.sideA = sideA;
    }
 
    public double getArea(){ //Метод получить площадь квадрата
        double square = this.sideA * this.sideA;
        return square; //Возвращает площадь круга
    }
	
	public double getPerimeter(){ //Метод получить периметр квадрата
        double perimeter = this.sideA * 4;
        return perimeter; //Возвращает периметр квадрата
    }
}