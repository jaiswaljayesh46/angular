package com.pattern.codility;

import java.util.Arrays;

public class Stroke {
    public static void main(String[] args) {
      /*  int A[] = {1,3,2,1,2,1,5,3,3,4,2};
        int n= A.length;*/
        int[] A = {1,1,1,1};
        int X = A.length;
        System.out.println(solution(A));

    }
    public static int solution(int[] A)
    {

        int bushstrokes = 0;
        int a = Arrays.stream(A).max().getAsInt();
int N= A.length;
        for (int i = 0; i < a; i++)
        {
            int iter = 0;
            while (iter < N)
            {
                if (A[iter] < i + 1)
                    if (iter != 0 && A[iter - 1] >= i + 1)
                    {
                        bushstrokes++;
                        iter++;
                        continue;
                    }
                iter++;
            }
            if (A[iter - 1] >= i + 1)
                bushstrokes++;
        }
        return bushstrokes;
    }
}
