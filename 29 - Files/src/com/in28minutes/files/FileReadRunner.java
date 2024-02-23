package com.in28minutes.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileReadRunner {

	public static void main(String[] args) throws IOException {
		Path dir = Paths.get(".");
		Path pathFileToRead = Paths.get("./resources/data.txt");

		// Reads the whole file at once
//		List<String> lines = Files.readAllLines(pathFileToRead);
//		System.out.println(lines);

		// Reads lines one at a time
		Files.lines(pathFileToRead).forEach(System.out::println);

		Files.lines(pathFileToRead)
				.map(el -> el.toLowerCase())
				.filter(str -> str.contains("a")).forEach(System.out::println);

	}

}
