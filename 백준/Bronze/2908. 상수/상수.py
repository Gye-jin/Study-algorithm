a,b = map(str,input().split())


print(max(int("".join(reversed(a))),int("".join(reversed(b)))))