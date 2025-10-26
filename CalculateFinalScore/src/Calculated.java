public interface Calculated {
    static double calculateFinalScore(Student s) {
        return s.getGrade() * School.SCORE_RATE + s.getAttendance() * School.ATTEND_RATE;
    }
}
