package mentoring.Inheritance;

public class Computer extends Abstractest {


    public Computer(String manufacturer, String cpu, int RAMSize, int HDDSize, double price) {
        this.manufacturer = manufacturer;
        this.cpu = cpu;
        this.RAMSize = RAMSize;
        this.HDDSize = HDDSize;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Computer\n{ " +
                "Vendor='" + manufacturer + '\'' +
                ", Pro='" + cpu + '\'' +
                ", RAM=" + RAMSize +
                ", HDD=" + HDDSize +
                ", price=" + price +
                '}';
    }
   public   double getDiscount(double discount ){
        double save=price-(1-(discount/100.0))*price;
         int  save1= (int) save;
       double priceAfterDiscount=price-save1;
       System.out.println("New price "+priceAfterDiscount);
       return save1;

   }

}
