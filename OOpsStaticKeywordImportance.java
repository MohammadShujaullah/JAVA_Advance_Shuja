class Student {
    String name;
    static String school;

    public static void changeschool() {
        school = "newschool";
    }
}

public class OOpsStaticKeywordImportance {
    public static void main(String args[]) {
        Student.school = "abc";
        Student s1 = new Student();
        System.out.println(s1.school);
    }
}
