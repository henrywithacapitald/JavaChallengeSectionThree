import javax.print.event.PrintEvent;

public class JavaMart {
    public static void main(String[] args) {
        double wallet = 100;
        
        double toyCar = 5.99;
        System.out.println("Can I get this car?");
       
        //if you have enough money
            //       print: Sure!
            //       pay for the toy car 
        //else:  Sorry, I only have <wallet> left
        System.out.println("If you have enough money?");
        if (wallet > toyCar) {
            System.out.println("Sure!");
            wallet -= toyCar;
        } else{
            System.out.println("Sorry, I only have "+wallet+" left");
        }

        
        double nike = 89.99;       //run test case with 89.99
        System.out.println("Can I get these nike shoes?");
        //if you have enough money
            //       print: Sure!
            //       pay for the nike shoes 

        //else: Sorry, I only have <wallet> left.
        System.out.println("if you have enough money");
        if (wallet > nike) {
            System.out.println("Sure "+wallet);
            wallet -= nike;
        }else{
            System.out.println("Sorry, I only have "+wallet+" left");
        }

    }
}