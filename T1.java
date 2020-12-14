import java.util.ArrayList;
import java.util.Arrays;

public class T1 {

	public static void main(String[] args) {
		OrderedArrayList<Integer> a = new OrderedArrayList<>();

    a.add(1);
    a.add(5);
    a.add(2);
    a.add(4);
    a.add(3);
    a.add(1);

    for (int i : a) {
			System.out.println(i);
		}
	}

}
