package mentoring.interfacetuto;

public class Teacher implements DataInfo  {
    private String name;
    private String officeLocation;

    public Teacher(String name, String officeLocation) {
        this.name = name;
        this.officeLocation = officeLocation;
    }
    @Override

    public void showdata(){
        System.out.println("Teacher  "+name+", IN  :  "+officeLocation);
    }
}
