def solution(a, b):
    
    c= max(a,b)
    
    li1=[i for i in range(1,c+1) if a%i==0 and b%i==0]
    
    m=li1[-1]
    n= (a/m)*b
    
    return [m,n]