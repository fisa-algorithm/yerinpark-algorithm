import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.StringTokenizer;

class Solution {
    public int solution(String s) {
        int answer = 0;

        /* 문제 분석 */

        // 문자열에서 같은 값이 연속해서 나타나는 것을 그 문자의 개수와 반복되는 값으로 표현하여
        // 더 짧은 문자열로 줄여서 표현하는 알고리즘을 공부하고 있습니다.


        /* test case 1 */
        // aa bb a ccc
        // 2a 2b a 3c


        // 문자열을 1개 이상의 단위로 잘라서 압축하여 더 짧은 문자열로 표현할 수 있는지 방법을 찾아보려고 합니다.

        // 단위 -> 1개, 2개, 8개, ...


        /* test case 2 */
        // ab ab cd cd ab ab cd cd
        // 2개 단위 : 2ab 2cd 2ab 2cd
        // 8개 단위 : 2ababcdcd

        /* test case 3 */
        // abc abc de de
        // 2개 단위 : abc abc 2de
        // 3개 단위 : 2abc de de


        /* 문제 풀이 */
        // 1개 단위, 2개 단위, ... , n/2개 단위까지 잘라보기
        // aa bb a ccc
        // 2a 2b a 3c
        int len = s.length();

        Stack stack = new Stack();
        stack.add(s.substring(0, 1));


        // 문자열의 길이
        int str_len = 1;

        for(int i = 1; i < len - 1; i++) {
            if(stack.peek() == s.substring(i, i + 1)) {
                str_len++;
            } else {
                if(stack.size() == 1) {
                    System.out.println("answer1 = " + answer);
                    answer += 1;
                } else {
                    System.out.println("answer2 = " + answer);
                    answer += 2;
                }
                stack.clear();
            }
            stack.add(s.substring(i, i + 1));
        }

        System.out.println(answer);




        // answer : 압축하여 표현한 문자열 중 가장 짧은 것의 길이

        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        String str = "aabbaccc";
        s.solution(str);
    }
}