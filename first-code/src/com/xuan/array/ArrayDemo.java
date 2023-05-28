package com.xuan.array;

/**
 * <p>数组</p>
 *
 * @author :  轩辰;
 * @since 2023/05/14 22:28
 **/
public class ArrayDemo {
    /**
     *  数组介绍 : 一种容器，可以存储同种数据类型的多个值
     *
     *  数组的使用场景 : 发现手里的数据有多个，并且这多个数据还属于同一组数据，就可以考虑使用数据容器进行维护
     *
     *  初始化 : 在内存中，为数组容器开辟空间，并将数据存入容器的过程
     *      静态初始化 :
     *      动态初始化 : 初始化时只指定数组长度，由系统为数组分配初始值。
     *
     *  数组的定义格式 :
     *      1、数据类型[]  数组名;      推荐使用
     *      2、数据类型  数组名[];
     *      注意 : 这种定义格式，定义出来的，只是数组类型的变量而已，内存中还没有创建出数组容器。
     *  数组创建语法 :
     *      1、先声明、再分配空间 :
     *          数据类型[] 数组名;
     *          数组名 = new 数据类型[长度];
     *      2、声明并分配空间 :
     *          数据类型[] 数组名 = new 数据类型[长度];
     *      3、声明并赋值（繁） :
     *          数据类型[] 数组名 = new 数据类型[]{value1,value2,value3,...};
     *      4、声明并赋值（简） :
     *          数据类型[] 数组名 = {value1,value2,value3,...};
     *  打印数组名 :
     *      [I@4554617c         [D@74a14482
     *      @ : 分隔符
     *      [ : 当前空间，是数组类型的
     *      I : 当前数组类型，是int类型
     *      4554617c : 数组的十六进制内存地址
     *  数组的元素访问格式 :
     *      数组名[下标]     //例如  存：a[0]=10;  取：a[0];
     *      有效下标范围 : 0 ~ 数组长度-1
     *      访问无效下标，会导致数组下标越界 : Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException:
     *  索引 : 索引是数组容器中空间的编号，编号从0开始，逐个+1增长
     *  数组遍历 :
     *      数组遍历 : 将数组中所有的内容取出来，取出来之后可以(打印、求和、判断...)
     *      1、使用循环遍历
     *      2、增强for循环 : foreach         【JDK1.5新增的】
     *  数组
     *
     */
    public static void main(String[] args) {
        //arrayTest1();
        //数组创建
        arayCreat();
        //数组访问
        arrayAccess();
        //数组遍历
        arrayErgodic();
        //对数组中偶数元素做求和操作
        arrayGetSum();
        // 求数组的最大值
        int[] arr = {5,44,33,55,22};
        int max = arrayGetMax(arr);
        System.out.println("最大值是 : "+max);
        // 操作成绩
        int[] achievement = {100,50,20,90,90};
        arrayAchievement(achievement);
    }

    /**
     *  需求 :
     *      已知班级学生成绩为
     *      int[] arr = {100,50,20,90,90};
     *      1、找出数组最大值
     *      2、找出数组最小值
     *      3、求总成绩
     *      4、计算出平均值
     *      5、统计出低于平均值的元素个数
     * @param arr
     */
    private static void arrayAchievement(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        int sum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
            sum = sum + arr[i];
        }
        System.out.println("最高分是:"+max);
        System.out.println("最低分是:"+min);
        System.out.println("总成绩是:"+sum);
        //double avg = (double) sum / arr.length;
        double avg = (sum * 1.0) / arr.length;
        System.out.println("平均分是:"+avg);
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < avg) {
                count++;
            }
        }
        System.out.println("低于平均分的有 : "+count+"个");
    }

    /**
     *  需求 : 对数组中数组的最大值
     */
    private static int arrayGetMax(int[] arr) {
        //1、第一名选手上台 (假设第一个元素就是最大值)
        int max = arr[0];
        //2、遍历数组，获取每一个元素
        for (int i = 1; i < arr.length; i++) {
            //3、逐个比较
            if (arr[i] > max) {
                //4、记录更大的元素
                max = arr[i];
            }
        }
        return max;
    }

    /**
     *  需求 : 对数组中偶数元素做求和操作
     */
    private static void arrayGetSum() {
        int[] arr = {11,22,33,44,55};
        int sum = 0 ;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sum = sum + arr[i];
            }
        }
        System.out.println(sum);
    }

    /**
     *  数组遍历
     */
    private static void arrayErgodic() {
        int[] arr = {11,22,33,44,55,66};
        //数组遍历快捷键 : 数组名.fori
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    /**
     *  数组访问
     */
    private static void arrayAccess() {
        int[] arr1 = {12,13,14,15,16};
        //取出数组中 15 元素，打印在控制台
        System.out.println(arr1[3]);
        //判断数组中第一个元素，是奇数还是偶数
        if (arr1[0] % 2 == 0) {
            System.out.println(arr1[0] + "是一个偶数");
        } else {
            System.out.println(arr1[0] + "是一个奇数");
        }
        // 修改数组中第三个元素，为66
        arr1[2] = 66;
        System.out.println(arr1[2]);

        // 根据数组中的第四个元素，决定在控制台打印多少次HelloWorld
        for (int i = 1; i <= arr1[3]; i++){
            System.out.println("HelloWorld");
        }
    }

    private static void arayCreat() {
        int[] arr1 = new int[]{12,13,14,12,15,16};
        int[] arr2 = {12,13,14,12,15,16};
        double[] arr3 = {11.1,12.2,13.3};
        System.out.println(arr1);
        System.out.println(arr2);
        System.out.println(arr3);
    }

    private static void arrayTest1() {
        int[] array;
        int array2[];
    }
}
