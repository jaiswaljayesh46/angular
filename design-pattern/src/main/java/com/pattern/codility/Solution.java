package com.pattern.codility;

public class Solution {
    public static void main(String[] args) {
        Solution s = new Solution();
       int[] A = {1,2,5,9,9,10};
        int X = 10;
       /* int[] A = {5,8};
        int X = 10;*/
        System.out.println(s.solution(A,X));
    }

    int solution(int[] A, int X) {
        int N = A.length;
        if (N == 0) {
            return -1;
        }
        int l = 0;
        int r = N - 1;
        while (l < r-1) {
            int m = (l + r) / 2;
            if (A[m] > X) {
                r = m - 1;
            } else {
                l = m;
            }
        }
        if (A[l] == X) {
            return l;
        }
        if (A[r] == X) {
            return r;
        }
        return -1;
    }

    /*int solution(int[] A, int X) {
        int N = A.length;
        if (N == 0) {
            return -1;
        }
        int l = 0;
        int r = N - 1;
        while (l <= r) {
            int m = l + (r) / 2;
            if (A[m] == X) {
                return m;
            }
            if (A[m] > X) {
                r = m - 1;
            } else {
                l = m;
            }
        }

        return -1;
    }*/
    /*int solution(int[] A, int X) {

            int N = A.length;
            if (N == 0) {
                return -1;
            }
            int l = 0;
            int r = N - 1;
            while (l <=r) {
                int m = l + (r-1) / 2;
                if (A[m] == X) {
                    return m;
                }
                if (A[m] > X) {
                    r = m - 1;
                } else {
                    l = m+1;
                }
            }
            return -1;
        }*/

}
