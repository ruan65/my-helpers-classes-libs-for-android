public class HexColorFrom4parts {

	public static int composeHex(int alpha, int r, int g, int b) {
		String hexString = Integer.toHexString(alpha) + Integer.toHexString(r)
				+ Integer.toHexString(g) + Integer.toHexString(b);
		return (int) Long.parseLong(hexString, 16);
	}

}
