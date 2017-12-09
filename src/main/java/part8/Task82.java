package part8;

import java.util.HashMap;
import java.util.LinkedList;

/**
 * 2 hours or more
 */
public class Task82 {

    public static LinkedList<Point> getPath(boolean[][] grid) {

        LinkedList<Point> path = new LinkedList<>();
        HashMap<Point, Boolean> visited = new HashMap<>();
        int len = grid.length - 1;

        buildPath(grid, len, len, path, visited);
        return path;
    }

    private static boolean buildPath(boolean[][] grid, int row, int column, LinkedList<Point> path, HashMap<Point, Boolean> visited) {
        Point point = new Point(row, column);
        if (visited.containsKey(point)) {
            return visited.get(point);
        }

        path.addFirst(point);

        if (row == 0 & column == 0) {
            return true;
        }
        boolean success = false;
        if (row >= 1 && isFree(row - 1, column, grid)) {
            success = buildPath(grid, row - 1, column, path, visited);
        }
        if (!success && isFree(row, column - 1, grid)) {
            success = buildPath(grid, row, column - 1, path, visited);
        }
        if (!success) {
            path.remove(point);
        }
        visited.put(point, success);
        return success;
    }

    private static boolean isFree(int row, int column, boolean[][] grid) {
        return grid[row][column];
    }

}

class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
