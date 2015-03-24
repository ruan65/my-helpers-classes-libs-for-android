public class HexColorFrom4parts {

	public static int composeHex(int alpha, int r, int g, int b) {

		String hexString = toHex(alpha) + toHex(r) + toHex(g) + toHex(b);

		return (int) Long.parseLong(hexString, 16);
	}

    private static String toHex(int n) {

        return n > 15 ? Integer.toHexString(n) : "0" + Integer.toHexString(n);
    }

    /**
     * Hex color string to int[] array converter
     *
     * @param hexARGB should be color hex string: #AARRGGBB or #RRGGBB
     * @return int[] array: [alpha, r, g, b]
     * @throws IllegalArgumentException
     */

    public static int[] hexStringToARGB(String hexARGB) throws IllegalArgumentException {

        Log.d("ml", "hexARGB = " + hexARGB);

        if (!hexARGB.startsWith("#") || !(hexARGB.length() == 7 || hexARGB.length() == 9)) {

            throw new IllegalArgumentException("Hex color string is incorrect!");
        }

        int[] intARGB = new int[4];

        if (hexARGB.length() == 9) {
            intARGB[0] = Integer.valueOf(hexARGB.substring(1, 3), 16); // alpha
            intARGB[1] = Integer.valueOf(hexARGB.substring(3, 5), 16); // red
            intARGB[2] = Integer.valueOf(hexARGB.substring(5, 7), 16); // green
            intARGB[3] = Integer.valueOf(hexARGB.substring(7), 16); // blue
        } else hexStringToARGB("#FF" + hexARGB.substring(1));

        return intARGB;
    }
}
