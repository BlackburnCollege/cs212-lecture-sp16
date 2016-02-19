import java.util.*;

public class UseArrayList {
	public static void main(String [] args){
		ArrayList al = new ArrayList();
		for (int i = 0; i < args.length; i++) {
			al.add(0, args[i]);
		}
		System.out.println("Size: " + al.size());

		for(int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}

	}

}
