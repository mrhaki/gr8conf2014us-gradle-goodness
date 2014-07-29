package gr8conf.us

class OtherSpec extends spock.lang.Specification {


	def "compare string value"() {
		expect:
		'Gr8Conf US' == 'Gr8Conf EU'
	}

}