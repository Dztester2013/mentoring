package mentoring.encaplsulation;

import java.util.Scanner;

public class SerialActivation {
    private int mExperation;
    private static int number = 3;
    public SerialActivation(int experation) {
        System.out.println("Enter Serial Number :(XXX-XXX-XXX-XXX-XXX)");
        Scanner input=new Scanner(System.in);
        String serial=input.nextLine();
        if (number > 0 )
        {
            SerialActivation.serial(serial);
        this.mExperation = experation;

        System.out.println("Number of Registration left is : " + number);
        System.out.println("Software is valid until   :" + this.mExperation);
    }
        //System.out.println( this.mExperation);
        if (number <= 0) {
            System.out.println("you have  reached the max attempt of Registration ");

        }
        number--;

    }



    public int getmExperation() {
        return mExperation;
    }

    public void setmExperation(int experation) {

        this.mExperation = experation;

    }
public static boolean serial (String serial){
     String serial1="AAA-BBB-CCC-DDD-123";
   if (serial.equals(serial1)  ){
       System.out.println("registration successful !");

    } else {
       System.out.println("Wrong Serial Number   !good bye ");
       System.exit(0);

   }
    return false;
}

}
