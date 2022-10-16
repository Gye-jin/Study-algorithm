n = int(input())

arr = list(map(int,input().split()))
result=0
arr.sort(reverse=True)
for i in range(n):
  result+=arr[i]*(i+1)

print(result)