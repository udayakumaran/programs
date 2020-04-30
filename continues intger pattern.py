n=int(input())
l=[]
k=1
z=0
'''for i in range(n):
    x=list(range(1,i+1))
    #x=x[::-1]+x[1:]
    #x=[x[0]]*z+x+[x[0]]*z
    l.append(x)
    k+=1
    
#l=l+l[::-1][1:]
for i in l:
    print(*i)'''
ar=[]    
k=1
# Outer loop
for i in range (1,n+1):
     # Inner loop
    b=[]
    for j in range (1,i+1):
        b.append(k)
        k=k+1
    ar.append(b)   
    #print()   

for i in range(len(ar)):
    if(i%2!=0):
        ar[i]=ar[i][::-1]
        
for xs in ar:
    print(" ".join(map(str, xs)))   