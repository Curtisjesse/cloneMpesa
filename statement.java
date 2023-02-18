

import java.util.Scanner;
public class statement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
		System.out.println("Enter Your Marks to Know Your Grade");
		double marks = scan.nextDouble();
		if(marks >= 70 && marks<=100){
		System.out.println("Your Grade is A");
		}
else if(marks >= 60 && marks <= 69)
{
		              System.out.println("Your  Grade is B");
		}
else if(marks >=50 && marks <= 59)
{
			System.out.println("Your  Grade is C");
		}
else if(marks >=40 && marks <=49)
{
			System.out.println("Your Grade is D");
		}
else if(marks >=0 && marks <= 39)
{
			System.out.println("SUPPLIMENTARY");
		} 
else
 {
			System.out.println("Error");

    }
    
}
}
