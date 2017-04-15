package complexcalc;

public class ComplexOperations{
	
	   public static ComplexNumber add (ComplexNumber z1, ComplexNumber z2){ //Метод типа ComplexNumber - сложить
	       return new ComplexNumber(z1.re + z2.re, z1.im + z2.im); 
	   } 
	   public static ComplexNumber sub (ComplexNumber z1, ComplexNumber z2){ //Метод типа ComplexNumber - вычесть
	       return new ComplexNumber(z1.re - z2.re, z1.im - z2.im); 
	   } 
	   public static ComplexNumber mul (ComplexNumber z1, ComplexNumber z2){ //Метод типа ComplexNumber - умножить
	       return new ComplexNumber(z1.re * z2.re - z1.im * z2.im, z1.re * z2.im + z1.im * z2.re); 
	   } 
	 
	   public static ComplexNumber div (ComplexNumber z1, ComplexNumber z2){ //Метод типа ComplexNumber - поделить
	      double m = z2.mod(); 
	      return new ComplexNumber((z1.re * z2.re - z1.im * z2.im) / m, (z1.im * z2.re - z1.re * z2.im) / m); 
	   } 
}
