package demo

import grails.test.mixin.*
import org.junit.*

@TestFor(MyController)
class MyControllerTests {

    void testSettingSession() {
        controller.settingSession()

        assert session.band == 'King Crimson'
    }
}
