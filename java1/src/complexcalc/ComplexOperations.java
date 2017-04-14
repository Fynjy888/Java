package complexcalc;

public class ComplexOperations extends ComplexNumber{
	
	   public ComplexNumber add(ComplexNumber z){ 
	       return new ComplexNumber(re + z.re, im + z.im); 
	   } 
	   public ComplexNumber sub(ComplexNumber z){ 
	       return new ComplexNumber(re - z.re, im - z.im); 
	   } 
	   public ComplexNumber mul(ComplexNumber z){ 
	       return new ComplexNumber(re * z.re - im * z.im, re * z.im + im * z.re); 
	   } 
	 
	   public ComplexNumber div(ComplexNumber z){ 
	      double m = z.mod(); 
	      return new ComplexNumber((re * z.re - im * z.im) / m, (im * z.re - re * z.im) / m); 
	   } 
}
