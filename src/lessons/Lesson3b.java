package lessons;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Lesson3b {
    public static void main(String[] args) {
        DataBase db = new MyDataBase2();

        Closeable cl = new MyDataBase2();
        List<String> list = db.getList();

        List l = new ArrayList();

    }

    interface DataBase {
        List<String> getList();
        int size();
        boolean isEmpty();
    }

    static abstract class MyDataBase implements DataBase {
        @Override
        public List<String> getList() {
            return new ArrayList<>();
        }


    }

    static class MyDataBase2 extends MyDataBase implements DataBase, Closeable {
        @Override
        public List<String> getList() {
            return new LinkedList<>();
        }

        @Override
        public void close() {

        }

        @Override
        public int size() {
            return 0;
        }

        @Override
        public boolean isEmpty() {
            return false;
        }
    }


}
