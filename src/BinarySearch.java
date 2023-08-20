import java.util.Arrays;

public class BinarySearch {
    public static int rank(int key, int[] a) {
        // 배열 a는 이미 정렬된 상태여야 한다
        int lo = 0;
        int hi = a.length - 1;

        while (lo <= hi) {
            // key가 a[lo..hi]에 있거나 존재하지 않음
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid]) {
                hi = mid - 1;
            } else if (key > a[mid]) {
                lo = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }

    public static int rank2(int key, int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        In in = new In(args[0]);
        int[] whiteList = in.readAllInts();
        Arrays.sort(whiteList);

        while (!StdIn.isEmpty()) {
            // R키를 읽어서 whiteList에 없으면 출력
            int key = StdIn.readInt();
            if (rank(key, whiteList) == -1) {
                StdOut.println(key);
            }
        }
    }
}