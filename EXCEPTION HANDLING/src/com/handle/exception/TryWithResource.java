package com.handle.exception;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TryWithResource{
	//static FileWriter fw=null;
	static void createFile(String filePath) throws IOException{
		File file=new File(filePath);
		try{
			if(file.createNewFile()){
				System.out.println("file created....");
			 try(FileWriter fw=new FileWriter(file)){
			fw.write("this is sample try with resource");
				
			}
			
			}
			
		}
		catch(Exception  e){
			System.out.println("some problems");
		}
	/*	finally{                     //we can avoid this when we use try with resource as
			if(fw!=null){             as try(FileWriter fw=new FileWriter(file)){
			                          fw.write("hello");
			                          }
			fw.close();	           
			}*/
		}
			
		
	public static void main(String[] args) throws IOException {
	createFile("C:\\Users\\SHADMAN\\Desktop\\ASD.txt");	
	}	
	


}

