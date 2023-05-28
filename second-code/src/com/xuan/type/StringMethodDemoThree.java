package com.xuan.type;

/**
 * <p>String 的截取、替换和切割</p>
 *
 * @author :  轩辰;
 * @since 2023/05/25 21:48
 **/
public class StringMethodDemoThree {
    /**
     *  String 的截取 :
     *      public String substring(int beginIndex) : 返回一个字符串，该字符串是此字符串的子字符串。
     *          根据传入的索引开始做截取，截取到字符串的末尾。
     *      public String substring(int beginIndex, int endIndex) : 返回一个字符串，该字符串是此字符串的子字符串。
     *          根据传入的开始和结束索引，对字符串做截取
     *              -包含头，不包含尾
     *      这两种截取方法都需要一个变量来接收截取拿到的字符串
     *  String 的替换 :
     *      public String replace(CharSequence target, CharSequence replacement) :
     *          将与字面目标序列匹配的字符串的每个子字符串替换为指定的字面替换序列。
     *          参数1 : 旧值            参数2 : 新值
     *  String 的切割 :
     *      public String[] split(String regex) : 将与字面目标序列匹配的字符串的每个子字符串替换为指定的字面替换序列。
     *          根据传入的字符作为规则，切割当前字符串
     *          需要注意有些规则字符是有特殊含义或者。。的，如果想让它以你想要的方式切割要在符号前面加上 \\
     *          比如:   .split(".")       要写为 :   .split("\\.")
     *                  .split("+")       要写为 :   .split("\\+")
     */
    public static void main(String[] args) {
        //String 的截取1
        intercept1();
        //String 的截取2
        intercept2();

        //String 的替换
        replace();

        // String 的切割
        split();
    }

    /**
     *  String 的切割 :
     */
    private static void split() {
        String str1 = "Always remember, there must be echoes";
        String[] split = str1.split(", ");
        for (int i = 0; i < split.length; i++) {
            System.out.println(split[i]);
        }
    }

    /**
     *  String 的替换 :
     *      public String replace(CharSequence target, CharSequence replacement) :
     *          将与字面目标序列匹配的字符串的每个子字符串替换为指定的字面替换序列。
     *          参数1 : 旧值            参数2 : 新值
     */
    private static void replace() {
        String str1 = "Always remember, there must be echoes";
        String str2 = str1.replace("must", "maybe");
        System.out.println(str2);
    }

    /**
     *  String 的截取 2 :
     *      public String substring(int beginIndex, int endIndex) : 返回一个字符串，该字符串是此字符串的子字符串。
     *          根据传入的开始和结束索引，对字符串做截取
     *              -包含头，不包含尾
     */
    private static void intercept2() {
        String str1 = "Always remember, there must be echoes";
        String str2 = str1.substring(0,15);
        System.out.println(str2);
    }

    /**
     *  String 的截取 1 :
     *      public String substring(int beginIndex) : 返回一个字符串，该字符串是此字符串的子字符串。
     *          根据传入的索引开始做截取，截取到字符串的末尾。
     */
    private static void intercept1() {
        String str1 = "Always remember, there must be echoes";
        String str2 = str1.substring(17);
        System.out.println(str2);
    }
}
