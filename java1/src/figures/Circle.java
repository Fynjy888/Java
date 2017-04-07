package figures;

class Circle extends figure {  // Класс круг наследуется от класса фигура
	 
    private double diameter; //Поле класса, хранит значение диаметра этого круга
 
    public Circle(double diameter) { // Конструктор, на вход 1 параметр - диаметр
        this.diameter = diameter;
	} 
 
    public double getArea(){ //Метод получить площадь круга
        double radius = diameter / 2.0;
        return Math.PI * radius * radius; //Возвращает площадь круга
    }
	
	public double getPerimeter(){ //Метод получить периметр круга
        return Math.PI * diameter; //Возвращает периметр круга
    }
}