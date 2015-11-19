package com.m3rcuriel.controve.util;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CSVWriter extends FileWriter {

	public CSVWriter(File file, String... headerData) throws IOException {
		super(file);
		if (headerData.length != 0) {
			StringBuilder head = new StringBuilder();
			for (String header : headerData) {
				head.append(header + ",");
			}
			super.write(head.substring(0, head.length() - 1) + "\n");
			super.flush();
		}
	}

	public void writeLine(Number... data) {
		if (data.length != 0) {
			StringBuilder head = new StringBuilder();
			for (Number header : data) {
				head.append(header + ",");
			}
			try {
				super.write(head.substring(0, head.length() - 1) + "\n");
				super.flush();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
