class Solution {
    public int solution(int n, int k) {
        int a = 0;
        int b = 0;
        int c = 0;
        a = n/10 * 2000;
        b = n*12000;
        c = k*2000;
        int answer = 0;
        answer = b + c - a;
        return answer;
    }
}