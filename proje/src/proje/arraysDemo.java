package proje;

public class arraysDemo {

	public static void main(String[] args) {

		double[] myLıst = { 1.3, 2.4, 5.8, 5.4, 6.8 };
		double total = 0;
		double max = myLıst[0];
		for (double numbers : myLıst) {

			System.out.println(numbers);
			if (max < numbers) {
				max = numbers;

			}
			total = total + numbers;

		}

		System.out.println("Dizide ki sayıların toplamı" + total);
		System.out.println("Dizide ki en büyük sayı" + max);

	}
}
