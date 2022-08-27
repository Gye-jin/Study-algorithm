def solution(a, b):
    answer = 0
    a=int(a)
    b=int(b)
    
    if a >b:
        answer = sum(range(b,a+1))
    elif b>a:
        answer = sum(range(a,b+1))
    else:
        answer = a
    return answer

solution(3,3)