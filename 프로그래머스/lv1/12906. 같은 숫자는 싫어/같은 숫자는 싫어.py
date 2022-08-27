def solution(ar):

  arr=list(ar)
  arr2=[]

  for i in range(0,len(arr)-1):
      if arr[i]!=arr[i+1]:
          arr2.append(arr[i])

  arr2.append(arr[-1])

  return arr2