import java.io.*;
import java.util.Arrays;

class sortList
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

    
        for(int i=0;i<size;i++)
        {
            if(listOfElements[i] == 0)
                zeroCount++;
            else if(listOfElements[i] == 1)
                oneCount++;
            else
                twoCount++;
        }
        System.out.println(oneCount);
        System.out.println(zeroCount);
        System.out.println(twoCount);
        for(int i = 0;i<size;i++)
        {
            if(zeroCount >= 1)
            {
                listOfElements[i]=0;
                zeroCount--;
            }
            else if(oneCount >= 1)
            {
                listOfElements[i]=1;
                oneCount--;
            }
            else if(twoCount >= 1)
            {
                listOfElements[i]=2;
                twoCount--;
            }
        }
        
        for(int i = 0;i < size;i++)
        {
            System.out.print(listOfElements[i]+" ");
            
        }
        
       
    }
}