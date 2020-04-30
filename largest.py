test_str = "abcabcbb"
  
 
print("The original string is : " + str(test_str)) 
  

res = [test_str[i: j] for i in range(len(test_str)) 
          for j in range(i + 1, len(test_str) + 1)] 
  
 
def isUniqueChars(st): 

	if len(st) > 256: 
		return False

	char_set = [False] * 128


	for i in range(0, len(st)): 

		val = ord(st[i]) 
		if char_set[val]: 
			return False

		char_set[val] = True

	return True

b=[]
for i in range(len(res)):
    for j in range(len(res[i])):
        if(isUniqueChars(res[i])==True):
            if(len(res[i])==1):
                continue
            else:
                b.append(res[i])
l=[]    
for i in range(len(b)):
    l.append(len(b[i]))

h=max(l)

for i in range(len(b)):
    if(len(b[i])==h):
        print(b[i])
        exit()
    
    
            
