# -*- coding = utf-8 -*-
# @Time : 2022/7/24 14:43
# @Author : 李兆堃
# @File : BubbleSort.py
# @Software : PyCharm

def main():
   data = [11, 22, 1, 99, 58, 64, 78, 156, 178]
   for i in range(len(data)-1):
       index = i
       for j in range(i+1, len(data)):
           if data[j] < data[index]:
               index = j
       temp = data[index]
       data[index] = data[i]
       data[i] = temp
   print(data)
   pass


if __name__ == "__main__":
   	main()