n,k = map(int,input().split())

result = list(map(int,input().split()))



print(sorted(result,reverse=True)[k-1])