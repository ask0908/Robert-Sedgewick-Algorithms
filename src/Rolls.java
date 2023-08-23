/**
 * Counter를 써서 T번의 주사위 던지기를 시뮬레이션
 */
public class Rolls {
    public static void main(String[] args) {
        int T = Integer.parseInt(args[0]);
        int SIDES = 6;

        // Counters 초기화
        Counter[] rolls = new Counter[SIDES + 1];
        for (int i = 1; i <= SIDES; i++) {
            rolls[i] = new Counter(i + "'s");
        }

        // 주사위 굴리기
        for (int t = 0; t < T; t++) {
            int result = StdRandom.uniformInt(1, SIDES + 1);
            rolls[result].increment();
        }

        // 결과 출력
        for (int i = 1; i <= SIDES; i++) {
            StdOut.println(rolls[i]);
        }
    }
}
