package com.example.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by davidyu on 3/15/17.
 */

public class StringTest {



//    输入任意一个字符串，如：“abDEe23dJfd343dPOddfe4CdD5ccv!23rr”。取出该字符串中所有的字母。顺序不能改变！并把大写字母变成小写，小写字母变成大写！
//    String str="";
//    char[] values=str.toCharArray();
//    String newStr="";



//    1. 给定一个字符串,判断该字符串中是否包含某个子串.如果包含,求出子串的所有出现位置.
//            如:"abcbcbabcb34bcbd"中,"bcb"子串的出现位置为: 1,7,12.字符串和子串均由用户输入
//
//    2.给定一个长度,随机产生一个该长度的字符串,由大写,小写字母以及数字组成
//    Java中随机数的生成:
//    java.util.Random r = new java.util.Random();
//    int a = r.nextInt(100): a 0-99的随机数
//
//    3.给定一个由数字组成的字符串,如:"1239586838923173478943890234092",统计
//            出每个数字出现的次数

    public static void main(String[] args)
    {


//        String str="helloWorldDavid";

     // method3();

        String str = "helloWorldDavid";

        String s = reverseString(str);

        System.out.println("my revese string is "+ s);


    }





    public static void method3()
    {

//        3.给定一个由数字组成的字符串,如:"1239586838923173478943890234092",统计
//            出每个数字出现的次数


         Map<Character,Integer> map = new HashMap<>();


        String kk  = "1239586838923173478943890234092";

        char[] chars = kk.toCharArray();


        for (int i = 0; i < chars.length; i++) {


            if(map.containsKey(chars[i]))
            {
                map.put(chars[i],map.get(chars[i])+1);

            }else
            {
                map.put(chars[i],1);
            }

        }


        Set<Character> characters = map.keySet();

        for (Character character : characters) {


            System.out.println(character + " is "+ map.get(character) );

        }


    }



    public static String reverseString(String str)
    {


        StringBuffer sb = new StringBuffer();
        char[] chars = str.toCharArray();

        for(int i =  chars.length - 1; i>=0 ; i--)
        {

            sb.append(chars[i]);

        }


        return sb.toString();



    }

}
