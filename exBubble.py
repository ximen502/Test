# 匆匆忙忙的冒泡排序，还可以优化
def bubble_v1(arr):
    for i in range(0, len(arr) - 1):
        for j in range(0, len(arr) - i - 1):
            print(f"j={j}")
            if arr[j] > arr[j+1]:
                arr[j], arr[j+1] = arr[j+1], arr[j]

# 冒泡排序优化
def bubble_v2(arr):
    
    for i in range(0, len(arr) - 1):
        end  = True
        for j in range(0, len(arr) - i - 1):
            print(f"j={j}")
            if arr[j] > arr[j+1]:
                arr[j], arr[j+1] = arr[j+1], arr[j]
                end = False
        if end: # 如果一轮循环没发生数据交换，说明数组已经有序了，不需要再继续循环了
            break

# 搜索了一个博客园jonm的实现，试了一下，下标值思路挺好
# 原作者的代码有bug， 第一个循环的结束值为1是不对的， 应该为0才可以
# 否则会出现少排序一个元素的bug
def bubble_v_cnblog(arr):
    for i in range(len(arr) - 1, 0, -1):
        for j in range(0, i):
            print(f"j={j}")
            if arr[j] > arr[j + 1]:
                arr[j], arr[j + 1] = arr[j + 1], arr[j]

arr = [9, 8, 5, 4, 3]
# arr = [1, 3, 5, 7, 6, 8]
bubble_v_cnblog(arr)
print('-' * 30)
print(arr)
