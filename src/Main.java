/*

this my first java file ;
review on input,output ,condtions
and switch cases;

making a simple calc app;





*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to calculator app :\n");
        System.out.println("Do you want to comple:\n");
        String choice  = sc.nextLine();

        switch (choice){
            case "yes":
                System.out.println("Enter your First number :\n");
                int firstnum = sc.nextInt();

                System.out.println("Enter your op [+.-,*,/]\n");
                String op = sc.next();

                System.out.println("Enter your seconed Number: \n");
                int seconednum = sc.nextInt();

                switch (op){
                    case "+":
                        System.out.println("your result is :" + firstnum + seconednum);
                          break;
                    case "-":
                        System.out.println( firstnum - seconednum);
                        break;
                    case  "*":
                        System.out.println( firstnum * seconednum);
                        break;
                    case "/":
                        System.out.println(firstnum / seconednum);
                        break;
                    case "":
                        System.out.println("ann error occured\n");
                        break;
                }




        }



      sc.close();
    }
}