def solution(s):
    answer = ''
    cen = int(len(s)/2)
    
    if len(s)%2 == 0:
        answer = s[cen-1:cen+1]
    else:
        answer = s[cen]
    
    return answer