from functools import reduce
n=int(input())
lis=list(map(int,input().split(" ")))
a=[]
b=[]
for i in range(n):
    a=[]
    for j in range(1,lis[i]+1):
        if(lis[i]%j==0):
            a.append(j)
    b.append(a)
res = list(reduce(lambda i, j: i & j, (set(x) for x in b)))   
if(len(res)!=0):
    print(max(res))
else:
    print('0')