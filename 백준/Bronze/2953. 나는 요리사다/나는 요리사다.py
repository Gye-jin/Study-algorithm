array_list =[]
sum_list=[]
for i in range(5):
 array_list.append(list(map(int,(input().split( )))))
for i in range(len(array_list)):
  sum_list.append(sum(array_list[i]))

print(sum_list.index(max(sum_list))+1,max(sum_list))