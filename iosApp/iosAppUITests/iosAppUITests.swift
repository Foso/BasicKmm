import XCTest
import shared


class IosTest : TestEnvironment{
    func assertNodeDisplayed(text: String) {
        //TODO Implement
    }
    
    func clickOnNodeWithText(text: String) {
        XCUIApplication().tables.buttons[text].tap()

    }
    
    func assertEquals(expected: String, actual: String) {
        XCTAssertEqual(expected, actual)
    }
    
    func assertTrue(assert: Bool) {
        XCTAssertTrue(assert)
    }
    
    let app = XCUIApplication()
    
    func launchApp() {
        app.launch()
    }
    
    
}


class appNameUITests: XCTestCase {

    override func setUp() {
        
    }

    override func tearDown() {
        // Put teardown code here. This method is called after the invocation of each test method in the class.
    }

    func testExample() {
        // UI tests must launch the application that they test.
        let testEnvironment = IosTest()
         
        OverviewTest(testEnvironment:testEnvironment).whenScreenOpensShowKickAssTitle()

        // Use recording to get started writing UI tests.
        // Use XCTAssert and related functions to verify your tests produce the correct results.
    }

    func testLaunchPerformance() {
        if #available(macOS 10.15, iOS 13.0, tvOS 13.0, *) {
            // This measures how long it takes to launch your application.
            measure(metrics: [XCTOSSignpostMetric.applicationLaunch]) {
                XCUIApplication().launch()
            }
        }
    }
}
