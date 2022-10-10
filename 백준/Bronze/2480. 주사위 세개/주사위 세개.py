a,b,c = map(int,input().split())
lst = []

if a==b==c:
  print(10000+a*1000)
elif a==b or a==c:
  print(1000+a*100)
elif b==c:
  print(1000+b*100)
else:
  lst.append(a)
  lst.append(b)
  lst.append(c)
  print(100*max(lst))
