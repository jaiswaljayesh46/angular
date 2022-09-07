package com.pattern;

import java.util.ArrayList;
import java.util.List;

public class Solution2 {
    public static void main(String[] args) {
        Solution2 s  = new Solution2();
        int[] A = {2, 2, 3, 4, 3, 3, 2, 2, 1, 1, 2, 5};//4
        //int[] A = {-3,-3};//1
        System.out.println(s.solution(A));
    }



    public int solution1(int[] A) {

        if(A.length<2)return A.length;
        int max = 1;
        int start = 0;
        int end = 0;
        while(start<A.length-1){
            //if the two elements are equal it will help in make a skip
            if(A[start]==A[start+1]){
                start++;
                continue;
            }
            end = start+1;
            while(end+1<A.length && isTur(A,end)){
                end++;
                //System.out.print(end+"    ");
            }
            //Finding the max subarray and updating the ans
            max = Math.max(max,end-start+1);
            //reseting the start to current end
            start = end;
        }
        return max;
    }

    private boolean isTur(int[] arr, int k){
        return(arr[k] > arr[k+1] && arr[k]>arr[k-1]) || (arr[k]<arr[k+1] && arr[k] < arr[k-1]);
    }



    public int solution(int[] A) {
        int h=1;
        int v=0;
        int n= A.length;
        int[] temp = new int[n];
        int j = 0;
        for (int i=0; i<n-1; i++){
            if (A[i] != A[i+1]){
                temp[j++] = A[i];
            }
        }
        temp[j++] = A[n-1];
        for (int i=0; i<j; i++){
            A[i] = temp[i];
        }
        for(int i=1;i<A.length-1;i++){
            if((A[i-1] < A[i]) && (A[i+1] < A[i])){
                h++;
            }else if((A[i-1] > A[i]) && (A[i+1] > A[i])){
                v++;
            }

        }
        return h+v;
    }
}
