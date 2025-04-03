package com.bench_connect.java_7;

import java.util.Arrays;

public class RobotPosition {

	
	public static int[] finalRobotPosition(String moves) {
        int x = 0, y = 0;
        for (char move : moves.toCharArray()) {
            switch (move) {
                case 'L': x--; break;
                case 'R': x++; break;
                case 'U': y++; break;
                case 'D': y--; break;
            }
        }
        return new int[]{x, y};
    }
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(finalRobotPosition("RRULDDDLR")));
	}

}
