package de.aoc.y2017.d01;

import java.text.StringCharacterIterator;

import de.aoc.common.AocBase;
import de.aoc.common.Result;

public class Runner extends AocBase {

	public static void main(String[] args) {
		Runner runner = new Runner();
		runner.runTasks();
	}

	public Runner(String pathToInput) {
		super(pathToInput);
	}

	public Runner() {
		super();
	}
	
	@Override
	public Result<?> task1(String input) {
		StringCharacterIterator iterator = new StringCharacterIterator(input);
		int sum = 0;
		for (int i = 0; i < input.length() - 1; i++) {
			int current = input.charAt(i);
			int next = input.charAt(i + 1);
			if (current == next) {
				sum += Character.getNumericValue(input.charAt(i));
			}
		}

		if (iterator.first() == iterator.last()) {
			sum += Character.getNumericValue(iterator.first());
		}

		return new Result<Integer>(sum, "Result for Task 1");
	}

	@Override
	public Result<?> task2(String input) {
		int half = input.length() / 2;
		String list1 = input.substring(0, half);
		String list2 = input.substring(half, input.length()); 
		int sum = 0;

		for (int i = 0; i < list1.length(); i++) {
			int currentList1 = Character.getNumericValue(list1.charAt(i));
			int currentList2 = Character.getNumericValue(list2.charAt(i));

			if (currentList1 == currentList2) {
				sum += currentList1 + currentList2;
			}
		}
		return new Result<>(sum, "Result for Task 2");
	}

}
