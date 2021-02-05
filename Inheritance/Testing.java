package mentoring.Inheritance;

public class Testing {
    public static void main(String[] args) {
        Computer c =new Computer("HP","i10",32,1024,700);
        Laptop l =new Laptop("Dell","i7",16,500,899.99,17,2.2);


//        c.manufacturer="Dell";
//        c.cpu="i7";
//        c.RAMSize=16;
//        c.HDDSize=500;
//       c.screenSize =15.4;
//       c.price=300;
///      c.weight=2.2;
       System.out.println(c);
        System.out.println("Gaming Laptop :"+l.goodForGaming());
        System.out.println("SAVE $"+l.getDiscount(22.223,"piit2021"));

        System.out.println("----------------------------------");
        System.out.println(c);
        System.out.println("SAVE $"+c.getDiscount(20));

        //   System.out.println("Gaming Laptop :"+c.goodForGaming());

//        System.out.println(c.manufacturer + " - " +c.cpu
//                + " - " +c.screens + "\" - " +c.weight +"KG"
//                + " - " +c.RAMSize + "GB - " +c.HDDSize +"GB");








    }
}
