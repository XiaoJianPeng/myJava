class FunctionDemo {
	public static void main() {
		System.out.println("������");
		String str = getStr("������");
		System.out.println( str);
	}
	
	public static String getStr(String name) {
		StringBuilder strBuilder = new StringBuilder();
		strBuilder.append(name).append(",���");
		return strBuilder.toString();
	}
}