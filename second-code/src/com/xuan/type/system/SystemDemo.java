package com.xuan.type.system;

/**
 * <p> System 类 </p>
 *
 * @author : 轩辰;
 * @since 2023/06/08 00:20
 **/
public class SystemDemo {
    /**
     *  System 类
     *      常用方法 :
     *          1、public static void exit(int status) : 终止当前运行的 Java 虚拟机，非零表示异常终止。
     *          2、public static native long currentTimeMillis() : 返回当前系统的时间毫秒值形式
     *                                                                  - 返回1970年1月1日 0时0分0秒，到现在所经历的毫秒值
     *          3、public static native void arraycopy(Object src,  int  srcPos,Object dest, int destPos,int length) : 数组拷贝
     *                                                              1、src  数据源数组
     *                                                              2、srcPos  起始索引
     *                                                              3、dest  目的地数组
     *                                                              4、destPos  起始索引
     *                                                              5、length  拷贝的个数
     */
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());

        int[] arr = {11,22,33,44,55,66};
        int[] destArr = new int[3];
        System.arraycopy(arr, 2,destArr,0,3);
        for (int i = 0; i < destArr.length; i++) {
            System.out.println(destArr[i]);
        }
    }
}
