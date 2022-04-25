public class ClassRoom {
    private int classid;
    private String className;
    public ClassRoom(){
        classid = 1;
        className = "T2109A";
    }
    public ClassRoom(int id, String name){
        this.classid = id;
        this.className = name;
    }

    public int getClassid() {
        return classid;
    }

    public void setClassid(int id) {
        this.classid = id;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public String toString() {
        return "CLassRoom: id=" + classid + ", name=" + className;
    }

    /*public static void main(String[] args) {
        ClassRoom cr = new ClassRoom();
        System.out.println(cr);
    }*/
}
