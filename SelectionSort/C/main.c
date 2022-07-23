#include <stdio.h>
#define N 9


int main() {
    int data[N] = {11, 22, 1, 99, 58, 64, 78, 156, 178};
    int index, temp;

    for(int i = 0; i < N - 1; i++)
    {
        index = i;
        for(int j = i + 1; j < N; j++)
        {
            if (data[j] < data[index])
                index = j;
        }

        temp = data[index];
        data[index] = data[i];
        data[i] = temp;
    }

    for (int i = 0; i < N; ++i)
    {
        printf("%d   ", data[i]);
    }
    
}
