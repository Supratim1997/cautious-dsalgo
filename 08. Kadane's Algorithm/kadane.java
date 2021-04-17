import java.io.*;
import java.util.Arrays;

class kadane
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of Elements in array A:");
        int sizeA = Integer.parseInt(br.readLine());
        int listOfElementsA[] = new int[sizeA];
        System.out.println("Enter the Elements for A:");     
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        String[] strs = br.readLine().trim().split("\\s+");
      
        for(int i=0;i<sizeA;i++)
        {
            listOfElementsA[i] = Integer.parseInt(strs[i]);
        }

        for (int i = 0; i < sizeA; i++)
        {
            max_ending_here = max_ending_here + listOfElementsA[i];
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        
        System.out.println(max_so_far);


    }
}