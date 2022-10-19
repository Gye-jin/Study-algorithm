n, m = map(int,input().split())
arr = [0]*n
total = 0
for i in range(n):
    arr[i] = int(input())


for i in range(n - 1, -1 , -1):
    if arr[i]<= m:
        total += m//arr[i]
        m = m%arr[i]
print(total)
