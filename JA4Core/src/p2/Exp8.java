package p2;

import java.io.*;
public class Exp8{
public static void main(String args[])  
{  
    try{  

        //open the file  
    FileInputStream fstream=new FileInputStream("");//here pass the own java file name with full path 

        // use DataInputStream to read binary NOT text  
    // DataInputStream in=new DataInputStream(fstream);  

        //  
    BufferedReader br=new BufferedReader(new InputStreamReader(fstream));  
        //read data line by line from the file  
        String s;  
        while((s = br.readLine() ) != null)  
        {  
            System.out.println(s);  
        }  
        
    }  
    catch(Exception e){  
        e.printStackTrace();  
    }  
}  

}