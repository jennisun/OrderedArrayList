import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class T1 {

	public static void main(String[] args) {
		OrderedArrayList<Integer> a = new OrderedArrayList<>();

		Random rand = new Random();

    for (int i = 0; i < 20; i ++) {
			a.add(rand.nextInt(50));
		}


    for (int i : a) {
			System.out.println(i);
		}
	}

}
