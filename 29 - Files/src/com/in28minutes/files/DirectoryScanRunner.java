package com.in28minutes.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class DirectoryScanRunner {

	public static void main(String[] args) throws IOException {
		Path dir = Paths.get(".");
//		listDirectoryFiles(dir);

//		walkDirectoryFiles(dir, 5);

		BiPredicate<Path, BasicFileAttributes> javaMatcher = (p, atts) -> String.valueOf(p).endsWith(".java");
		BiPredicate<Path, BasicFileAttributes> directoryMatcher = (p, atts) -> atts.isDirectory();

		findFiles(dir, 5, javaMatcher);
		findFiles(dir, 5, directoryMatcher);

	}

	public static void listDirectoryFiles(Path path) throws IOException {

		Files.list(path).forEach(System.out::println);
	}

	public static void walkDirectoryFiles(Path path, int depth) throws IOException {
		Predicate<? super Path> predicate = p -> String.valueOf(p).endsWith(".java");
		Files.walk(path, depth).filter(predicate).forEach(System.out::println);
	}

	static void findFiles(Path path, int depth, BiPredicate<Path, BasicFileAttributes> matcher) throws IOException {
		Files.find(path, depth, matcher).forEach(System.out::println);
	}

}
