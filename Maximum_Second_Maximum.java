
public class Maximum_Second_Maximum {

	public static void main(String[] args) {
	int[]numbers= {1,5,8,6,7,3,-5,45,-3,14,12};
	int max=Integer.MIN_VALUE;       //Wrapper Class
	int smax=Integer.MIN_VALUE;
	for(int i=0;i<numbers.length;i++) {
		if(numbers[i]>max) {
			smax=max;
			max=numbers[i];
				}else if(numbers[i]>smax) {
					smax=numbers[i];
					
				}
	}System.out.println(max);System.out.println(smax);
	
		
	}
	

	}

