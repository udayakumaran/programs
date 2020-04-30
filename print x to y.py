n,m=input().split(" ")
n=int(n)
m=int(m)
a=[]
for i in range(n,m+1):
    a.append(i)
l=[]
o=m-n
for i in range(o+1):
    b=[]
    l.append(a)
    b.append(a[0])
    a=a[1:g] +b[0:] 
    
for i in l:
    print(*i)
        
    