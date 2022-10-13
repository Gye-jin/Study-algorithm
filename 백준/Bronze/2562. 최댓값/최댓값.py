result = []

for i in range(9):
  result.append(int(input()))

print(max(result),result.index(max(result))+1)