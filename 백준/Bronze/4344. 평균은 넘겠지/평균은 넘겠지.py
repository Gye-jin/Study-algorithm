

n = int(input())

for i in range(n):
    arr = list(map(int,input().split()))
    count =0
    for j in range(1, len(arr)):

        if arr[j] >sum(arr[1:len(arr)])/arr[0]:
            count+=1

    print('{0:0.3f}%'.format((count/arr[0]*100)))