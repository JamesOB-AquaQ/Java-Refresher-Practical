package com.aquaq.training;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class StringEvaluation {

    public char findMaxChar(Scanner scanner){
        System.out.println("Enter string to check and hit enter");
        String text = scanner.nextLine();
        text=text.replaceAll("\\s+","");
        char maxChar = '\0';
        int max = -1;
        int[] frequency = new int[256];

        for(int i = 0;i< text.length();i++){
            frequency[text.charAt(i)]++;
        }
        for(int i = 0;i<text.length();i++){
            char ch =text.charAt(i);
            if(max < frequency[ch]){
                max = frequency[ch];
                maxChar = ch;
            }
        }
        System.out.println("\nThe Maximum Occurring Character = " +  maxChar);
        System.out.format("'%c' Character Occurs %d Times ", maxChar, max);
        return maxChar;

    }
    public boolean checkAnagram(Scanner sc){
        System.out.println("Enter first string and hit enter: ");
        String firstString = sc.nextLine();
        firstString=firstString.replaceAll("\\s+","");
        System.out.println("Enter second string and hit enter: ");
        String secondString = sc.nextLine();
        secondString=secondString.replaceAll("\\s+","");

        if(firstString.length() != secondString.length())
            return false;

        char[] chars1 = firstString.toCharArray();
        char[] chars2 = secondString.toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);

        for(int i = 0; i< chars1.length; i++){
            if(chars1[i] != chars2[i])
                return false;
        }
        return true;
    }
    public String reverseString(Scanner sc){
        System.out.println("Enter string to be reversed: ");
        String text = sc.nextLine();

        char[] chars = text.toCharArray();
        int length = chars.length;
        StringBuilder sb = new StringBuilder();
        String reversedText = "";
        for(int i= length-1; i>=0; i--){
            sb.append(chars[i]);
        }
        return sb.toString();
    }
    public boolean checkPalindrome(Scanner sc){
        System.out.println("Enter string to check and hit enter");
        String text = sc.nextLine();
        text = text.toLowerCase();
        text=text.replaceAll("\\s+","");
        text=text.replaceAll("[^a-zA-Z ]", "");
        char[] chars = text.toCharArray();
        StringBuilder sb = new StringBuilder();
        String reversedText = "";
        for(int i= chars.length-1; i>=0; i--){
            sb.append(chars[i]);
        }
        reversedText = sb.toString();
        for(int i = 0; i<chars.length;i++){
            if(chars[i] != reversedText.charAt(i))
                return false;
        }
        return true;
    }

}
