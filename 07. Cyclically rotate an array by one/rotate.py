size = int(input("Enter the nunmber of elements: \n"))

listOfElementsA = list(map(int,input("Enter the elements separated by space: \n").strip().split()))

rotationCount = int(input("Enter the roation count: \n"))    

while(rotationCount != 0):
    last = listOfElementsA[size-1]
    for i in range (size-1,0,-1):
        listOfElementsA[i] = listOfElementsA[i-1]
    listOfElementsA[0] = last
    rotationCount-=1

print(listOfElementsA)


    
