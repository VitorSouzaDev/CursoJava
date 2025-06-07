package testes;

public class PivotIndex {
	public static void main(String[] args) {
		
		int[] nums = {1,7,3,6,5,6};
		int total = 0;
		
		
		for(int num : nums) {
			total += num;
		}

		int esquerda = 0;		
		for(int i = 0; i < nums.length; i++ ) {				
			int direita = total - esquerda - nums[i];
			if (esquerda == direita) {
				System.out.printf("O pivoIndex é: %d",nums[i]);
				return;
			}
			esquerda += nums[i];
		}
		System.out.println("No pivot index found.");
	}
}
