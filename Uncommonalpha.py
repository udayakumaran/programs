# Python 3 implementation to find the 
# uncommon characters of the two strings 
n=int(input())
l=[]
mc=26
for i in range(n):
    l.append(input())
pres =[0]*mc
for i in range(0,mc):
    pres[i]=0
l1=len(l[0])
l2=len(l[1])
l3=len(l[2])
for i in range(0,l1):
    pres[ord(l[0][i])-ord('a')]=1
for i in range(0,l2):
    if(pres[ord(l[1][i])-ord('a')]==1 or pres[ord(l[1][i])-ord('a')]==-1):
        pres[ord(l[1][i])-ord('a')]=-1
    else:
        pres[ord(l[1][i])-ord('a')]=2
for i in range(0,l3):
    if(pres[ord(l[2][i])-ord('a')]==1 or pres[ord(l[2][i])-ord('a')] ==-1 or pres[ord(l[2][i])-ord('a')]==2):
        pres[ord(l[2][i])-ord('a')]=-1
    else:
        pres[ord(l[2][i])-ord('a')]=3
k=0
for i in range(0,mc):
    if(pres[i]==1 or pres[i]==2 or pres[i]==3):
        k+=1
print(k) 
