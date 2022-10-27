def gcd(a,b):
    if b==0:
        return a
    else:
        return(gcd(b,a%b))

n = int(input())

for i in range(n):
    a,b= map(int,(input().split()))
    result = a*b/gcd(a,b)
    print(int(result))