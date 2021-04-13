import java.io.*;

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
        

        for(int i=0;i<size;i++)
        {
            listOfElements[size - i -1] = Integer.parseInt(strs[i]);
        }
        
        int max = listOfElements[0];
        int min = listOfElements[0];
        for(int i = 0;i < size;i++)
        {
            if(listOfElements[i] > max)
                max = listOfElements[i];
            else
                min = listOfElements[i];
        }
        
        System.out.println("Max Value: "+max);
        System.out.println("Min Value: "+min);
       
    }
}