n = int(input())


for i in range(n):
    arr = list(input())
    count=1
    score=0
    for j in range(len(arr)):
        if arr[j] == 'O':
            score+=count
            count+=1
        elif  arr[j] == 'X':
            count=1

    print(score)

