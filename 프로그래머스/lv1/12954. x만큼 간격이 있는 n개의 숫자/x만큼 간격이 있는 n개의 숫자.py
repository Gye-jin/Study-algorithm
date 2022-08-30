def solution(x, n):
  if x<0:
    return list(range(x,x*n-1,x))
  elif x==0:
    return [x]*n

  else:
    return list(range(x,x*n+1,x))