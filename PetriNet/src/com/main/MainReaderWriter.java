package com.main;

import com.ReaderWriter.ReaderWriter;

public class MainReaderWriter {
	public static void main(String[] args) {

		ReaderWriter readWrite = new ReaderWriter();

		readWrite.execute("startReading");
		readWrite.execute("endReading");
		readWrite.execute("startWriting");
		readWrite.execute("endWriting");
	}
}
