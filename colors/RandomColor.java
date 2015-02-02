import java.util.Random;
import android.graphics.Color;

/*
 * 	method random color returns int color representation (android)
 */

public class RandomColor {
	
	static int randomColor() {
	
		Random r = new Random();
		
		int red = r.nextInt(256);
		int green = r.nextInt(256);
		int blue = r.nextInt(256);
		
		return Color.rgb(red, green, blue);
	}
}
