package com.maxtrain.tutorial;

public class AvgofSubsetof1to75 {

	public static void main(String[] args) {
		
		double sum = 0.0;
		int count = 0;
		
		for(int idx = 1; idx <= 75; idx++) {
			if(idx % 7 == 0 || idx % 3 == 0) {
				sum += idx;
				count++;
			}
		}
			double avg = sum / count;
			var message = String.format("The average is %f", avg);
			
			System.out.println(message);

	}

}
