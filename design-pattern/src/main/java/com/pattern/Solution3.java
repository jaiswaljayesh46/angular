package com.pattern;

import java.util.Arrays;

public class Solution3 {
    public static void main(String[] args) {
        Solution3 s = new Solution3();
       // int[] A={3, 2, 4, 3}; int F=2; int M=4;
        int[] A={1, 2, 3, 4}; int F= 4; int M=6;
        int[] finalA = s.solution(A,F,M);
        Arrays.stream(finalA).forEach(a -> System.out.print(a + "   "));
    }

    public int[] solution(int[] A, int F, int M) {

        int sum = Arrays.stream(A).sum();
        int diff = (M * (A.length+F)) - sum;
        if(diff >0 && ((F*6) >= diff) ){
            int arr[] = new int[F];
            int f = 0;
            for(int i=1;i<=diff;i++){
                arr[f] = arr[f] + 1;
                f++;
                if(f == F){
                    f = 0;
                }
            }
            return arr;
        }
        int x[] = {0};
        return x;
    }
}
