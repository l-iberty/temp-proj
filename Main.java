import java.util.*;

public class Main {
    void solve1(int[] A, int[] B) {
        int i, j;
        for (i = 1; i < A.length; i++) {
            if (A[i] < A[i - 1]) break;
        }

        Queue<Integer> q = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        for (int x : B) q.add(x);

        int x = Integer.MAX_VALUE;
        while (!q.isEmpty() && i + 1 < A.length) {
            x = q.poll();
            if (x < A[i + 1] && x > A[i - 1]) break;
        }

        if (x == Integer.MAX_VALUE) {
            System.out.println("NO");
        } else {
            A[i] = x;
            for (j = 0; j < A.length - 1; j++) {
                System.out.print(A[j] + " ");
            }
            if (j < A.length) {
                System.out.println(A[j]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Main m = new Main();
        while (sc.hasNext()) {
            String[] strA = sc.nextLine().split(" ");
            String[] strB = sc.nextLine().split(" ");
            int[] A = new int[strA.length];
            int[] B = new int[strB.length];
            for (int i = 0; i < strA.length; i++) {
                A[i] = Integer.valueOf(strA[i]);
            }
            for (int i = 0; i < strB.length; i++) {
                B[i] = Integer.valueOf(strB[i]);
            }
            m.solve1(A, B);
        }

    }
}
