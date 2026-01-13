ques1 = int(input("please enter a line length: "))
qes2 = input("do you want it to be vertical or horizontal? ")
num = 0
if qes2 == "horizontal":
    for x in range(1,ques1):
        print("＊", end = " ")
elif qes2=="vertical":
     for x in range(1,ques1):
        print("＊")    
else:
    print("this is invalid")




