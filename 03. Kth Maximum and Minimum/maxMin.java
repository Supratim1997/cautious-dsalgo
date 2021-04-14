import java.io.*;
import java.util.Arrays;

class maxMin
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of Elements:");
        int size = Integer.parseInt(br.readLine());
        int listOfElements[] = new int[size];
        
        System.out.println("Enter the Elements:");     
        
        String[] strs = br.readLine().trim().split("\\s+");

        System.out.println("Enter the value of K:");
        int k = Integer.parseInt(br.readLine());
        

        for(int i=0;i<size;i++)
        {
            listOfElements[i] = Integer.parseInt(strs[i]);
        }
        Arrays.sort(listOfElements);
        for(int i=0;i<size;i++)
        {
            System.out.println(listOfElements[i]);
        }
        int max = listOfElements[size-1];
        int min = listOfElements[0];
        int maxCount = k-1;
        int minCount = k-1;
        for(int i = 0;i < size;i++)
        {
            if(listOfElements[i] > min && minCount >= 1){
                min = listOfElements[i];
                minCount--;
            }
            
        }
        
        for(int i = size-1;i > 0;i--)
        {
            if(listOfElements[i] < max && maxCount >= 1){
                max = listOfElements[i];
                maxCount--;
            }
            
        }
        System.out.println("Max Value: "+max);
        System.out.println("Min Value: "+min);
       
    }
}