def solution(n):
  a = str(n)

  return int(''.join(sorted(a,reverse=True)))