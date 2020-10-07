/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab10;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 *
 * @author 91936
 */
public class word {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException,IOException {
          BufferedReader obj=new BufferedReader(new FileReader("lab1.txt"));
        String read;
        int i=1,count=0;
        String str[];
        while((read=obj.readLine())!=null)
        {
            str=read.split(" ");
            for(i=0;i<str.length;i++)
            {
                System.out.print("*"+str[i]+"\n");
                if(str[i].length()==3)
                    count++;
            }
        }
        System.out.println("Three Letter Word--->:"+count);
        obj.close();
        // TODO code application logic here
    }
    
}
