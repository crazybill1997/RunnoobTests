package Arrays;
/**
 * 在数组初始化后对数组进行扩容
 *
 */
public class Main09 {
	public static void main(String[] args) {
		String[] names = new String[] { "A", "B", "C" };
        String[] extended = new String[5];
        extended[3] = "D";
        extended[4] = "E";
        System.arraycopy(names, 0, extended, 0, names.length);//数组扩容
        for (String str : extended){
            System.out.println(str);
        }
	}
}
