n=int(input())
l=[]
k=n
z=0
for i in range(n):
    x=list(range(1,k+1))
   # print(x)
    x=x[::-1]+x[1:]
    #print(x)
    x=[x[0]]*z+x+[x[0]]*z
    #print(x[0],z,x)
    #print(x)
    l.append(x)
    k-=1
    z+=1
    #print(k,z)
print(l[::-1][1:])    
l=l+l[::-1][1:]
#print(l)
#for i in l:
    #print(*i)