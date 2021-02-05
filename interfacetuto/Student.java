package mentoring.interfacetuto;

public class Student implements DataInfo  {
   private String name;
    private String id;

    public Student(String name, String id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public void showdata() {
        System.out.println("Student "+name+", ID :  "+id);

    }
}
