letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz"
def unique_english_letters (word) :
  counter = 0
  for i in letters :
    if i in word :
      counter += 1
  return counter
n=int(input())
string=[]
string1=[]

for i in range(n):
    k=input()
    string1.append(k)
    h=k.lower()
    string.append(h)
b=[]
for i in range(len(string)):
    b.append(unique_english_letters(string[i]))
seen = []
h=0
print(b)
for number in b:
    if number in seen:
        h=1;
    else:
        seen.append(number)
if h==1:
    print(string1[len(b)-1])
else:
    j=max(b)
    for i in range(len(b)):
        if j == b[i]:
            print(string1[i])
        
    
        