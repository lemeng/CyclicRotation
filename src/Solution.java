
public class Solution {

	public static void main(String[] args) {
		int[] toBeRotated = {3,5,7,9,8,6};
		int[] result;
		int rotationTimes = 1;
		result = solution(toBeRotated,rotationTimes);
		
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
		
	}
	
	public static int[] solution(int[] A, int K) {
		int[] rotatedArray = new int[A.length];
		
		int index = 0;
		int rotationTimes = 0;
		
		if (A.length != 0) {
			rotationTimes =  K % A.length;
		}
		
		for (int count = rotationTimes, j = A.length - 1; count > 0; count--, j--) {
				rotatedArray[count-1] = A[j];		
				index++;
			}
		
		for (int i = 0; i < (A.length - rotationTimes); i++) {
			rotatedArray[index] = A[i];
			index++;
		}
		
		return rotatedArray;
	}

}
