import random
how = int(input("How many random numbers would you like? "))
x = 0
num = ["1" , "2" , "3" , "4" , " 5" , "6" , "7" , "8" , "9" , "10"]
for x in range(0,how):
    print(random.randrange(10)) 