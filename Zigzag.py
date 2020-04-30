n,k=input().split(" ")
n=int(n)
k=int(k)
a=[]
b=[]
for i in range(n):
    a=[]
    for j in range(n):
        a.append(k)
        k+=1
    b.append(a) 
for i in range(n):
    if (i%2 !=0):
        b[i]=b[i][::-1]

for i in range(n):
    print(*b[i])
        