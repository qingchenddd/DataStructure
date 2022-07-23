public class SelectionSortTest
{
    // final指向对象不可变，但对象值可变
    // int[]不属于基本数据类型，属于实例化对象，所以值可变

    public static void main(String[] args)
    {
        int[] data = {11, 22, 1, 99, 58, 64, 78, 156, 178};
        //基本数据类型传值，对象传地址
        selectionSort(data);
        for (int datum : data)
            System.out.println(datum);
    }

    public static void selectionSort(int[] data)
    {
        int index, temp;    // 定义索引和临时数
        // 共进行N-1遍操作
        for(int i = 0; i < data.length - 1; i++)
        {
            index = i;
            // 遍历列表，获取索引
            for(int j = i + 1; j < data.length; j++)
            {
                if (data[j] < data[index])
                    index = j;
            }
            // 交换数据
            temp = data[index];
            data[index] = data[i];
            data[i] = temp;
        }
    }
}
