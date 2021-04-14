size = int(input("Enter the nunmber of elements: \n"))

listOfElements = list(map(int,input("Enter the elements separated by space: \n").strip().split()))
zeroCount=0
oneCount=0
twoCount=0
for item in listOfElements:
    if(item == 0):
        zeroCount+=1
    elif(item == 1):
        oneCount+=1
    else:
        twoCount+=1
listOfElements.clear()
for x in range(zeroCount):
    listOfElements.append(0)
for x in range(oneCount):
    listOfElements.append(1)
for x in range(twoCount):
    listOfElements.append(2)

    
print("Sorted List : {}\n".format(listOfElements))

    
