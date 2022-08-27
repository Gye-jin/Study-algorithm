def solution(array, commands):
  answer = []
  array2=sorted(array[commands[0]-1:commands[1]])
  answer.append(array2[commands[2]-1])
  return answer