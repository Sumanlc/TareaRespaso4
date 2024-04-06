package es.iesmz.tests;

public class Vector {
    public static int[] reverso(int[] v) {
        int[] nuevoVector = new int[v.length];
        for (int i = v.length - 1, j = 0; i >= 0; i--, j++) {
            nuevoVector[j] = v[i];
        }
        return nuevoVector;
    }
}
