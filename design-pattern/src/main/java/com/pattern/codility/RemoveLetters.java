package com.pattern.codility;

public class RemoveLetters {
    public static void main(String[] args) {
        /*String s = "CBACD";*/
        /*String s = "CABABD";*/
        String s = "ACBDACBD";
        RemoveLetters r = new RemoveLetters();
        System.out.println(r.solution(s));

    }

    public String solution(String S) {
        // write your code in Java SE 8
        //int length = S.length();
        for(int i = 0 ;i< S.length()-1;i++){
            if(S.charAt(i) == 'A' && S.charAt(i+1) == 'B'){
                S =S.substring(0,i) +  S.substring(i+2);
                i=-1;
            }else  if(S.charAt(i) == 'B' && S.charAt(i+1) == 'A'){
                S =S.substring(0,i) + S.substring(i+2);
                i=-1;
            }else  if(S.charAt(i) == 'C' && S.charAt(i+1) == 'D'){
                S = S.substring(0,i) + S.substring(i+2);
                i=-1;
            }else  if(S.charAt(i) == 'D' && S.charAt(i+1) == 'C'){
                S = S.substring(0,i) + S.substring(i+2);
                i=-1;
            }
        }
        return S;
    }
}
