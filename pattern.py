def printPattern(str):
    m=len(str)//2
    a=m
    i=0
    while(a<len(str)):
        print(str[m:m+i+1],end="$ ")
        i+=1
        a+=1
    n=str[m:m+i+1]
    b=0
    while(b<m):
        print(n+str[0:b+1],end="$ ")
        b+=1
  
n = int(input())
if(n<100):
    list =[]
    for i in range(n):
        str = input()
        list.append(str)

l=len(list)
for j in range(l):    
    printPattern(list[j])

