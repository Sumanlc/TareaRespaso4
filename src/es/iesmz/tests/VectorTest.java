package es.iesmz.tests;

import org.junit.jupiter.api.Test;

import static es.iesmz.tests.Vector.reverso;
import static org.junit.jupiter.api.Assertions.*;

class VectorTest {
    @Test
    public void testReverso1() {
        int[] v = {1, 2, 3, 4, 5, 6};
        int[] expected = {6, 5, 4, 3, 2, 1};
        int[] reversed = reverso(v.clone());
        assertArrayEquals(expected, reversed);
    }
    @Test
    public void testReverso2() {
        int[] v = {10, 12, 5, 221, 6, 7};
        int[] expected = {7, 6, 221, 5, 12, 10};
        assertArrayEquals(expected, reverso(v));
    }
    @Test
    public void testReverso3() {
        int[] v = {5};
        int[] expected = {5};
        assertArrayEquals(expected, reverso(v));
    }
    @Test
    public void testReverso4() {
        int[] v = {5, 10, 20};
        int[] expected = {20, 10, 5};
        assertArrayEquals(expected, reverso(v));
    }
}