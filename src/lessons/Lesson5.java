package lessons;

import java.util.*;

public class Lesson5 {
    public static void main(String[] args) {

        for (Integer a : new RandomIterable()) {
            System.out.println(a);
        }

        System.out.println("------------------------------");

        Iterator<Integer> iterator = new RandomIterable().iterator();
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());

        System.out.println("========================");
        List<String> l = Arrays.asList("123", "345", "567");
        Iterator<String> it1 = l.iterator();
        Iterator<String> it2 = l.iterator();

        System.out.println(it1.next());
        System.out.println(it1.next());

        System.out.println(it2.next());
        System.out.println(it2.next());



    }


    /**
     * Итерабл на 10 рандомных чисел
     */
    static class RandomIterable implements Iterable<Integer> {

        @Override
        public Iterator<Integer> iterator() {
            return new TempClassIterator();
        }
    }

    /**
     * Итератор на 10 рандомных чисел, используется в RandomIterable
     */
    static class TempClassIterator implements Iterator<Integer> {
        Random random = new Random();
        int count = 10;

        @Override
        public boolean hasNext() {
            if (count == 0)
                return false;
            return true;
        }

        @Override
        public Integer next() {
            count--;
            return random.nextInt(101);
        }


    }
}
