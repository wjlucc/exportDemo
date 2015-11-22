package test;

import java.io.*;

public class Resource {
	public void getResource() throws IOException {
		// 返回读取指定资源的输入流
//		InputStream is = this.getClass().getResourceAsStream(
//				"/data/res.txt");
		InputStream is = this.getClass().getResourceAsStream(
				"/testData/data.txt");
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		String s = "";
		while ((s = br.readLine()) != null)
			System.out.println(s);
	}

	// public void getResource() throws IOException {
	//
	// // 查找指定资源的URL，其中res.txt仍然开始的bin目录下
	// URL fileURL = this.getClass().getResource("/resource/res.txt");
	// System.out.println(fileURL.getFile());
	// }

	public static void main(String[] args) throws IOException {
		Resource res = new Resource();
		res.getResource();
	}
}