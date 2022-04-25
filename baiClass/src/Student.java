public class Student {
    private int RollNo;
    private String Name;
    private ClassRoom myClass;
    public Student(int rollno, String name){
        this.RollNo = rollno;
        this.Name = name;
        this.myClass = new ClassRoom();
    }
    public Student(int rollno, String name, ClassRoom myclass){
        this.RollNo = rollno;
        this.Name = name;
        this.myClass = myclass;
    }

    public int getRollNo() {
        return RollNo;
    }

    public void setRollNo(int rollNo) {
        RollNo = rollNo;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setMyClass(ClassRoom myClass) {
        this.myClass = myClass;
    }

    @Override
    public String toString() {
        return "Student: " + "RollNo=" + RollNo + ", Name='" + Name +  ", myClass=" + myClass +".";
    }

    public static void main(String[] args) {
        Student st = new Student(1, "hoa");
        System.out.println(st);
        Student st2 = new Student(2, "Anh", new ClassRoom(2,"T2109M"));
        System.out.println(st2);
        st2.setName("quynh");
        st2.setRollNo(3);
        System.out.println("ID: " + st2.getRollNo() + ", Name: " + st2.getName());
    }
}
