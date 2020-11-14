package test_task12;

import java.io.*;
import java.util.*;

public class Solution {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();

		s.trim();

		StringTokenizer stToken = new StringTokenizer(s, ("[_\\@!?.', ]"));

		int a = stToken.countTokens();

		System.out.println(a);

		while (stToken.hasMoreTokens()) {

			System.out.println(stToken.nextToken());

		}

		scan.close();
	}
}
