package codewars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinaryArrayToNumber {

	public static int ConvertBinaryArrayToInt(List<Integer> binary) {

		Collections.reverse(binary);
		int result = 0;
		for (int i = 0; i < binary.size(); i++) {
			result += (int) (binary.get(i) * Math.pow(2, i));
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(1, 1, 0, 1))));
	}
}