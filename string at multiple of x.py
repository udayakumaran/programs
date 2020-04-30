#Your code below
a,n=input().split(" ")
n=int(n)
u=a[0]
v=a[len(a)-1]
l=[]
l=[a*len(a)]
o=n
r=n
k=n
w=n-1

q=len(a) * len(a)
if(k==1):
    for i in range(n,q):
        if(k==1):
            print(l[0][0],end="",sep="")
            k=0
        if(i>q):
            break
        elif(l[0][i] != u and l[0][i] != v) :   
            print(l[0][i],end="",sep="")
        else:
            print(l[0][i],end="",sep="")
            break
        
else:
    for i in range(w,q,o):
        if(i>q):
            break
        elif(l[0][i] != u and l[0][i] != v) :   
            print(l[0][i],end="",sep="")
        else:
            print(l[0][i],end="",sep="")
            break