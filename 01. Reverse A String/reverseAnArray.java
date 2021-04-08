import java.io.*;

class reverseAnArray
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of Elements:");
        int size = Integer.parseInt(br.readLine());
        int listOfElements[] = new int[size];
        
        System.out.println("Enter the Elements:");     
        
        // String[] strs = br.readLine().trim().split("\\s+");
                
        // for(int i=size-1;i>=0;i--)
        // {
        //     listOfElements[size - i -1] = Integer.parseInt(strs[i]);
        // }

        for(int i=0;i<size;i++)
        {
            listOfElements[size - i - 1] = Integer.parseInt(br.readLine());
        }
        
        for(int elem : listOfElements)
        {
            System.out.print(elem + " ");
        }
    }
}