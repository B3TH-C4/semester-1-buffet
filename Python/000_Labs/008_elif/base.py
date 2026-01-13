num1 = int(input("Please enter a number: "))
opper = input("please enter an operation: ")
num2 = int(input("Please enter anouther number: "))
if opper == "subtraction":
    print(num1-num2)
elif opper == "addition":
    print(num1+num2)
elif opper == "multplication":
    print(num1*num2)
elif opper == "division":
   print(num1/num2)
else:
    print("this answer is invalid")
    