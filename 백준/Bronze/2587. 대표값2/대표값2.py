import statistics

result = []

for i in range(5):
    result.append(int(input()))

print(statistics.mean(result))
print(sorted(result)[2])