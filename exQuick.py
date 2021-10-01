# python version quick sort
# 快速排序的基本思想
'''
1.选择一个轴点pivot
2.比轴点小的往前放置，比轴点大的往后放置
3.直到一轮完成，那么轴点的数字就被放在的最终的位置上
4.针对轴点两侧的子数组，继续进行1，2，3步，直到数组的元素只剩下1个
'''
def partition_v1(arr, low, high):
    pivot = arr[low]
    left = low
    right = high
    while left != right:
        while left < right and arr[right] > pivot:
            right -= 1

        while left < right and arr[left] <= pivot:
            left += 1

        if left < right:
            arr[left], arr[right] = arr[right], arr[left]

    arr[low] = arr[left]
    arr[left] = pivot

    return left
    

def quick_sort_v1(arr, start, end):
    if start >= end:
        return

    pivotIndex = partition_v1(arr, start, end)

    quick_sort_v1(arr, start, pivotIndex - 1)
    quick_sort_v1(arr, pivotIndex + 1, end)

# arr = [1, 2, 5, 8, 6, 4]
arr = [49, 38, 65, 97, 76, 13, 27, 49]
print(arr)
quick_sort_v1(arr, 0, len(arr) - 1)
print('-' * 30)
print(arr)

