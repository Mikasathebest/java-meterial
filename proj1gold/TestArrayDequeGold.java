import static org.junit.Assert.*;
import org.junit.Test;

public class TestArrayDequeGold {

    @Test
    public void testArrayDeque() {

        // @source StudentArrayDequeLauncher.jvav
        StudentArrayDeque<Integer> sad1 = new StudentArrayDeque<>();
        ArrayDequeSolution<Integer> ads1 = new ArrayDequeSolution<>();
        String msgAddOrRemove = "";
        for (int i = 0; i < 10; i += 1) {
            double numberBetweenZeroAndOne = StdRandom.uniform();

            if (numberBetweenZeroAndOne < 0.5) {
                sad1.addLast(i);
                ads1.addLast(i);
                msgAddOrRemove += String.format("addLast(%d)\n", i);
            } else {
                sad1.addFirst(i);
                ads1.addFirst(i);
                msgAddOrRemove += String.format("addFirst(%d)\n", i);
            }
        }

//        assertEquals(String.format("You give size %d. It should be %d",
//                sad1.size(), ads1.size()), sad1.size() , ads1.size());
        for (int i = 0; i < 9; i++) {
            double numberBetweenZeroAndOne = StdRandom.uniform();
            if (numberBetweenZeroAndOne < 0.5) {
                msgAddOrRemove += String.format("removeFirst()\n");
                assertEquals(msgAddOrRemove, ads1.removeFirst(), sad1.removeFirst());
            } else {
                msgAddOrRemove += String.format("removeLast()\n");
                assertEquals(msgAddOrRemove, ads1.removeLast(), sad1.removeLast());
            }
        }
    }
}
