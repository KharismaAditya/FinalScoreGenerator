import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Mainapp {
    /**
     * Method utama yang menjadi titik awal eksekusi program.
     *
     * @param args argumen baris perintah (tidak digunakan).
     */
    public static void main(String[] args) {
        ArrayList<Student> std = new ArrayList<>();
        int jumlah = 0;

        System.out.println("=== CALCULATE FINAL SCORE ===");
        try{
            insertStudentData(std, jumlah);
        }catch (InputMismatchException e){
            System.out.println("Invalid input");
            insertStudentData(std, jumlah);
        }

    }



    public static void insertStudentData(ArrayList<Student> std, int jumlah){
        Scanner input = new Scanner(System.in);
        System.out.print("Insert the number of Student(s) (0 to exit): "); jumlah = input.nextInt();
        if(jumlah == 0){
            System.out.println(".. Exiting Program");
            return;
        }
        for(int i=0; i<jumlah; i++){
            addStudent(std, i);
        }
        School sch = new School();
        sch.printResult(std);
    }

    /**
     * Menambahkan data siswa baru ke dalam daftar.
     *
     * @param std daftar {@link Student}.
     * @param i indeks siswa saat ini.
     */
    public static void addStudent(ArrayList<Student> std, int i){
        Scanner input = new Scanner(System.in);
        String name;int grade; int attend;
        System.out.println("==STUDENT " + (i+1) + " ==");
        System.out.print("Insert Student Name: ");name =input.nextLine();
        System.out.print("Insert Student Grade: "); grade =input.nextInt();
        System.out.print("Insert Student Attendance: "); attend =input.nextInt();
        System.out.println();
        std.add(new Student(name,grade,attend));
    }
}
