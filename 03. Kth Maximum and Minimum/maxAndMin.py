size = int(input("Enter the nunmber of elements: \n"))

listOfElements = list(map(int,input("Enter the elements separated by space: \n").strip().split()))
k = int(input("Enter the value of K: \n"))
listOfElements.sort()
max = listOfElements[size-1]
min = listOfElements[0]
minCount = k
maxCount = k
for item in listOfElements[::-1]:
    if(item<max and maxCount>=1):
        max = item
        maxCount = maxCount - 1

for item in listOfElements:
    if(item>min and minCount>=1):
        min = item
        minCount = minCount - 1
    
print("Max Value : {}\n".format(max))
print("Min Value : {}".format(min))
    
