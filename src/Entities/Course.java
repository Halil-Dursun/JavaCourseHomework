package Entities;

public class Course {
    private String id;
    private String courseName;
    private double price;

    public Course(){}
    public Course(String id,String courseName,double price){
        this.id = id;
        this.courseName = courseName;
            this.price = 0;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
            this.price = price;
    }
}
