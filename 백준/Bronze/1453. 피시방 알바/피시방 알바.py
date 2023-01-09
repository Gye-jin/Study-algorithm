n = int(input())
cus=list(map(int,input().split()))
result = []
count = 0
for i in range(n):
    if cus[i] in result:
        count+=1
    else:
        result.append(cus[i])
print(count)