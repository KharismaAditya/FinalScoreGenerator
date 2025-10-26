import java.util.ArrayList;
/**
 * Kelas yang merepresentasikan sistem sekolah untuk menghitung hasil akhir siswa.
 * Mengimplementasikan interface {@link Calculated}.
 */

class School implements Calculated {
    /** Bobot nilai akademik. */
    public static final double SCORE_RATE = 0.8;
    /** Bobot kehadiran siswa. */
    public static final double ATTEND_RATE = 0.2;

    /**
     * Menampilkan hasil perhitungan nilai akhir seluruh siswa.
     *
     * @param s daftar {@link Student} yang akan dihitung nilainya.
     */
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