package de.aoc.y2017.d14;

import de.aoc.common.AocBase;
import de.aoc.common.Result;

public class Runner extends AocBase{

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
		return new Result<>(-1, "Result task 1");
	}

	@Override
	public Result<?> task2(String input) {
		return new Result<>(-2, "Result task 2");	}

}
