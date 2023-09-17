import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {
	public static void main(String[] args) throws Exception, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		PriorityQueue<Integer> lowest = new PriorityQueue<>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				int abso1 = Math.abs(o1);
				int abso2 = Math.abs(o2);
				
				if(abso1==abso2) return o1 > o2 ? 1 : -1;
				
				return abso1-abso2;
				
			}
		});
		
		while(N-->0) {
			int X = Integer.parseInt(br.readLine());
			if(X==0) {
				if(lowest.isEmpty()) {
					System.out.println(0);
				}
				else {
					System.out.println(lowest.poll());
				}
			}else {
			lowest.add(X);
			}
		}
		
	}

}