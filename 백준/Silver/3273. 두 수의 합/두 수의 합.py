import sys
input = sys.stdin.readline

n = int(input())

arr = list(map(int,input().split()))

x = int(input())
arr.sort()

count = 0
i,j = 0,n-1

while i<j:
    tmp = arr[i] + arr[j]
    if tmp == x:
        count += 1
    if tmp < x:
        i+=1
        continue;
    j-=1

print(count)