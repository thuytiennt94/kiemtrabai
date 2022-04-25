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

    public String getName() {
        return Name;
    }

    public ClassRoom getMyClass() {
        return myClass;
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
        System.out.println(st2.getMyClass());
    }
}
