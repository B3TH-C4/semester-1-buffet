num = int(input("Please enter a number: "))
Sum = 0

for x in range(0,num):
    print(x + 1, end ="+")
    Sum = Sum + x
Sum = Sum + num
print(num)
print("The sum of 1 to " + str(num) + " is: " + str(Sum)) 


