package com.Learning.CodeWars;

public class FirstTask {
    //matching strings endings
    public static boolean solution(String str, String ending){

        return str.regionMatches((str.length()-ending.length()),ending,0,ending.length());
    }


}
