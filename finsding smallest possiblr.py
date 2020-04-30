
#Your code below
n=input()
l=[]
k=[]
h=0
a=sorted(str(n))
for i in range(len(n)):
    if(a[i]=='1'):
        l.append(a[i])
        h=i
        break
for i in range(len(n)):
    if(a[i]!='1'):
        k.append(a[i])
    elif(h!=i):
        k.append(a[i])
print(*l,end="",sep="")
print(*k,sep="")