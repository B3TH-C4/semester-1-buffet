def add(x, y): 
    sum = x + y
    return sum
    
def mult(x, y):
    prod = x * y
    return prod

def printlist(lst):
    i =  1
    for item in lst:
        print(str(i) + ". " + item)
        i = i + 1
        
def numlist(lst):
    sum = 0
    for num in lst:
        sum = sum + num
    return sum
        
    
#-------------------------------------------#
ans = add(5, 7)
print(ans)

ans2 = mult(2, 9)
print(ans2)




christmaslist = ["Skz karma album" , "sewing machine" , "money" , "shoes" , "flute"]
printlist(christmaslist)

favoriteNumbers = [41 , 20 , 777 , 7 , 10 , 23 , 13 , 76]
print(numlist(favoriteNumbers))
