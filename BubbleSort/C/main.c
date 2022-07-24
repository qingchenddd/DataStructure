/* 冒泡排序
 * 时间复杂度：
 * O(N²)
 * 空间复杂度：
 * O(1)
 */

# include <stdio.h>
# define N 7
int main()
{
    int temp = 0;
    int data[] = {11,22,99,88,55,44,77};

    for (int i = 0; i < N; i++)     // 共遍历N遍
        for (int j = 0; j < N - i; j++)     // 让每一个数与后一个数比较，若后一个大/小则交换
            if(data[j] > data[j + 1])
            {
                // 交换数据
                temp = data[j];
                data[j] = data[j + 1];
                data[j + 1] = temp;
            }

    for(int i = 0; i < N; i++)
        printf("%d     ", data[i]);
    return 0;
}

