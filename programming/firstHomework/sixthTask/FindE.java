
class FindE {
        static final int LIMIT = 100;
	public static double findE(int i) {
		if (i == LIMIT) {
			return i;
		}
		++i;	
		double ans =( i + (i / findE(i) )  );
		// System.out.println(ans);
		return ans;
	}
 
	public static void main(String[] args) {
		double e = 2 + 1 / findE(0);
		System.out.println(e); 
	}
}
