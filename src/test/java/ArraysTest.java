import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArraysTest {
    static Arrays sut;

    @BeforeAll
    public static void started(){
        System.out.println("Тестирование запущено");
        sut = new Arrays();
    }

    @AfterAll
    public static void finished(){
        System.out.println("Тестирование окончено");
    }

    @Test
    public void testDirectSorting(){
        // arrange
        int[] arr = {5, 7, 1, 3, 9, 2};
        int[] expected = {1, 2, 3, 5, 7, 9};
        // act
        int[] result = sut.directSorting(arr);
        // assert
        assertArrayEquals(expected, result);
    }

    @Test
    public void testReverseSorting(){
        // arrange
        int[] arr = {5, 7, 1, 3, 9, 2};
        int[] expected = {9, 7, 5, 3, 2, 1};
        // act
        int[] result = sut.reverseSorting(arr);
        // assert
        assertArrayEquals(expected, result);
    }

    @Test
    public void testGetMin(){
        // arrange
        int[] arr = {5, 7, 1, 3, 9, 2};
        int expected = 1;
        // act
        int result = sut.getMin(arr);
        // assert
        assertEquals(expected, result);
    }

    @Test
    public void testGetMax(){
        // arrange
        int[] arr = {5, 7, 1, 3, 9, 2};
        int expected = 9;
        // act
        int result = sut.getMax(arr);
        // assert
        assertEquals(expected, result);
    }

    @Test
    public void testArrayIndexOutOfBoundsException(){
        // arrange
        int[] arr = {};
        var expected = ArrayIndexOutOfBoundsException.class;
        // assert
        assertThrows(expected, () -> sut.getMax(arr));
    }

}
