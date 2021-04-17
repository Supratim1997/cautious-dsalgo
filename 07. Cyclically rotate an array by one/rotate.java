import java.io.*;
import java.util.Arrays;

class rotate
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of Elements in array A:");
        int sizeA = Integer.parseInt(br.readLine());
        int listOfElementsA[] = new int[sizeA];
        System.out.println("Enter the Elements for A:");     
        
        String[] strs = br.readLine().trim().split("\\s+");
      
        for(int i=0;i<sizeA;i++)
        {
            listOfElementsA[i] = Integer.parseInt(strs[i]);
        }

        System.out.println("Enter the rotation count: ");     
        int rotationCount = Integer.parseInt(br.readLine());
        while(rotationCount!=0)
        {
            int last = listOfElementsA[sizeA-1];
            for(int i = sizeA-1;i>=1;i--)
            {
                listOfElementsA[i] = listOfElementsA[i-1];
            }
            listOfElementsA[0] = last;
            rotationCount--;
        }
        for(int i=0;i<sizeA;i++)
        System.out.print(listOfElementsA[i]+" ");


    }
}