package stringmani;

public class CutMaxSquare {

	public static void findLargestSquare(int l,int b) {
		int maxLength=0;
		int maxBreadth=0;
		if(l>0&&b>0) {
		if(l>b) {
			//two things: calcaulte max
			//pass remaining result in recursion.
			 maxLength=l-b;
			 maxBreadth=b;
			System.out.println("max square"+ b+","+b);
		}
		else if(l<b) {
			maxLength=l;
			maxBreadth=b-l;
			System.out.println("max square"+ l+","+l);
		}
		else {
			maxLength=l;
			maxBreadth=l;
		}
		//recusrion call
		findLargestSquare( maxLength,maxBreadth);
		}
	}
	public static void main(String args[]) {
		//9,5
		// 
		findLargestSquare(9,5);
	}
}
