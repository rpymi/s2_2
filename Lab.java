public class Lab {
    // Array of the students
    private Student[] students;
    // average of the students gardes
    private int avg;
    // day of the students class
    private String day;
    // capacity of the lab
    private int capacity;
    // the number of the enrolled students
    private int currentSize;

    /**
     * lab's information
     * @param cap capacity of the lab
     * @param d day of the lab
     */
    public Lab(int cap, String d) {
        capacity = cap;
        day = d;
        students = new Student[capacity];
        currentSize = 0;
    }

    /**
     * enroll the student
     * @param std information of the student
     */
    public void enrollStudent(Student std) {
        if (currentSize < capacity) {
            students[currentSize] = std;
            currentSize++;
        } else {
            System.out.println("Lab is full!!!");
        }
    }
    /**
     * print the information  of the lab's students
     */
    public void print(){
        for(int i = 0; i < currentSize; i++) {
            System.out.println("std Fname: " + students[i].getFirstName() + " std id:" + students[i].getId()
                    + " std grade:" + students[i].getGrade());
        }
        calculateAvg();
        System.out.println("Lab AVG:" + avg);
    }

    /**
     * @return the array of the students
     */
    public Student[] getStudents() {
        return students;
    }

    /**
     * @param students set the array of the students
     */
    public void setStudents(Student[] students) {
        for(int i = 0; i < currentSize; i++){
            this.students[i] = students[i];
        }
    }

    /**
     * @return average of the students
     */
    public int getAvg() {
        return avg;
    }

    /**
     * calculate the average of the lab
     */
    public void calculateAvg() {
        int sum = 0;
        for(int i = 0; i < currentSize; ++i){
            sum += students[i].getGrade();
        }
        avg = sum / currentSize;
    }

    /**
     * @return day of the lab
     */
    public String getDay() {
        return day;
    }

    /**
     * @param day set the day of the lab
     */
    public void setDay(String day) {
        this.day = day;
    }

    /**
     * @return the capacity of the lab
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * @param capacity set the capacity of the lab
     */
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
