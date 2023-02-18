import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("what is your marks?");
        int marks = scanner.nextInt();
           if(marks>=80)
               System.out.println("excellent");
           if(marks<80&&marks>=70)
               System.out.println(" A");
           if(marks<70&&marks>=60)
               System.out.println("B");
           if(marks<60&&marks>=50)
               System.out.println("C");
           if(marks<50&&marks>=40)
               System.out.println(" D");
           if(marks<40)
               System.out.println("fail");
            
       
    }
    
}

