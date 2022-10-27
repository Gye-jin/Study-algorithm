import math
a,b = map(int,input().split())

arr = [0]*(b+1)

for i in range(2,b+1):
    arr[i] = i


for i in range(2, int(math.sqrt(b))+1):
    if arr[i]==0:
        continue
    for j in range(i+i,b+1,i):
        arr[j]=0


for i in range(a,b+1):
    if arr[i] !=0:
        print(arr[i])