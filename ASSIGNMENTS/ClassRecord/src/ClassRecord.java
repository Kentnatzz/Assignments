public class ClassRecord {
    private double prelim, midterm, prefi, finals;

    public ClassRecord(double prelim, double midterm, double prefi, double finals) {
        this.prelim = prelim;
        this.midterm = midterm;
        this.prefi = prefi;
        this.finals = finals;
    }

    public void showGrades() {
        System.out.println("Prelim: " + prelim);
        System.out.println("Midterm: " + midterm);
        System.out.println("Pre-Final: " + prefi);
        System.out.println("Finals: " + finals);
    }

    public double computeFinalGrade() {
        return (prelim * 0.2) + (midterm * 0.2) + (prefi * 0.3) + (finals * 0.3);
    }

    public void showFinalResult() {
        double finalGrade = computeFinalGrade();
        System.out.println("Final Grade: " + finalGrade);
        System.out.println(finalGrade >= 75 ? "Status: Passed" : "Status: Failed");
    }

    public static void main(String[] args) {
        ClassRecord student = new ClassRecord(99, 98, 88, 90);
        student.showGrades();
        student.showFinalResult();
    }
}
