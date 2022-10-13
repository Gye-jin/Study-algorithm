import sys
input = sys.stdin.readline
start,end = map(int,input().split())

prefix_sum = [0]
result = list(map(int,input().split()))
temp = 0

for i in result:
  temp =temp + i
  prefix_sum.append(temp)

for i in range(end):
  a, b = map(int,input().split())
  print(prefix_sum[b]-prefix_sum[a-1])
