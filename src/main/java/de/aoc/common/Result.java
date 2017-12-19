package de.aoc.common;

public class Result<T> {

	private T value;
	private String description;
	
	public Result(T value, String description) {
		this.description = description;
		this.value = value;
	}

	public T getValue() {
		return this.value;
	}

	public String getDescription() {
		return description;
	}
	
}
