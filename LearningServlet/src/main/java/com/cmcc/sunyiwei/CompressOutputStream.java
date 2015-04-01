package com.cmcc.sunyiwei;

import java.io.IOException;
import java.util.zip.GZIPOutputStream;

import javax.servlet.ServletOutputStream;

public class CompressOutputStream extends ServletOutputStream {
	private GZIPOutputStream gzipOutputStream = null;
	
	public GZIPOutputStream getGzipOutputStream() {
		return gzipOutputStream;
	}

	public void setGzipOutputStream(GZIPOutputStream gzipOutputStream) {
		this.gzipOutputStream = gzipOutputStream;
	}

	public CompressOutputStream(ServletOutputStream servletOutputStream) throws IOException {
		// TODO Auto-generated constructor stub
		gzipOutputStream = new GZIPOutputStream(servletOutputStream);
	}
	
	@Override
	public void write(int b) throws IOException {
		// TODO Auto-generated method stub
		gzipOutputStream.write(b);
	}

}
