def solution(s):
  if s.lower().count('y') + s.lower().count('p')==0:
    return True
  elif s.lower().count('y')==s.lower().count('p'):
    return True
  else:
     return False