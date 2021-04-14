size = int(input("Enter the nunmber of elements: \n"))

listOfElementsA = list(map(int,input("Enter the elements separated by space: \n").strip().split()))
listOfElementsB = list(map(int,input("Enter the elements separated by space: \n").strip().split()))

setA = set(listOfElementsA)
setB = set(listOfElementsB)
    
print("Union : {}\n".format(setA | setB))
print("Intersection : {}\n".format(setA & setB))

    
