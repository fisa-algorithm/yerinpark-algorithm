import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B퇴사 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());

        int[] T = new int[N + 1];
        int[] P = new int[N + 1];

        for(int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());
            T[i] = Integer.parseInt(st.nextToken());
            P[i] = Integer.parseInt(st.nextToken());
        }
        // end of input

        // 종료일 우선으로 생각해보기
        // - N+1일째에는 회사에 없음
        // - 종료일 전까지는 새로운 상담을 받을 수 없음

        int[] profit = new int[N + 1];

        for(int i = N; i >= 0; i--) {
            if(i + T[i] <= N + 1) {
                // 상담 on
                profit[i] = T[i];
            } else {
                // 만일 상담 종료일이 N+1일째 이상이면 상담 불가
                // 그럼 얜 뭐하지

            }
        }
    }
}
