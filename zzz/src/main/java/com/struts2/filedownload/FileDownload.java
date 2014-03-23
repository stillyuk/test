package com.struts2.filedownload;

import java.io.FileInputStream;
import java.io.InputStream;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class FileDownload extends ActionSupport {
	private String fileName = "Jellyfish";

	public InputStream getDownloadFile() throws Exception {
		return new FileInputStream("D:/tmp/Jellyfish.jpg"); //下载的文件路径
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
}