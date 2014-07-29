package gr8conf.us

import org.gradle.api.*
//import org.gradle.api.copy.*

class BookPlugin implements Plugin<Project> {
	void apply(Project project) {
		project.apply plugin: 'base'

		def book = project.extensions.create 'book', Book

		project.afterEvaluate {
			project.tasks.create(name: 'aggregate') {
				onlyIf { !book.chapters.empty }

				doFirst {
					def output = project.file("build/output.html")
					output.text = 'Chapters for: ' + book.title + '\n'
					book.chapters.each { ch ->
						output << ch.file('src/html/index.html').text
					}
				}
			}
		}
	}
}