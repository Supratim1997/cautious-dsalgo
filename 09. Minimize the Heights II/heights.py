from sys import maxsize


def getMinDiff(arr, n, k):
    arr = sorted(arr);
    ans = arr[n-1]-arr[0]
    for i in range (n):
        if(arr[i]>=k):
            mx = max(arr[i-1] + k, arr[n-1]-k)
            mn = min(arr[0]+k, arr[i]-k)
            ans = min(ans, mx-mn)
    return ans

size = int(input("Enter the nunmber of elements: \n"))

listOfElementsA = list(map(int,input("Enter the elements separated by space: \n").strip().split()))

k = int(input("Enter the value of K: \n"))

print(getMinDiff(listOfElementsA,size,k))


