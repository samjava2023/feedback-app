package com.feedback.app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class FeedbackApp {

	public static void main(String[] args) {
		System.out.println("Feedback application");
		Scanner scan = new Scanner(System.in);
		//System.out.println("Ent");
		//List<Feedback> feedbackList = new ArrayList<>();
		Map<Integer, Feedback> feedbackMap = new HashMap<>();
		int i=0;
		String wantToConinue = null;
		do {
			System.out.println("Enter your feedback for :");
			String feedbackFor = scan.next();
			//scan.next();
			System.out.println("Enter your rating for : "+feedbackFor+ " from 1-5");
			int rating = scan.nextInt();
			//i++;
			Feedback feedback = new Feedback(++i, feedbackFor, rating);
			//feedbackList.add(feedback);
			feedbackMap.put(i, feedback);
			
			System.out.println("Do you want to continue? y for yes, n for no");
			wantToConinue = scan.next();
		}while(wantToConinue.equalsIgnoreCase("Y"));
		
		/*for(Feedback feedback: feedbackList) {
			System.out.println(feedback);
		}*/
		
		for( Entry<Integer, Feedback> feedbackEntry :feedbackMap.entrySet()) {
			System.out.println("feedback key :" + feedbackEntry.getKey());
			System.out.println("feedback value :" + feedbackEntry.getValue());
		}
		

	}

}


// set of question and rating 1-5