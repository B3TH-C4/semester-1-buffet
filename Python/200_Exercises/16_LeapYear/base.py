year = input("Enter a year to see whether or not it's a leap year: ")
year = int(year)
print(year)

if year % 4 == 0:
    if year % 100 == 0:
        if year % 400 == 0:
            print("This is a leap year!")
        else:
            print("This is not a leap year")
    else:
        print("This is not a leap year")
else:
    print("This is not a leap year")