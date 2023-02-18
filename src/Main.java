public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();

        student1.name = "Rimpal";
        student1.phoneNumber = 875461289;
        student1.marksMath = 98;
        student1.marksScience = 90;
        student1.marksChemistry = 92;
         int sum1 = student1.marksMath + student1.marksScience + student1.marksChemistry;
        System.out.println("Total Marks obtained by " + student1.name + " are " + sum1);

        student2.name = "Mohan";
        student2.phoneNumber = 12345783;
        student2.marksMath = 83;
        student2.marksScience = 76;
        student2.marksChemistry = 81;
        int sum2 = student2.marksMath + student2.marksScience + student2.marksChemistry;
        System.out.println("Total Marks obtained by " + student2.name + " are " + sum2);

        student3.name = "Sakshi";
        student3.phoneNumber = 98367214;
        student3.marksMath = 64;
        student3.marksScience = 89;
        student3.marksChemistry = 90;
        int sum3 = student3.marksMath + student3.marksScience + student3.marksChemistry;
        System.out.println("Total Marks obtained by " + student3.name + " are " + sum3);
    }
}
