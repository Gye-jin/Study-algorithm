import math
a,b,total = map(int,(input().split()))


count = math.ceil((total-b)/(a-b))

print(count)
