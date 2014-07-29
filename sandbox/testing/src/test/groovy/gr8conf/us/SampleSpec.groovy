package gr8conf.us

import spock.lang.Specification

class SampleSpec extends Specification {

	def "checking string value"() {
		expect:
		'Gr8Conf US is great' == 'Gr8Conf US is gr8'
	}
}