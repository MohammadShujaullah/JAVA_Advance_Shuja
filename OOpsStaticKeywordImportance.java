/*The word static means "belongs to the class, not to any specific object".

Normally, variables & methods belong to objects.
But when you make something static, it belongs to the class itself, and all objects share it. */

class student {
    static int n = 20;
    String name;
    static String school;

    public void changeschool() {
        school = "newschool";

    }

}

public class OOpsStaticKeywordImportance {
    public static void main(String[] args) {
        student s1 = new student();
        s1.name = "abc";
        s1.school = "xyz";

        System.out.println(s1.name);
        System.out.println(student.school);
        System.out.println(student.n);
        s1.changeschool();
        System.out.println(student.school);
    }
}
