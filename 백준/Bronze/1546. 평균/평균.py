n = int(input())
result = list(map(int,input().split()))
result_list=[]
for i in range(len(result)):
  result_list.append(int(result[i])/max(result)*100)
print((sum(result_list))/n)
