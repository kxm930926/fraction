package utils

import spock.lang.Specification
import spock.lang.Unroll

class ComputerToolTest extends Specification {
    def "GetCommonDivisor"() {
        expect:
        result == ComputerTool.getCommonDivisor(a,b)
        where:
        result |  a |  b
        3      | 3  |  9
        5      | 5  | -10
        1      | 5  | 6
        1      | 7  | -8
        5      | 15  | 25
        1      | 0  | 10
    }
}
