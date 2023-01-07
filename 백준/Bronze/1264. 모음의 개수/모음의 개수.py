
result = ['a','e','i','o','u']

while True:
    count=0
    n = input().lower()
    if n == '#':
        break
    for i in n:
        if i in result:
            count +=1
    print(count)
