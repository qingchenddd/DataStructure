// @Time : 2022/7/24 14:58
// @Author : 李兆堃
// @File : BubbleSort.java
// @Software : IntelliJ IDEA

public class BubbleSort
{
    public static void main(String[] args)
    {
        int[] data = {11,22,99,88,55,44,77};
        //基本数据类型传值，对象传地址
        bubbleSort(data);
        for (int datum : data)
            System.out.println(datum);
    }

    public static void bubbleSort(int[] data)
    {
        int temp;    // 定义临时数
        // 共进行N遍操作
        for (int i = 0; i < data.length; i++)     // 共遍历N遍
            for (int j = 0; j < data.length - i - 1; j++)     // 让每一个数与后一个数比较，若后一个大/小则交换
                if (data[j] > data[j + 1])
                {
                    // 交换数据
                    temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
    }
}
