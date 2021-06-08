package exam02;

public class Question4 {
	public static void main(String[] args) {

		int male = 0;
		int female = 0;
		int il = 0;
		int yee = 0;
		int sam = 0;
		int sa = 0;
	
		String [] arr = {"010102-2", "991012-1", "960304-1", "881012-2", "040403-1"};
		
		for(int i=0; i<arr.length; i++) {
			int a = Integer.parseInt(arr[i].substring(7));
			if (a == 1) {
				male += 1;
			} else {
				female += 1;
			}
		}
		System.out.println("남" + male + "여" + female);
		
		for(int i=0; i<arr.length; i++) {
			int b = Integer.parseInt(arr[i].substring(0, 2));
			if (b < 21) {
				b += 2000;
			} else {
				b += 1900;
			}
			
			if (2021-b+1 >= 40) {
				sa += 1;
			} else if(2021-b+1 >= 30) {
				sam += 1;
			} else if(2021-b+1 >= 20) {
				yee += 1;
			} else if(2021-b+1 >= 10) {
				il += 1;
			}
		}
		System.out.println("10대" + il +" "+ "20대" + yee +" "+ "30대" + sam +" "+ "40대" + sa);
		
		
	}
}
	