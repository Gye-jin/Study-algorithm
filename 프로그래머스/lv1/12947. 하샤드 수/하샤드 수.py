def solution(n):
    a = str(n)
    answer=[]
    for i in range(len(a)):
        answer.append(int(a[i])) 
        
    if n%sum(answer)==0 :
      return True
      
    else:
      return False