import java.util.ArrayList;

class School implements Calculated {
    public static final double SCORE_RATE = 0.8;
    public static final double ATTEND_RATE = 0.2;

    public void printResult(ArrayList<Student> s) {
        System.out.println("=== RESULT(S) ===");
        for(Student s1 : s){
            double score = Calculated.calculateFinalScore(s1);
            if (score >= 75) {
                System.out.println(s1.getName() + " passed with score :" + score);
            } else {
                System.out.println(s1.getName() + " failed with score :" + score);
            }
        }
    }

}