package test;

import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.assertTrue;


public class CoursesTest {
    private static Course english;
    private static Course java;
    private static Course algorithms;
    private static Course bigData;
    private static Course agile;
    private static List<Course> allCourses;

    @Before
    public void setUp() throws Exception {
        english = new Course("english", LocalDate.of(2017, 12, 1), LocalDate.of(2017, 12, 5));
        java = new Course("java", LocalDate.of(2017, 11, 1), LocalDate.of(2017, 11, 15));
        algorithms = new Course("algorithms", LocalDate.of(2017, 12, 4), LocalDate.of(2017, 12, 15));
        bigData = new Course("bigData", LocalDate.of(2017, 12, 7), LocalDate.of(2017, 12, 15));
        agile = new Course("agile", LocalDate.of(2017, 12, 18), LocalDate.of(2017, 12, 20));

        allCourses = new ArrayList<>();
        allCourses.add(english);
        allCourses.add(java);
        allCourses.add(algorithms);
        allCourses.add(bigData);
        allCourses.add(agile);
    }

    @Test
    public void testGetMaxCourses() throws Exception {
        LinkedList<Course> maxCourses = Course.getMaxCourses(allCourses);

        LocalDate end = maxCourses.get(0).end;

        for (int i = 1; i < maxCourses.size(); i++) {
            assertTrue(end.isBefore(maxCourses.get(i).start));
            end = maxCourses.get(i).end;
        }

        maxCourses.forEach(System.out::println);
    }
}