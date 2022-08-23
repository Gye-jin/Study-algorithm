def solution(n):
    return n.replace(n[:len(n)-4], "*"*(len(n)-4))