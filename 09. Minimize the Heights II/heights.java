import java.io.*;
import java.util.Arrays;

class heights
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of Elements in array A:");
        int sizeA = Integer.parseInt(br.readLine());
        int listOfElementsA[] = new int[sizeA];
        System.out.println("Enter the Elements for A:");     
        String[] strs = br.readLine().trim().split("\\s+");
        System.out.println("Enter the Value for K:");     
        int k = Integer.parseInt(br.readLine());
        for(int i=0;i<sizeA;i++)
        {
            listOfElementsA[i] = Integer.parseInt(strs[i]);
        }

        System.out.println(getMinDiff(listOfElementsA,sizeA,k));


    }

    static int getMinDiff(int[] arr, int n, int k) 
    {
        
        Arrays.sort(arr);
        int minEle, maxEle;
        int result = arr[n-1] - arr[0];
        
        for(int i =1; i<=n-1; i++)
        {
            if(arr[i]>=k)
            {
                maxEle = Math.max(arr[i-1] + k, arr[n-1]-k);
                minEle = Math.min(arr[0]+k, arr[i]-k);
                
                result = Math.min(result, maxEle-minEle);
            }
        }
        return result;
    }
}