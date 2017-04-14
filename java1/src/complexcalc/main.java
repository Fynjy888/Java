package complexcalc;
import java.util.Scanner;
public class main { 
	public static void main(String[] args){ 
        Scanner scn = new Scanner(System.in);     
        ComplexNumber z1 = new ComplexNumber(), 
                       z2 = new ComplexNumber(), 
                       res = new ComplexNumber(); 

		 System.out.println("Введите действительную часть первго числа");
		 double t = scn.nextDouble();
		 z1.re = t;
		 System.out.println("Введите мнимую часть первго числа");
//
		 z1.im = scn.nextDouble();
		 System.out.println("Введите действительную часть второго числа");
		 z2.re = scn.nextDouble();
		 System.out.println("Введите мнимую часть второго числа");
		 z2.im = scn.nextDouble();
		 
		 System.out.println("Введите действие с числами (+,-,*,/)");
		 scn.nextLine();   
		 String name = scn.nextLine();
	     switch(name) {
	        case "+":
	  	     z1.pr();
	 		 System.out.print(" + ");
	 		 z2.pr();
	 		 System.out.print(" = ");
		     res = z1.add(z2);
	 		 res.pr();		     
	        break;
	        case "-":
	  	     z1.pr();
	 		 System.out.print(" - ");
	 		 z2.pr();
	 		 System.out.print(" = ");
		     res = z1.sub(z2);
	 		 res.pr();		     
	        break;
	        case "*":
	  	     z1.pr();
	 		 System.out.print(" * ");
	 		 z2.pr();
	 		 System.out.print(" = ");
		     res = z1.mul(z2);
	 		 res.pr();		     
	        break;
	        case "/":
	  	     z1.pr();
	 		 System.out.print(" / ");
	 		 z2.pr();
	 		 System.out.print(" = ");
		     res = z1.div(z2);
	 		 res.pr();		     
	        break;
	        default:
	            System.out.print("вы ввели неподходящий символ");
	     }  
	  }
}
