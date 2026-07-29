class Solution {
    public double solution(int[] numbers) {
        double a = 0;
        for (int i = 0; i < numbers.length; i++){
            a += numbers[i];
        }
        a = a / numbers.length;
        return a;
    }
}