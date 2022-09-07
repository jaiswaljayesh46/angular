package com.pattern;

class Solution1 {
    public static void main(String[] args) {
        Solution1 s = new Solution1();
        //int X = 100;        int Y = 63;        int A[]= {100,63,1,6,2,13};//5
        //int X =7;int Y = 42; int A[]= {6, 42, 11, 7, 1, 42};//4
        //int X = 7;        int Y = 42;        int A[]= {6,42,11,7,1,42};//4
        //int X = 6;        int Y = 13;        int A[]= {13,13,1,6};//-1
        int X = 2;        int Y = 2;        int A[]= {2,2,2,2};
       // Arrays.stream(A).forEach(a -> System.out.print(a + "   "));
        //System.out.println();
        System.out.println(s.solution(X,Y,A));
    }
    int solution(int X, int Y, int[] A) {
        int N = A.length;
        int result = -1;
        int nX = 0;
        int nY = 0;
        for (int i = 0; i < N; i++) {
            if (A[i] == X)
                nX += 1;
            if (A[i] == Y)
                nY += 1;
            if (nX == nY)
                result = i;
        }
        return result;
    }
}
