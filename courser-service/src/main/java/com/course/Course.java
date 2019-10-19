package com.course;

import java.io.Serializable;

/**
 * @author :haohaounique
 * @Detaildescription :
 * @date : 2019/10/14
 */
public class Course implements Serializable {
    private String courseName;
    private Double price;

    public Course() {
    }

    public Course(String courseName, Double price) {
        this.courseName = courseName;
        this.price = price;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", price=" + price +
                '}';
    }
}
