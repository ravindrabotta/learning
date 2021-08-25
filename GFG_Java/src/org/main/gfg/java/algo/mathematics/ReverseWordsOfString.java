package org.main.gfg.java.algo.mathematics;

//{ Driver Code Starts
import java.util.Scanner;
class ReverseWordsOfString {
 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);
    
         String s = sc.next();
         Solution obj = new Solution();
         System.out.println(obj.reverseWords(s));
    
 }
}
//} Driver Code Ends

class Solution 
{
 //Function to reverse words in a given string.
 String reverseWords(String S)
 {
     String[] str = S.split("\\.");
     System.out.println(str.length);
     StringBuffer sb = new StringBuffer();
     int len = str.length;
     for(int i = len-1; i>=0; i--) {
        // System.out.println(str[i]);
         if (i !=0)
             sb.append(str[i]).append(".");
         else
             sb.append(str[i]);
     }
     
     return sb.toString();
 }
}