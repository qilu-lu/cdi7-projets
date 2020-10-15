package seul;

import java.util.Scanner;

public class Bowling {
	public static void main(String[] args) {
		
	}

	public static int score2(String scores) {
		int summe = 0;
		Frame[] frame = new Frame[10];

		String[] scorePerFrame = scores.split(" ");
		for (int i = 0; i < 10; i++) {
			frame[i] = new Frame(i + 1, scorePerFrame[i]);
		}

		int sum = 0;
		for (int i = 0; i < 10; i++) {
			Frame nextFrame = null;
			Frame framePre=null;
			Frame nnextFrame=null;
			if (i < 9) {
				nextFrame = frame[i + 1];
				framePre=frame[i];
			
			if(i<8) {
				nnextFrame=frame[i+2];
			}}
			sum += frame[i].computeScore(framePre,nextFrame,nnextFrame);
		}
		Frame last=new Frame(10,scorePerFrame[9]);
		sum = sum + frame[9].computeScore10(last);
		System.out.println(sum);
		return sum;
	}
}

