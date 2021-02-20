package com.onurdesk.numberpattern.program;

/**
 * @author Onurdesk
 *
 *         Thanks for visiting https://onurdesk.com like us on facebook :
 *         https://facebook.com/onurdesk
 */
class NumberPat4 {

	public static void main(String arg[]) {
		
		for (int i = 1; i <= 5; i++) {

					for (int j = 1; j <= i; j++) {

						System.out.print(j);

					}

					System.out.println();

				}

				for (int i = 1, r = 5 - 1; i <= 5 - 1; i++, r--) {

					for (int j = 1; j <= r; j++) {

						System.out.print(j);

					}

					System.out.println();
				}
			
		

		System.out.println("Thanks for visiting https://onurdesk.com");

	}
}
