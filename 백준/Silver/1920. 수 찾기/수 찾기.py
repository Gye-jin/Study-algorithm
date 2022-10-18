import sys
input = sys.stdin.readline

n = int(input())
arr = list(map(int,input().split()))
arr.sort()
m = int(input())
result = list(map(int,(input().split())))

for i in range(m):
    find = False
    target = result[i]
    start = 0
    end = n-1
    while start <= end:
        mid_index = (start+end)//2
        mid_target = arr[mid_index]
        if mid_target > target:
            end = mid_index-1
        elif mid_target < target:
            start = mid_index + 1
        else:
            find = True
            break;
    if find:
        print(1)
    else:
        print(0)