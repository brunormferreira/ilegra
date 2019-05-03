package com.github.brunormferreira.desafiofinal.main;

import java.io.*; 
import java.util.HashSet; 

public class FileOperation 
{ 
    public static void main(String[] args) throws IOException  
    { 
        // PrintWriter object for output.txt 
        PrintWriter pw = new PrintWriter("/home/ilegra0111/Documentos/Bruno/BrunoDesafio/Out/Test.txt"); 
          
        // BufferedReader object for input.txt 
        BufferedReader br = new BufferedReader(new FileReader("/home/ilegra0111/Documentos/Bruno/BrunoDesafio/In/Test.txt")); 
          
        String line = br.readLine(); 
        String[] arrayValores = line.split("\\ç");
        for (String cell : arrayValores) { 
            System.out.print(cell+" "); 
        }
          
        // set store unique values 
        HashSet<String> hs = new HashSet<String>(); 
          
        // loop for each line of input.txt 
        while(line != null) 
        { 
            // write only if not 
            // present in hashset 
            if(hs.add(line)) 
                pw.println(line); 
              
            line = br.readLine(); 
              
        } 
          
        pw.flush(); 
          
        // closing resources 
        br.close(); 
        pw.close(); 
          
        System.out.println("File operation performed successfully"); 
    } 
} 
