package part8;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class Task82Test {
    private static boolean[][] grid;

    @Test
    public void getPath() throws Exception {
        List<Point> path = Task82.getPath(grid);

        path.forEach(System.out::println);
    }

    @Before
    public void setUp() throws Exception {
        grid = new boolean[3][3];
        grid[0][0] = true;
        grid[0][1] = false;
        grid[0][2] = true;
        grid[1][0] = true;
        grid[1][1] = true;
        grid[1][2] = true;
        grid[2][0] = false;
        grid[2][1] = true;
        grid[2][2] = true;

//        grid = new boolean [2][2];
//        grid[0][0] = true;
//        grid[0][1] = true;
//        grid[1][0] = false;
//        grid[1][1] = true;
    }
}