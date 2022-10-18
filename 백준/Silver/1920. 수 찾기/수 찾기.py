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
        midi = (start+end)//2
        midv = arr[midi]
        if midv > target:
            end = midi - 1
        elif midv < target:
            start = midi + 1
        else:
            find = True
            break
    if find:
     print(1)
    else:
     print(0)
