package day06;

import java.io.File;
import java.util.Scanner;

/**
 * 要求用户输入一个文件名并使用File在当前目录下创建出来。 若该文件已经存在，则提示用户该文件已经存在。并创建该文件副本：
 * 例如:用户输入"test.txt".若该文件已存在，提示用户存在后，创建名为：test_副本1.txt 的文件
 * 若该文件也存在了，则创建名为:test_副本2.txt 的文件，以此类推
 */
public class Test02 {
	private static int copies = 1;

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("请输入文件名：");
		String input = scn.nextLine();
		File file = new File(input.trim());
		copyFile(file);
		scn.close();
	}

	/**
	 * 递归调用判断是否已存在文件
	 * @param file
	 */
	private static void copyFile(File file) {
		/*
		 * 首先判断用户输入的文件是否存在:test.txt
		 * 1.如果不存在就直接创建文件:
		 * 2.如果文件已存在,则创建副本文件:test_副本1.txt
		 * 如果副本也存在,那就创建    test_副本   + (原来的值+1) + . + 后缀名
		 * 然后递归
		 */
		try {
			if (file.exists()) {
				System.out.println("该文件已存在");
				String fileFullName = file.getName();// 获取文件全名
				int dotIndex = fileFullName.lastIndexOf(".");// 获取最后一个点的位置,用来分割文件后缀名和文件名的
				String fileName = fileFullName.substring(0, dotIndex);// 获取文件名(不含文件类型名称)
				String fileType = fileFullName.substring(fileFullName.lastIndexOf(".") + 1);// 获取文件后缀名
				File newFile;
				if (copies > 1) {
					newFile = new File(fileName.substring(0, fileName.length() - 1) + copies + "." + fileType);
				} else {
					newFile = new File(fileName + "_副本" + copies + "." + fileType);
				}
				copies++;
				copyFile(newFile);
			} else if (file.createNewFile()) {
				System.out.println("文件创建成功!");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
