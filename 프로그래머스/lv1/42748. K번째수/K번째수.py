def solution(array, commands):
  answer=[]
  answer2=[]
  for i in range(len(commands)):
   answer.append(sorted(array[commands[i][0]-1:commands[i][1]]))
  for j in range(len(commands)):
    answer2.append(answer[j][commands[j][2]-1])

  return answer2