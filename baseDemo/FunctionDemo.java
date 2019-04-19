class FunctionDemo {
	public static void main() {
		System.out.println("进来了");
		String str = getStr("王立卡");
		System.out.println( str);
	}
	
	public static String getStr(String name) {
		StringBuilder strBuilder = new StringBuilder();
		strBuilder.append(name).append(",你好");
		return strBuilder.toString();
	}
}