class Student {
    private String name;
    private int grade;
    private int attendance;

    /**
     * Konstruktor untuk membuat objek siswa baru.
     *
     * @param name nama siswa.
     * @param grade nilai akademik siswa.
     * @param attendance tingkat kehadiran siswa.
     */
    public Student(String name, int grade, int attendance) {
        this.name = name;
        this.grade = grade;
        this.attendance = attendance;
    }

    /** @return nama siswa. */
    public String getName() {
        return name;
    }
    /** @param name nama baru untuk siswa. */
    public void setName(String name) {
        this.name = name;
    }
    /** @return nilai akademik siswa. */
    public int getGrade() {
        return grade;
    }
    /** @param grade nilai akademik baru. */
    public void setGrade(int grade) {
        this.grade = grade;
    }
    /** @return kehadiran siswa. */
    public int getAttendance() {
        return attendance;
    }
    /** @param attendance kehadiran baru untuk siswa. */
    public void setAttendance(int attendance) {
        this.attendance = attendance;
    }
}
