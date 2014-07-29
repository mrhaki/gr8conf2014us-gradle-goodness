package gr8conf.us

class SampleSpec extends spock.lang.Specification {


	def "compare string value"() {
		expect:
		'Gr8Conf is gr8' == 'Gr8Conf is great'
	}

}