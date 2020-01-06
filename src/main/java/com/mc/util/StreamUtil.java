package com.mc.util;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class StreamUtil {

	public static List<String> readLine(InputStream ins) throws Exception{
		List<String> list = new ArrayList<String>();
		BufferedReader reader = new BufferedReader(new InputStreamReader(ins));
		String str = null;
		while((str=reader.readLine())!=null) {
			list.add(str);
		}
		return list;
	}
}
