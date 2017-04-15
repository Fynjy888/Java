package complexcalc;

public class ComplexNumber { 
    public double re, im; 
    
   ComplexNumber(double re, double im){ //Конструктор (на вход 2 числа)
        this.re = re; 
        this.im = im; 
   }
   
   ComplexNumber(double re) {//Конструктор (на вход 1 число)
   this(re, 0.0);
   } 
   
   ComplexNumber() { //Конструктор (нет чисел)
   this(0.0, 0.0);
   } 
   
   ComplexNumber(ComplexNumber z) { //Конструктор (комплексное число)
   this(z.re, z.im);
   }

   public void pr(){ //вывод комплексного числа
      System.out.print(re);
      if (im >= 0.0)
          System.out.print("+");     	  
      System.out.print(im + "i");
   }

   public double mod()  { //вывод комплексного числа
   return Math.sqrt(re * re + im * im);
   }

}
