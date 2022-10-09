from collections import deque

queue = deque()


n = int(input())

for i in range(n):
  queue.append(i+1)

while len(queue)>1:
  queue.popleft()
  queue.append(queue.popleft())

print(queue.pop())