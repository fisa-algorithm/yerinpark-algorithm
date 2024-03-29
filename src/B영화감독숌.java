import java.util.Scanner;

public class B영화감독숌 {

    public static void main(String[] args) {
        // 종말의 수란 어떤 수에 6이 적어도 3개 이상 연속으로 들어가는 수

        // 제일 작은 종말의 수는 666이고, 그 다음으로 큰 수는 1666, 2666, 3666, .... 이다.
        /*
         * 0[666]                1번째
         * 1[666]                2번째
         * 2[666]                3번째
         * ...
         * 5[666]                6번째
         *
         * -> 6을 만나는 순간 9개 더 추가
         * [666]0                7번째
         * [666]1
         * [666]2
         * ...
         * [666]9                16번째(6+10)
         * ------------------------
         * 7[666]                17번째
         * 8[666]                18번째
         * 9[666]                19번째
         * 10[666]                20번째
         * 11[666]                21번째
         * ...
         * 15[666]                25번째
         * -> 6을 만나는 순간 9개 더 추가
         * 1[666]0                26번째
         * 1[666]1
         * 1[666]2
         * ...
         * 1[666]9                35번째(25+10)
         * -------------------------
         * 17[666]                36번째
         *...
         * 65[666]
         * -> 66을 만나는 순간 99개 더 추가
         * [666]00
         *
         * */

        // 일의 자리수면 6으로 나눠본다. 나머지가 0이면 9개 추가
        // 십의 자리수면 10으로 나눈 나머지를 6으로 나눠본다. 나머지가 0이면 9개 추가
        // 10으로 나눈 몫이 6이고 나머지를 6으로 나눠봤을 때 나머지가 0이면 99개 추가

        // 6번째(input)면 9 더하기
        // 더한 값(sum)에 9 더하기


        //  N번째 영화의 제목은 세상의 종말 (N번째로 작은 종말의 수) 와 같다.

        // 첫째 줄에 N번째 영화의 제목에 들어간 수를 출력한다.
        Scanner s = new Scanner(System.in);

    }

}
