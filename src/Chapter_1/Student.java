package Chapter_1;


public abstract class Student {

    public int id;
    public String name;
    public String major;
    public double grade;
    public static double mid = 25;
    public static double project = 25;
    public static double Final = 30;
    public static double report = 5;
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

}
