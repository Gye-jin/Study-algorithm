a = int(input())
b = str(input())

for i in range(len(b)):
  print(a*int(b[-i-1]))
print(a*int(b))
