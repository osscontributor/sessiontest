package demo

import grails.test.mixin.*
import spock.lang.Specification

@TestFor(MyController)
class MyControllerSpec extends Specification {

    void 'test session'() {
        when:
        controller.settingSession()

        then:
        session.band == 'King Crimson'
    }
}