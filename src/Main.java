public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(98, 90, 92);
        Student student2 = new Student(78, 76, 82);
        Student student3 = new Student(91,87,80);

        student1.name = "Rimpal";
        student1.phoneNumber = 875461289;
        student1.totalMarks( );
        System.out.println("Total Marks obtained by " + student1.name + " are " + student1.totalMarks());

        student2.name = "Mohan";
        student2.phoneNumber = 12345783;
        student2.totalMarks( );
        System.out.println("Total Marks obtained by " + student2.name + " are " + student2.totalMarks() );

        student3.name = "Sakshi";
        student3.phoneNumber = 98367214;
        student3.totalMarks();
        System.out.println("Total Marks obtained by " + student3.name + " are " + student3.totalMarks() );
    }
}
