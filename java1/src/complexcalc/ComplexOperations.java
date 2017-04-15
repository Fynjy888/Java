package complexcalc;

public class ComplexOperations{
	
	   public ComplexNumber add (ComplexNumber z1, ComplexNumber z2){ 
	       return new ComplexNumber(z1.re + z2.re, z1.im + z2.im); 
	   } 
	   public ComplexNumber sub (ComplexNumber z1, ComplexNumber z2){ 
	       return new ComplexNumber(z1.re - z2.re, z1.im - z2.im); 
	   } 
	   public ComplexNumber mul (ComplexNumber z1, ComplexNumber z2){ 
	       return new ComplexNumber(z1.re * z2.re - z1.im * z2.im, z1.re * z2.im + z1.im * z2.re); 
	   } 
	 
	   public ComplexNumber div (ComplexNumber z1, ComplexNumber z2){ 
	      double m = z2.mod(); 
	      return new ComplexNumber((z1.re * z2.re - z1.im * z2.im) / m, (z1.im * z2.re - z1.re * z2.im) / m); 
	   } 
}
