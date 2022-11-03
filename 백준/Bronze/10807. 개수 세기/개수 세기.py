

n = input()
arr = list(map(int,input().split()))
target = input()
count = 0

for i in arr:
    if i == int(target):
        count = count+1


print(count)