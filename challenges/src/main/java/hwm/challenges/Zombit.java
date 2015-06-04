package hwm.challenges;

public class Zombit {

	public static Object answer(int[][] intervals) {
		System.out.println(intervals);
		for(int i = 1;i<intervals.length;i++){
			int bottom = intervals[i][0];
			for(int j=0;j<i;j++){
				int top = intervals[j][1];
				if(top > bottom){
					intervals[j][1]=bottom;
				}
			}
		}
		System.out.println(intervals);
		int sum = 0;
		for(int[] interval : intervals){
			sum += (interval[1]-interval[0]);
		}
		return sum;
	}

}
