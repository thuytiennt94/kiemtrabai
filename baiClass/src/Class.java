package Form;
public class Class {
    private String Name;
    private String Classname;
    private int age;
    public Class(){
        this.Name ="thai";
        this.Classname = "B1";
        this.age = 19;
    }
    public Class(String N,String Clname, int A){
        this.Name = N;
        this.Classname = Clname;
        this.age = A;
    }
    public String getName(){
        return Name;
    }
    public void setName(String name){
        this.Name = name;
    }

    public String getClassname() {
        return Classname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void getST(){
        System.out.println("Name = " + getName() + "Class = " + getClassname() + "Age =" + getAge());
    }
    public String toString(){
        return Name + " , Class = " + Classname + ", age = " + age ;
    }
}
