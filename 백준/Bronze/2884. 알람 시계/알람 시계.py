a, b = map(int,input().split())

if a==0 and b<45:
  a = +24
  
result=a * 60 + b-45
print(int(result/60), result%60)
