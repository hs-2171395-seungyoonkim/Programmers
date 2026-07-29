class Solution {
    public int solution(int num1, int num2) {
        double answer = 0;
        double a = num1;
        double b = num2;
        answer = a / b;
        answer *= 1000;
        return (int)answer;
    }
}