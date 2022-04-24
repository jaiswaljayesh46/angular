package com.pattern.codility;

public class SmallestNumber {
    public static void main(String[] args) {
        SmallestNumber s = new SmallestNumber();
        int[] A = {-3, -1, 1, -2, 2};
        System.out.println(s.solution(A));
    }


    int solution(int[] A) {
        int ans = A[0];
        for (int i = 1; i < A.length; i++) {
            if (ans > A[i]) {
                ans = A[i];
            }
        }
        return ans;
    }
}
