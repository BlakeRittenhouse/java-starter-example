package com.qa.gitpush;

public class ten_count_method {

	public static class examples {

		public static void method() {
			System.out.println("starting task");

			int[] array = new int[10];

			for (int handle : array) {
				System.out.print(handle + "\s");

				for (int x = 0; x < array.length; x++) {
					array[x] = x + 1;
					System.out.print(array[x] + "\s");
				}

				System.out.println("");

				for (int x = 0; x < array.length; x++) {
					array[x] *= 10;
					System.out.println(array[x] + " ");
				}
			}
		}

	}
}