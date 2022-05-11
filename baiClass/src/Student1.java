package Form;
public class Student1 extends Class{
    private String address;
    public Student1(String name, String Classname, int age, String a){
        super(name, Classname, age);
        this.address = a;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String a) {
        this.address = a;
    }
    public void getST(){
        super.getST();
        System.out.println("Address = " + getAddress());
    }
    @Override
    public String toString() {
        return "Student: " + super.toString();
    }

}
