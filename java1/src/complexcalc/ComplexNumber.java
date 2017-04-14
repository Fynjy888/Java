package complexcalc;

public class ComplexNumber { 
    public double re, im; 
    
   ComplexNumber(double re, double im){ //Метод класса задать комплексное число
        this.re = re; 
        this.im = im; 
   }
   
   ComplexNumber(double re)
   {this(re, 0.0);} 
   
   ComplexNumber()
   {this(0.0, 0.0);} 
   
   ComplexNumber(ComplexNumber z)
   {this(z.re, z.im);} 
 
   public double getRe()
      {return re;} 
   public double getIm()
      {return im;} 
   public ComplexNumber getZ()
      {return new ComplexNumber(re, im);} 
   public void setRe(double re)
      {this.re = re;} 
   public void setIm(double im)
      {this.im = im;} 
   public void setZ(ComplexNumber z)
      {re = z.re; im = z.im;} 

   public void pr(){ //вывод комплексного числа
      System.out.print(re);
      if (im >= 0.0)
          System.out.print("+");     	  
      System.out.print(im + "i");
   }

   public double mod()
   {return Math.sqrt(re * re + im * im);}

   
   /*   public ComplexNumber add(ComplexNumber z){ 
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
   }  */
}
