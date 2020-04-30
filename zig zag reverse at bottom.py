#Your code below
import itertools
def oneDArray(x):
     return list(itertools.chain(*x))
r,c=input().split(" ")
r=int(r)
c=int(c)
mat=[]
for i in range(r):
    x=input().split()
    a=[]
    for j in range(c):
        a.append(int(x[j]))
    mat.append(a)    
sol=[[]for i in range((r+c)-1)]
for i in range(r):
    for j in range(c):
        sum=i+j
        if(sum%2==0):
            sol[sum].append(mat[i][j])
        else:
            sol[sum].insert(0,mat[i][j])
j=oneDArray(sol)
j.reverse()
print(*j)