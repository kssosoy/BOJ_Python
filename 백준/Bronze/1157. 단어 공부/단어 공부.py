ans=input()
result=ans.upper()
re1=set(result)
num={}
max_keys=[]
for i in re1:
    if i in result:
        num[i]=result.count(i)
max_count=max(num.values())
for k,v in num.items():
    if v==max_count:
        max_keys.append(k)
if len(max_keys)>1:
    print('?')
else:
    print(max_keys[0])