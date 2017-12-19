package de.aoc.common;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.Instant;

import org.apache.commons.io.FileUtils;

public abstract class AocBase {
	private String urlTemplate = "http://adventofcode.com/%s/day/%s";
	private String inputPath = "src//main//resources//aoc%s//day%s.input";
	private String input;
	private String pathToInput;
	private String year;
	private String day;

	public AocBase(String pathToInput) {
		this.pathToInput = pathToInput;
		this.init();
		this.printURL();
	}

	public AocBase() {
		this.init();
		this.pathToInput = String.format(inputPath, this.year, this.day);
		this.printURL();
	}

	private void init() {
		Package p = this.getClass().getPackage();
		this.year = p.getName().substring(8, 12);
		this.day = p.getName().substring(p.getName().length() - 2, p.getName().length());
	}

	private void printURL() {
		String url;
		if (this.day.charAt(0) == '0') {
			url = String.format(urlTemplate, year, this.day.charAt(1));
		} else {
			url = String.format(urlTemplate, year, this.day);
		}
		System.out.println(url);
	}

	public void runTasks() {
		String input;
		try {
			// Read input
			input = this.getFileInput();

			// Execute Task 1
			Instant start = Instant.now();
			Result<?> result = this.task1(input);
			Instant stop = Instant.now();
			Duration duration = Duration.between(start, stop);
			this.printResult(result, duration);

			// Extecute Task 2
			start = Instant.now();
			result = this.task2(input);
			stop = Instant.now();
			duration = Duration.between(start, stop);
			this.printResult(result, duration);

		} catch (IOException e) {
			System.err.println(e);
		}
	}

	private void printResult(Result<?> result, Duration duration) {
		if (result != null) {
			System.out.println(result.getDescription() + " -> " + result.getValue());
		} else {
			System.out.println("Result is Null");
		}

		System.out.println("Duration for Task 1 -> Minutes: " + duration.toMinutes() + " Seconds: "
				+ duration.getSeconds() + " Millis: " + duration.toMillis() + "\n");
	}

	/**
	 * AOC Task 1.
	 * 
	 * @param input
	 *            The input String
	 * @return {@link Result}
	 */
	public abstract Result<?> task1(String input);

	/**
	 * AOC Task 2.
	 * 
	 * @param input
	 *            The input String
	 * @return {@link Result}
	 */
	public abstract Result<?> task2(String input);

	/**
	 * Read file input
	 * 
	 * @return Input String
	 * @throws IOException
	 *             if file is unreadable
	 */
	public String getFileInput() throws IOException {
		if (this.input == null) {
			this.input = FileUtils.readFileToString(new File(this.pathToInput), "UTF-8");
		}
		return this.input;
	}
}
