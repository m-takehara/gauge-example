test:
	mvn test

test-only-samples:
	mvn test -Dtags='sample1 | sample2'

test-without-sample1:
	mvn test -Dtags='!sample1'
