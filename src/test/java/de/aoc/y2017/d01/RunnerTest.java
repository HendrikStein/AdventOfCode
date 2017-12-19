package de.aoc.y2017.d01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import de.aoc.y2017.d01.Runner;

public class RunnerTest {

	private Runner runner;
	
	@Test
	public void testTask1() throws Exception {
		runner = new Runner("src//test//resources//aoc2017/d01//day1Task1Test1.input");
		Assertions.assertEquals(3, runner.task1(runner.getFileInput()).getValue());

		runner = new Runner("src//test//resources//aoc2017/d01//day1Task1Test2.input");
		Assertions.assertEquals(4, runner.task1(runner.getFileInput()).getValue());

		runner = new Runner("src//test//resources//aoc2017/d01//day1Task1Test3.input");
		Assertions.assertEquals(0, runner.task1(runner.getFileInput()).getValue());

		runner = new Runner("src//test//resources//aoc2017/d01//day1Task1Test4.input");
		Assertions.assertEquals(9, runner.task1(runner.getFileInput()).getValue());
	}

	@Test
	public void testTask2() throws Exception {
		runner = new Runner("src//test//resources//aoc2017/d01//day1Task2Test1.input");
		Assertions.assertEquals(6, runner.task2(runner.getFileInput()).getValue());

		runner = new Runner("src//test//resources//aoc2017/d01//day1Task2Test2.input");
		Assertions.assertEquals(0, runner.task2(runner.getFileInput()).getValue());

		runner = new Runner("src//test//resources//aoc2017/d01//day1Task2Test3.input");
		Assertions.assertEquals(4, runner.task2(runner.getFileInput()).getValue());

		runner = new Runner("src//test//resources//aoc2017/d01//day1Task2Test4.input");
		Assertions.assertEquals(12, runner.task2(runner.getFileInput()).getValue());

		runner = new Runner("src//test//resources//aoc2017/d01//day1Task2Test5.input");
		Assertions.assertEquals(4, runner.task2(runner.getFileInput()).getValue());

	}

}
