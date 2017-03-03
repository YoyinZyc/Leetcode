package main.Array;
/**
 * @author Cactus
 * @version Create at: 2017年3月2日 下午2:43:43
 * 
 */
public class Pro495_Teemo_Attack {
	public int findPoisonedDuration(int[] timeSeries, int duration) {
		if(timeSeries.length == 0){
            return 0;
        }
		int sumTime = duration;
		for (int i = 0; i < timeSeries.length-1; i++) {
			sumTime += (timeSeries[i+1]-timeSeries[i]) < duration ? (timeSeries[i+1]-timeSeries[i]) : duration;  
		}
		return sumTime;
	}
}
