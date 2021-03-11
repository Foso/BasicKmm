package de.jensklingenberg.basickmm.shared.test


class MockUser()

interface TestEnvironment {
    fun launchApp()
    fun assertTrue(assert: Boolean)
    fun assertEquals(expected: String, actual: String)
    fun clickOnNodeWithText(text: String)
    fun assertNodeDisplayed(text: String)

}


class OverviewTest(private val testEnvironment: TestEnvironment) {

    fun whenScreenOpensShowKickAssTitle() {
        testEnvironment.launchApp()
        testEnvironment.assertNodeDisplayed("Kick-Ass")
        testEnvironment.assertEquals("1","1")
    }
}
