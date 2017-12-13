package test;

import java.time.LocalDate;
import java.time.Period;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Course {
    String title;
    LocalDate start;
    LocalDate end;
    int durationDays;

    public Course(String title, LocalDate start, LocalDate end) {
        this.title = title;
        this.start = start;
        this.end = end;
        this.durationDays = Period.between(start, end).getDays();
    }

    public static LinkedList<Course> getMaxCourses(List<Course> courses){
        LinkedList<Course> maxCourses = new LinkedList<>();

        courses.sort(Comparator.comparing(course -> course.end));

        for (Course course : courses) {
            if(!maxCourses.isEmpty()){
                Course lastCourse = maxCourses.getLast();
                if(lastCourse.end.isBefore(course.start)){
                    maxCourses.addLast(course);
                }
            }else {
                maxCourses.add(course);
            }
        }
        return maxCourses;
    }

    @Override
    public String toString() {
        return title + ": start on " + start +
                ", end on " + end +
                "; duration in days is " + durationDays;
    }
}


