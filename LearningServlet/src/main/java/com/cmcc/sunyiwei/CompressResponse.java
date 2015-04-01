package com.cmcc.sunyiwei;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.zip.GZIPOutputStream;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;

public class CompressResponse extends HttpServletResponseWrapper {
	private CompressOutputStream compressOutputStream = null;
	private PrintWriter pWriter = null;
	private Object used = null;

	public CompressResponse(HttpServletResponse response) {
		super(response);
	}
	
	public GZIPOutputStream getCompressOutputStream(){
		return compressOutputStream.getGzipOutputStream();
	}

	@Override
	public ServletOutputStream getOutputStream() throws IOException {
		if (used != null && !used.equals(compressOutputStream)) {
			throw new IllegalStateException();
		}

		if (compressOutputStream == null) {
			compressOutputStream = new CompressOutputStream(getResponse()
					.getOutputStream());

			used = compressOutputStream;
		}

		return compressOutputStream;
	}

	@Override
	public PrintWriter getWriter() throws IOException {
		if (used != null && !used.equals(pWriter)) {
			throw new IllegalStateException();
		}

		if (pWriter == null) {
			compressOutputStream = new CompressOutputStream(getResponse()
					.getOutputStream());
			pWriter = new PrintWriter(new OutputStreamWriter(
					compressOutputStream, getResponse().getCharacterEncoding()));
			used = pWriter;
		}

		return pWriter;
	}

}
