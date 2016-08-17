package scau.com.dao;
public class TestTransform {
	public static void main(String[] args) {
		
		System.out.println(transform("contract_name"));
	}

	public static String transform(String str) {
		while (str.contains("_")) {
			int i = str.indexOf("_");
			if (i + 1 < str.length()) {
				char c = str.charAt(i + 1);
				String temp = (c + "").toUpperCase();
				str = str.replace("_" + c, temp);
			}
		}
		return str;
	}
}
