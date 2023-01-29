import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

//Open Brower
WebUI.openBrowser('https://www.amazon.com')

//Call test case for login
WebUI.callTestCase(findTestCase('pages/login/login with correct data'), [:], FailureHandling.STOP_ON_FAILURE)

//Call test case for navigate to cart
WebUI.callTestCase(findTestCase('pages/cart/navigate to cart'), [:], FailureHandling.STOP_ON_FAILURE)

//Call test case for delete product in cart
WebUI.callTestCase(findTestCase('pages/cart/delete product'), [:], FailureHandling.OPTIONAL)

//Call test case for navigate to product detail page by url
WebUI.callTestCase(findTestCase('pages/product detail/navigate to product url'), [('url') : url_product], FailureHandling.STOP_ON_FAILURE)

//Call test case for add product to cart from product detai page
WebUI.callTestCase(findTestCase('pages/product detail/add to cart'), [:], FailureHandling.STOP_ON_FAILURE)

//Call test case for checkout product from cart
WebUI.callTestCase(findTestCase('pages/cart/checkout product'), [:], FailureHandling.STOP_ON_FAILURE)

