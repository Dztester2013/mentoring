package mentoring.interfacetuto;
public class tester {
    public static void main(String[] args) {
        Student a= new Student ("amar alili" ,"1213213131");
        Student b= new Student ("ammar amjad" ,"2424");
        Student c= new Student ("mahmadul fggg " ,"44222");
        Student d= new Student ("yasmina  zdsf" ,"4422");
       DataInfo [] di={a,b,c,d};
        for (int i=0 ;i<di.length ;i++) {
            di[i].showdata();

        }
//        a.showdata();
//        b.showdata();
//        c.showdata();
//        d.showdata();

    }
}
