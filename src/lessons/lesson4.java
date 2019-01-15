package lessons;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class lesson4 {
    public static void main(String[] args) {
        List<Point> list = new ArrayList<>(Arrays.asList(
                new Point(12, 23),
                new Point(78, 12),
                new Point(78, 12),
                new Point(45, 56),
                new Point(12, 78),
                new Point(12, 45),
                new Point(12, 45),
                new Point(78, 12),
                new Point(78, 12)
        ));

        System.out.println(list);
        Point point = list.get(1);
        System.out.println(list.remove(point));
        while (list.remove(point)) {
            System.out.println("est");
        }
        System.out.println(list.remove(point));
        System.out.println(list);



        for (int i = 0; i < list.size(); i++) {
            Point t = list.get(i);
            for (int j = i + 1; j < list.size(); j++) {
                Point u = list.get(j);
                int x1 = u.x;
                int x2 = t.x;
                int y1 = t.y;
                int y2 = u.y;
                if (u.equals(t)) {
                    System.out.println(t);

                }
            }
        }


    }

    public static void get() {

    }

    static class Point {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return "(" + x + ", " + y + ")";
        }

        @Override
        public boolean equals(Object p) {
            Point other = (Point) p;
            if (x == other.x && y == other.y)
                return true;
            return false;
        }
    }
}
