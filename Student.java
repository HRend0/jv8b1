public class Student {
    public int id;
    public String name;
    public int age;

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Student st = new Student(101, "Nguyen Van Nam", 20);

        System.out.println("ID: " + st.id + ", Name: " + st.name + ", Age: " + st.age);
    }
}