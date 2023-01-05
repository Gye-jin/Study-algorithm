a,b = map(str,input().split())

reva = int("".join(reversed(a)))
revb = int("".join(reversed(b)))

result = str(reva+revb)

print(int("".join(reversed(result))))