public class Student {
    String name;
    int phoneNumber;
    int marksMath;
    int marksScience;
    int marksChemistry;

    public Student (int marksMath, int marksScience, int marksChemistry) {
        this.marksMath = marksMath;
        this.marksChemistry = marksChemistry;
        this.marksScience = marksScience;
    }

    public int totalMarks() {
       return marksMath + marksScience + marksChemistry;
    }
}
