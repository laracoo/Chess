package lessons;

import java.util.Iterator;

public class Lesson5H extends lesson4 {
    public static void main(String[] args) {

        StringIterable stringIterable = new StringIterable("12asgw234Awgs2wAwqazvscwsh3#E3 xE#X34#$4%%#\n\n\n===");
        Iterator<String> stringIterator = stringIterable.iterator();
        System.out.println(stringIterator.next());
        System.out.println(stringIterator.next());
        System.out.println(stringIterator.next());
        System.out.println(stringIterator.next());

        for (String s : stringIterable) {
            System.out.println(s);
        }

    }

    static class StringIterable implements Iterable<String> {
        final String baseString;

        public StringIterable(String baseString) {
            this.baseString = baseString;

        }

        @Override
        public Iterator<String> iterator() {
            return new StringIterator(baseString);
        }
    }

    /**
     * TODO Homework 5
     * Написать реализацию итератора
     */
    static class StringIterator implements Iterator<String> {
        final String baseString;
        int b = 0;

        public StringIterator(String baseString) {
            this.baseString = baseString;
        }

        @Override
        /**
         * Вернуть true если есть следующий элемент
         */
        public boolean hasNext() {
            int length = baseString.length();
            if (b >= length)
                return false;
            return  true;
        }

        @Override
        public String next() {

            Character c = baseString.charAt(b++);

            return c.toString();
        }
    }
}
