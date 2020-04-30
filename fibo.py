import math

def CheckPerfect(x):
  i = int(math.sqrt(x))
  return (x == i*i)

def CheckFibo(n):
  if(CheckPerfect(5*n*n + 4) or CheckPerfect(5*n*n - 4)):
    print("Fibonacci")
  else:
    print("Not Fibonacci")

n = int(input("enter test case"))
if n<100:
   list=[]
   for x in range(n):
      n =int(input("enter the number ="))
      list.append(n)
      l = len(list)
for j in range(l):
    CheckFibo(list[j]) 
