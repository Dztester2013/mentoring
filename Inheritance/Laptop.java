package mentoring.Inheritance;

public class Laptop extends Computer {
    double screenSize;
    double weight;

    public Laptop(String manufacturer, String cpu, int RAMSize, int HDDSize, double price, double screenSize, double weight) {
        super(manufacturer, cpu, RAMSize, HDDSize, price);
        this.screenSize = screenSize;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Laptop{  " +super.toString()+
                "\n   screenSize=" + screenSize +
                ", weight=" + weight +
                '}';
    }
    @Override

    public boolean goodForGaming (){
        boolean tbr=false;
        if (RAMSize>8
                && (cpu.equals("i7")|| cpu.equals("i9"))
                && screenSize>16)
        {
            tbr=true;

        }

        return tbr;
    }

    public   double getDiscount(double discount ,String couponCode ){
        double save=price-(1-(discount/100.0))*price;
        int  save1= (int) save;
        double priceAfterDiscount=price-save1;
        System.out.println("New price "+priceAfterDiscount);
        String coupon="piit2021";
         if (couponCode.equals(coupon)  ){
             System.out.println("You  are  Eligible to apply for Second Discount of 20$");
             System.out.println("Price before 20$ OFF code Apply  is : "+save1);
             save=(save1-20);
                return save;         } else
             System.out.println("wrong coupon code !! ");
        return save1;

    }
}
