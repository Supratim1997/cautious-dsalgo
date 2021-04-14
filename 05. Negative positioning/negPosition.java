import java.io.*;
import java.util.Arrays;

class negPosition
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of Elements:");
        int size = Integer.parseInt(br.readLine());
        int listOfElements[] = new int[size];
        int zeroCount = 0, oneCount = 0, twoCount = 0;
        System.out.println("Enter the Elements:");     
        
        String[] strs = br.readLine().trim().split("\\s+");
      
        for(int i=0;i<size;i++)
        {
            listOfElements[i] = Integer.parseInt(strs[i]);
        }

        int j = 0;
        for(int i=0;i<size;i++)
        {
            if(listOfElements[i]<0)
            {
                int t = listOfElements[i];
                listOfElements[i] = listOfElements[j];
                listOfElements[j] = t;
                j++;
            }
        }
        
        for(int i = 0;i < size;i++)
        {
            System.out.print(listOfElements[i]+" ");
            
        }
        
       
    }
}