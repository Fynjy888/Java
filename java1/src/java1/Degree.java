package java1;

public class Degree { //Возвести число в степень
	public static void main(String[] args) {
    	int number = 3; //число
    	int degree = 3; //степень
    	int res = number;
    	if (degree == 0) //если степень 0, то результат 1
    		res = 1;
		else 
				for (int x = 0; x < (degree - 1); x = x + 1) {
					res = number * res; 
				}
		System.out.print("Результат: ");
		System.out.print(res);
	}
}