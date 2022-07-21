# -*- coding = utf-8 -*-
# @Time : 2022/7/21 22:04
# @Author : 李兆堃
# @File : 简单排序.py
# @Software : PyCharm
"""
简单排序
时间复杂度为：O(N²)
特点：
    逐个比较
    交换一次
"""


def main():
    data = [11, 22, 1, 99, 58, 64, 78, 26, 24, 84, 23, 16, 156, 178]
    print(sort(data))
    pass


def sort(data: list) -> list:
    for i in range(len(data)):
        index = i
        for j in range(i+1, len(data)):
            if data[j] < data[index]:
                index = j
        temp = data[index]
        data[index] = data[i]
        data[i] = temp
        pass
    return data
    pass


if __name__ == "__main__":
    main()
