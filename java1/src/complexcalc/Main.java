package complexcalc;
import java.util.Scanner;
public class Main { 
	public static void main(String[] args){ 
        Scanner scn = new Scanner(System.in);     
        ComplexNumber z1 = new ComplexNumber(); 
        ComplexNumber z2 = new ComplexNumber(); 
        ComplexNumber res = new ComplexNumber(); 
       
		 System.out.println("Введите действительную часть первго числа");
		 z1.re = scn.nextDouble();
		 System.out.println("Введите мнимую часть первго числа");
		 z1.im = scn.nextDouble();
		 System.out.println("Введите действительную часть второго числа");
		 z2.re = scn.nextDouble();
		 System.out.println("Введите мнимую часть второго числа");
		 z2.im = scn.nextDouble();
		 
		 System.out.println("Введите действие с числами (+,-,*,/)");
		 scn.nextLine();   
		 String name = scn.nextLine();
  	     z1.pr();
 		 System.out.print(" " + name + " ");
 		 z2.pr();
 		 System.out.print(" = ");
		 
		 switch(name) {
	        case "+":
		     res = ComplexOperations.add(z1, z2);
	 		 res.pr();		     
	        break;
	        case "-":
		     res = ComplexOperations.sub(z1, z2);
	 		 res.pr();		     
	        break;
	        case "*":
		     res = ComplexOperations.mul(z1, z2);
	 		 res.pr();		     
	        break;
	        case "/":
		     res = ComplexOperations.div(z1, z2);
	 		 res.pr();		     
	        break;
	        default:
	            System.out.print("вы ввели неподходящий символ");
	     }  
	  }

}