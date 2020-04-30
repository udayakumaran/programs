a=int(input())
lis=[input().strip() for e in range(a)]
b=[set(e) for e in lis]
k=[len(e) for e in b]
print(b)
print(k)
val=0
for e in range(len(b)):
    if len(b[e]) == max(k):
        val=e
#print(lis[val])        