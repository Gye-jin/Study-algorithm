def solution(d, budget):
  A=[]
  for i in sorted(d):
    A.append(i)

    if sum(A) > budget:
      return len(A)-1
    elif budget == sum(A):
      return len(A)