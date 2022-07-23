public class SelectionSortTest
{
    // final指向对象不可变，但对象值可变
    // int[]不属于基本数据类型，属于实例化对象，所以值可变
    private static final int[] data = {11, 22, 1, 99, 58, 64, 78, 26, 24, 84, 23, 16, 156, 178};

    public static void main(String[] args)
    {
        selectionSort(data);
        for (int datum : data)
            System.out.println(datum);
    }

    public static void selectionSort(int[] data)
    {
        int index, temp;

        for(int i = 0; i < data.length - 1; i++)
        {
            index = i;
            for(int j = i + 1; j < data.length; j++)
            {
                if (data[j] < data[index])
                    index = j;
            }

            temp = data[index];
            data[index] = data[i];
            data[i] = temp;
        }
    }
}
