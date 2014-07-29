package gr8conf.us

import spock.lang.Specification

class OtherSpec extends Specification {

	def "checking string value"() {
		expect:
		'Gr8Conf' == 'GreatConf'
	}
}