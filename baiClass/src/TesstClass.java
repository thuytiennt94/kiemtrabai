package Form;
public class TesstClass {
    public static void main(String[] args) {
        Student1 s1= new Student1("Thai", "B01", 19,"tôn thất thuyết");
        System.out.println(s1);
        s1.setAddress("Thành phố HCM");
        System.out.println(s1.getAddress());
        s1.setName();
    }
}
