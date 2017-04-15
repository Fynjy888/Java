package complexcalc;
import java.util.Scanner;
public class main { 
	public static void main(String[] args){ 
        Scanner scn = new Scanner(System.in);     
       ComplexNumber z8 = new ComplexNumber(), 
                       z9 = new ComplexNumber(), 
                       res = new ComplexNumber(); 
       
		 System.out.println("Введите действительную часть первго числа");
		 double t = scn.nextDouble();
		 z8.re = t;
		 System.out.println("Введите мнимую часть первго числа");
//
		 z9.im = scn.nextDouble();
		 System.out.println("Введите действительную часть второго числа");
		 z8.re = scn.nextDouble();
		 System.out.println("Введите мнимую часть второго числа");
		 z9.im = scn.nextDouble();
		 
		 System.out.println("Введите действие с числами (+,-,*,/)");
		 scn.nextLine();   
		 String name = scn.nextLine();
	     switch(name) {
	        case "+":
	  	     z8.pr();
	 		 System.out.print(" + ");
	 		 z9.pr();
	 		 System.out.print(" = ");
		     res = add(z8, z9);
	 		 res.pr();		     
	        break;
	        case "-":
	  	     z8.pr();
	 		 System.out.print(" - ");
	 		 z9.pr();
	 		 System.out.print(" = ");
		     res = sub(z8, z9);
	 		 res.pr();		     
	        break;
	        case "*":
	  	     z8.pr();
	 		 System.out.print(" * ");
	 		 z9.pr();
	 		 System.out.print(" = ");
		     res = mul(z8, z9);
	 		 res.pr();		     
	        break;
	        case "/":
	  	     z8.pr();
	 		 System.out.print(" / ");
	 		 z9.pr();
	 		 System.out.print(" = ");
		     res = div(z8, z9);
	 		 res.pr();		     
	        break;
	        default:
	            System.out.print("вы ввели неподходящий символ");
	     }  
	  }

}
