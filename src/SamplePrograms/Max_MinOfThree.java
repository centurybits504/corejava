package SamplePrograms;
/*Maximum Of 3 Numbers Example*/
public class Max_MinOfThree {
	public static void main(String[] args) {
		new Max_MinOfThree().max_min(300, 100, 200);

	}
	private void max_min(int i, int j, int k) {
		int max = i;
		int min = i;

		if (j > max)
			max = j;
		if (k > max)
			max = k;
		System.out.println("Max  " + max);

		if (j < min)
			min = j;
		if (k < min)
			min = k;
		System.out.println("Min  " + min);
	}
}
