def solution(n):
  li1=[]
  ans=0
  for i in range(1,n+1):
    if int(n%i)==0:
      li1.append(i)

  return sum(li1)