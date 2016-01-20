package com.main.fileProcessing;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileNIO {

    String data = "Hello everyOne!";

    public String readFile(String fileName) {
	String content = null;
	try {
	    content = Files.readAllBytes(Paths.get(fileName)).toString();
	} catch (IOException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
	return content;
    }

    public String readByLine(String fileName) {
	String content = null;
	try {
	    content = Files.readAllLines(Paths.get(fileName), Charset.defaultCharset()).toString();
	} catch (IOException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
	return content;
    }

    public void writeData(String fileName) {
	try {
	    Files.write(Paths.get(fileName), data.getBytes(), StandardOpenOption.CREATE);
	} catch (IOException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
    }
}