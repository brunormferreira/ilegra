package com.github.brunormferreira.desafiofinal.main;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileOperation {
	
	private static final String path = "Data/In/file.dat";
	
	public static void main(String[] args) throws IOException {
		readFiles();
		
		PrintWriter pw = new PrintWriter("Data/Out/file.done.dat");
		BufferedReader br = new BufferedReader(new FileReader(path));
		String line;
		List<String> lines = new ArrayList<>();
		List<String> myList = null;
		while((line = br.readLine()) != null){
            lines.add(line);
            myList = Arrays.asList(line.split("\\ç"));
			for (String cell : myList) {							
				pw.print(cell + " ");
			} 
			pw.append(System.getProperty("line.separator"));
		}
		br.close();
		pw.close();
	}
	
	public static String readFiles() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(path));
        String receive = "";
        while(br.ready()){
           String linha = br.readLine();
            String[] arrayValues = linha.split("\\ç");
            for (String cell : arrayValues) { 
                System.out.print(cell+" "); 
                receive = cell;
            }
            System.out.println("\n");
        }
        br.close();
        return receive;
    }

}