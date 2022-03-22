import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Filter_student_data {
    public static void main(String[] args){
        String line = "";
        String splitBy = ",";
        int i=0;
        ArrayList<Integer> l=new ArrayList<Integer>();
        try {

            BufferedReader br = new BufferedReader(new FileReader("..\\HU_JAVA_TRACK\\File_handling_assignment\\StudentData.csv"));
            line = br.readLine();
            while ((line = br.readLine()) != null)
            //returns a Boolean value
            {
                String[] input = line.split(splitBy);
                l.add(Integer.valueOf(input[4]));
            }
        }
        catch(IOException e) {
            e.printStackTrace();
        }
        Collections.sort(l);
        int[] five_rank=new int[5];
        System.out.println(l);
        for(int j=0;j<5;j++)
        {
            five_rank[j]=l.get(j);
        }
        try {

            PrintWriter writer = new PrintWriter("..\\HU_JAVA_TRACK\\File_handling_assignment\\test.csv");
            BufferedReader br = new BufferedReader(new FileReader("..\\HU_JAVA_TRACK\\File_handling_assignment\\StudentData.csv"));
            StringBuilder sb = new StringBuilder();
            line = br.readLine();
            String[] input1=line.split(splitBy);
            sb.append(input1[0]+","+input1[1]+","+input1[2]+","+input1[3]+","+input1[4]+"\n");
            while ((line = br.readLine()) != null)
            {
                String[] input = line.split(splitBy);
                for (int j=0;j<5;j++)
                {
                    if(five_rank[j]==(Integer.parseInt(input[4])))
                    {
                        sb.append(input[0]+","+input[1]+","+input[2]+","+input[3]+","+input[4]+"\n");
                    }
                }
            }
            System.out.println(sb);
            writer.write(sb.toString());
            writer.close();
        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }
}
