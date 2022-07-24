# -*- coding = utf-8 -*-
# @Time : 2022/7/24 14:43
# @Author : 李兆堃
# @File : BubbleSort.py
# @Software : PyCharm

def main():
    data = [11, 22, 99, 88, 55, 44, 77]
    for i in range(len(data)):
        for j in range(0, len(data) - i - 1):
            if data[j] > data[j + 1]:
                temp = data[j + 1]
                data[j + 1] = data[j]
                data[j] = temp
    print(data)
    pass


if __name__ == "__main__":
    main()
