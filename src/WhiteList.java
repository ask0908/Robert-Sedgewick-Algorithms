public class WhiteList {
    public static void main(String[] args) {
        In in = new In(args[0]);
        int[] w = in.readAllInts();
        StaticSETofInts set = new StaticSETofInts(w);

        while (!StdIn.isEmpty()) {
            // 키를 읽어서 WhiteList에 없으면 출력
            int key = StdIn.readInt();
            if (!set.contains(key)) {
                StdOut.println(key);
            }
        }
    }
}
