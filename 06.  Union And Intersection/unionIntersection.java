import java.io.*;
import java.util.Arrays;

class unionIntersection
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of Elements in array A:");
        int sizeA = Integer.parseInt(br.readLine());
        System.out.println("Enter the number of Elements in array B:");
        int sizeB = Integer.parseInt(br.readLine());
        int listOfElementsA[] = new int[sizeA];
        int listOfElementsB[] = new int[sizeB];
        int i = 0,j = 0;
        System.out.println("Enter the Elements for A:");     
        
        String[] strs = br.readLine().trim().split("\\s+");
      
        for(i=0;i<sizeA;i++)
        {
            listOfElementsA[i] = Integer.parseInt(strs[i]);
        }

        System.out.println("Enter the Elements for B:");     

        String[] strsB = br.readLine().trim().split("\\s+");
      
        for(i=0;i<sizeB;i++)
        {
            listOfElementsB[i] = Integer.parseInt(strsB[i]);
        }

        Arrays.sort(listOfElementsA);
        Arrays.sort(listOfElementsB);
        i = 0;
        j = 0;


        System.out.println("UNION:");
        while (i < sizeA && j < sizeB) {
            if (listOfElementsA[i] < listOfElementsB[j])
                System.out.print(listOfElementsA[i++] + " ");
            else if (listOfElementsB[j] < listOfElementsA[i])
                System.out.print(listOfElementsB[j++] + " ");
            else {
                System.out.print(listOfElementsB[j++] + " ");
                i++;
            }
        }   
        
        while (i < sizeA)
            System.out.print(listOfElementsA[i++] + " ");
        while (j < sizeB)
            System.out.print(listOfElementsB[j++] + " ");

            System.out.println();
            System.out.println("INTERSECTION:");
            i = 0; j = 0;
        while (i < sizeA && j < sizeB) {
            if (listOfElementsA[i] < listOfElementsB[j])
                i++;
            else if (listOfElementsB[j] < listOfElementsA[i])
                j++;
            else {
                System.out.print(listOfElementsB[j++] + " ");
                i++;
            }
        }
       
    }
}