package lessons;

import java.util.Iterator;
import java.util.Random;

public class Lesson6 {
    public static void main(String[] args) {
        User user = new User();

        for (String a : user) {
            System.out.println(a);
        }

        /*
        Iterator<String> iterator = new UserIterable(user).iterator();
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());*/


    }
    static class User implements Iterable<String> {
        String name = "aaa";
        String surname = "bbbb";
        String fathersName = "ccc";

        @Override
        public Iterator<String> iterator() {
            return new UserIterator(this);
        }
    }


    static class UserIterator implements Iterator<String> {
        User user;
        int i = 0;


        public UserIterator(User user) {
            this.user = user;
        }

        @Override
        public boolean hasNext() {
            return i<3;
        }

        @Override
        public String next() {
            i++;
            if (i == 1) {
                return user.name;
            }
            if (i == 2) {
                return user.surname;
            }
            if (i == 3) {
                return user.fathersName;
            }
            return "";
        }


    }
}
