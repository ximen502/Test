# 匆匆忙忙的冒泡排序，还可以优化
arr = [9, 8, 5, 4, 3]
for i in range(0, len(arr) - 1):
    for j in range(0, len(arr) - i - 1):
        # print(f"j={j}")
        if arr[j] > arr[j+1]:
            arr[j], arr[j+1] = arr[j+1], arr[j]

print(arr)
