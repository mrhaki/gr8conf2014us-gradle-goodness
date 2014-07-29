package gr8conf.us

import org.gradle.api.*

class Book {
	String title
	List chapters = []

	void title(String title) {
		this.title = title
	}

	void chapter(Project project) {
		chapters << project
	}
}