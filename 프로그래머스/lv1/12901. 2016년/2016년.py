def solution(a,b):
  month = [31,29,31,30,31,30,31,31,30,31,30,31]
  days = ["THU","FRI","SAT","SUN","MON","TUE","WED"]
  day = 0

  for i in range(a-1):
    day += month[i]

  A = day + b

  answer = A % 7

  return days[answer]