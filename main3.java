/*
this my java file reviewing on Methods

*/


public class main3 {
    static void Method(){
        System.out.println("hello||||||||||");
    }

    static void name(String fname){
        System.out.println("your name is :"+fname);
    }

    static  void checkage(int age){
        if (age < 18){
            System.out.println("You cannot enter");

        }
        else if(age > 18){
            System.out.println("you can Enter");
        }
    }

    static int add(int x){
        return 9 + x ;
    }



    public static void main(String[] args){
      Method();
      name("sami");
      checkage(14);
        System.out.println(add(1));
    }




}
