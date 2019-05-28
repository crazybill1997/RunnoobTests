package Arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * 使用 retainAll () 方法来计算两个数组的交集
 *
 */

public class Main13 {
	public static void main(String[] args) {
		ArrayList arr1 = new ArrayList();
		arr1.add("1");
		arr1.add("2");
		arr1.add("3");
		List<String> arr2 = new ArrayList<String>();
		arr2.add("2");
		arr1.retainAll(arr2);
		System.out.println(arr1);
		
		
		
		ArrayList objArray = new ArrayList();
        ArrayList objArray2 = new ArrayList();
        objArray2.add(0,"common1");
        objArray2.add(1,"common2");
        objArray2.add(2,"notcommon");
        objArray2.add(3,"notcommon1");
        objArray.add(0,"common1");
        objArray.add(1,"common2");
        objArray.add(2,"notcommon2");
        System.out.println("array1 数组元素："+objArray);
        System.out.println("array2 数组元素："+objArray2);
        objArray.retainAll(objArray2);
        System.out.println("array2 & array1 数组交集为："+objArray);
	}
}
