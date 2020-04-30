n=int(input())
l=[]
k=n
z=1
for i in range(n):
    x=list(range(z,n+1))
    #print(x)
    z=n+1
    n=n+k
    #print(x[0:k-1])
    #x=x[::-1]+x[1:]
    #print(x)
    x=[x[0:k-1] + x[::-1]]
    #print(x[0],z,x)
    l.append(x)
for r in l:
    for t in r:
       print(*t)
    
   