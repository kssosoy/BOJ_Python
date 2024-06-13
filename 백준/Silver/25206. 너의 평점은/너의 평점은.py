result=0
count=0
for i in range(20):
    score=list(input().split())
    if(score[2]=='A+'):
        result+=4.5*float(score[1])
        count+=float(score[1])
    elif(score[2]=='A0'):
        result+=4.0*float(score[1])
        count+=float(score[1])
    elif(score[2]=='B+'):
        result+=3.5*float(score[1])
        count+=float(score[1])
    elif(score[2]=='B0'):
        result+=3.0*float(score[1])
        count+=float(score[1])
    elif(score[2]=='C+'):
        result+=2.5*float(score[1])
        count+=float(score[1])
    elif(score[2]=='C0'):
        result+=2.0*float(score[1])
        count+=float(score[1])
    elif(score[2]=='D+'):
        result+=1.5*float(score[1])
        count+=float(score[1])
    elif(score[2]=='D0'):
        result+=1.0*float(score[1])
        count+=float(score[1])
    elif score[2] == 'F':
        result += 0.0 * float(score[1])
        count += float(score[1])
    elif(score[2]=='P'):
        continue
if(count==0):
    print('%.6f' % (0))
else:
    print('%.6f' % (result / count))
