
a,b,c = map(int,input().split())

if (b>=c):
  result = -1

else:
  result = int(a/(c-b))+1

print(result)