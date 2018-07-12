public class Student {
    String name;

    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        System.out.println("0");
        System.out.println(student1.toString() + "\t" + student2.toString() + "\t" + student3.toString());
        student1 = student3;
        System.out.println("1");
        System.out.println(student1.toString() + "\t" + student2.toString() + "\t" + student3.toString());
        student3 = student2;
        System.out.println("2");
        System.out.println(student1.toString() + "\t" + student2.toString() + "\t" + student3.toString());
        student2 = null;
        System.out.println("3");
        System.out.println(student1.toString() + "\t" + student2 + "\t" + student3.toString());
        float f;
        f = 4;
    }
}


