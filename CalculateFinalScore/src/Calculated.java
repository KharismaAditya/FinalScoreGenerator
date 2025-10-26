public interface Calculated {
    /**
     * Menghitung nilai akhir siswa berdasarkan nilai dan kehadiran.
     *
     * @param s objek {@link Student} yang berisi data nilai dan kehadiran.
     * @return nilai akhir hasil perhitungan.
     */

    static double calculateFinalScore(Student s) {
        return s.getGrade() * School.SCORE_RATE + s.getAttendance() * School.ATTEND_RATE;
    }
}
