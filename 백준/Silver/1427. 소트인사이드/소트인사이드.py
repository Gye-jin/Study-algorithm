N = str(input())
result = list(N)
result.sort(reverse=True)

strings = [str(i) for i in result]
result1=''.join(strings)


print(int(result1))