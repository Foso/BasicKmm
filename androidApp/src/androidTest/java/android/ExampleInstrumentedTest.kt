package android



import android.content.Intent
import androidx.test.espresso.intent.rule.IntentsTestRule
import com.schibsted.spain.barista.assertion.BaristaVisibilityAssertions
import com.schibsted.spain.barista.interaction.BaristaClickInteractions
import de.jensklingenberg.basickmm.androidApp.MainActivity
import de.jensklingenberg.basickmm.shared.test.OverviewTest
import de.jensklingenberg.basickmm.shared.test.TestEnvironment
import org.junit.Assert
import org.junit.Rule
import org.junit.Test


/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */

class ExampleInstrumentedTest   {


    @Test
    fun whenUserClicksOnListItem_OpenDetailPage()  {
        OverviewTest(AndroidTestEnv()).whenScreenOpensShowKickAssTitle()
    }

}

class AndroidTestEnv: TestEnvironment{
    @Rule
    @JvmField
    val rule = IntentsTestRule(MainActivity::class.java, false, false)


    override fun launchApp() {
        rule.launchActivity(Intent())
    }

    override fun assertTrue(assert: Boolean) {
        Assert.assertTrue(assert)
    }

    override fun assertEquals(expected: String, actual: String) {
        Assert.assertEquals(expected, actual)
    }

    override fun clickOnNodeWithText(text: String) {
        BaristaClickInteractions.clickOn(text)
    }

    override fun assertNodeDisplayed(text: String) {
        BaristaVisibilityAssertions.assertDisplayed(text)
    }
}

