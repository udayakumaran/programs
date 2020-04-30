n=input()
print(int(len(n)/2))
k=n[0:int(len(n)/2)]
l=n[int(len(n)/2):len(n)]
l=l[::-1]
for i in range(len(k)):
    print(k[i],end="")
    print(l[i],end="")
if(len(k)==len(l)):
    j=0
else:
    print(l[len(l)-1],end=" ")