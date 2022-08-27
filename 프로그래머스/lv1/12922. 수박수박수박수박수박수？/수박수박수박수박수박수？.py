def solution(n):
  an1='수'
  an2='박'
  ans=''
  
  for a in range(1,n+1):
    if a%2==1:
      ans=ans+an1
    else:
     ans=ans+an2
  
  return(str(ans))
