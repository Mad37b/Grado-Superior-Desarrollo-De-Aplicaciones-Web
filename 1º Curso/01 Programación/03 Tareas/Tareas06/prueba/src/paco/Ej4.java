package paco;

import java.io.*;
import java.util.*;

/**
 * Ejercicio 4 todo de paco con chatgpt
 *
 * @author Ulises III
 */
public class Ej4 {

    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner(System.in);
        StringBuilder sb = new StringBuilder();

        while (true) {
            int c = sc.nextInt();
            int f = sc.nextInt();
            int a = sc.nextInt();

            if (c == 0 && f == 0 && a == 0) {
                break;
            }

            boolean[][] arbol = new boolean[f][c];
            List<int[]> trees = new ArrayList<>();

            for (int i = 0; i < a; i++) {
                int x = sc.nextInt() - 1; // columnas
                int y = sc.nextInt() - 1; // filas
                arbol[y][x] = true;
                trees.add(new int[]{y, x});
            }

            boolean[][] sombra = new boolean[f][c];

            int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
            int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};

            for (int[] t : trees) {
                int y = t[0], x = t[1];
                for (int k = 0; k < 8; k++) {
                    int ny = y + dy[k];
                    int nx = x + dx[k];
                    if (ny >= 0 && ny < f && nx >= 0 && nx < c && !arbol[ny][nx]) {
                        sombra[ny][nx] = true;
                    }
                }
            }

            int res = 0;
            for (int i = 0; i < f; i++) {
                for (int j = 0; j < c; j++) {
                    if (sombra[i][j]) {
                        res++;
                    }
                }
            }

            sb.append(res).append("\n");
        }

        System.out.print(sb);
    }

    // Fast Scanner
    static class FastScanner {

        private InputStream in;
        private byte[] buffer = new byte[1 << 16];
        private int ptr = 0, len = 0;

        FastScanner(InputStream is) {
            in = is;
        }

        private int read() throws IOException {
            if (ptr >= len) {
                len = in.read(buffer);
                ptr = 0;
                if (len <= 0) {
                    return -1;
                }
            }
            return buffer[ptr++];
        }

        int nextInt() throws IOException {
            int c;
            while ((c = read()) <= ' ') {
                if (c == -1) {
                    return -1;
                }
            }
            int sign = 1;
            if (c == '-') {
                sign = -1;
                c = read();
            }
            int val = c - '0';
            while ((c = read()) > ' ') {
                val = val * 10 + (c - '0');
            }
            return val * sign;
        }
    }
}
