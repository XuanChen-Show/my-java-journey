package com.xuan.test;

import java.util.Random;

/**
 * <p>产生随机验证码</p>
 *
 * @author :  轩辰;
 * @since 2023/05/21 13:22
 **/
public class GenerateRandom {
    /**
     * 需求 : 请从26个英文字母(大小写都包含) , 以及数字 0~9 中，随机产生一个5位的字符串验证码并打印在控制台
     */
    public static void main(String[] args) {
        //打印随机验证码
        printCode();
        getCode();

    }

    private static void getCode() {
        char[] chars = new char[26+26+10];
        int index = 0;
        for (char i = 'a'; i <= 'z'; i++) {
            chars[index] = i;
            index++;
        }
        for (char i = 'A'; i <= 'Z'; i++) {
            chars[index] = i;
            index++;
        }
        for (char i = '0'; i <= '9'; i++) {
            chars[index] = i;
            index++;
        }
        Random random = new Random();
        String result = "";
        for (int i =0;i<5;i++){
            int num = random.nextInt(chars.length);
            result += chars[num];
        }
        System.out.println("产生的随机数是 :"+result);
    }

    private static void printCode() {
        char[] arr = {
                'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z',
                'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z',
                '0','1','2','3','4','5','6','7','8','9'
        };
        Random random = new Random();
        String result = "";
        for (int i =0;i<5;i++){
            int num = random.nextInt(arr.length);
            result += arr[num];
            System.out.print(arr[num]);
        }
        System.out.println("");
        System.out.println(result);
    }
}
