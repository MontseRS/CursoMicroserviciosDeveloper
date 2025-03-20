package com.proa.app.exceptions;

//import java.io.IOException;
//import java.nio.file.Files;
//import java.nio.file.Paths;

public class ClientNotFoundException extends Exception {
	private static final long serialVersionUID = 1L;
	
	//public void ejemplo() throws IOException 
	//{
		//var archivo=Files.createFile(Paths.get("path"));
	//}
	
	public ClientNotFoundException(String message)
	{
		super(message);
	}

}
