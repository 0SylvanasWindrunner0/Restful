package com.javaman.utils;

import java.io.IOException;
import java.io.InputStream;

import org.apache.tomcat.util.http.fileupload.ByteArrayOutputStream;

public class IOUtil {
	public static byte[] toByteArray(InputStream input) throws IOException {
	    ByteArrayOutputStream output = new ByteArrayOutputStream();
	    byte[] buffer = new byte[4096];
	    int n = 0;
	    while (-1 != (n = input.read(buffer))) {
	        output.write(buffer, 0, n);
	    }
	    return output.toByteArray();
	}
	
}
