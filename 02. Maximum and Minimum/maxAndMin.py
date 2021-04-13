size = int(input("Enter the nunmber of elements: "))

listOfElements = list(map(int,input("Enter the elements separated by space: ").strip().split()))

max = 0
min = listOfElements[0]

for element in listOfElements:
    if element > max:
        max = element
    else:
        min = element
print("Max Value : {}\n".format(max))
print("Min Value : {}".format(min))
    
