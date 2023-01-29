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

//Click button sign in in navbar
WebUI.click(findTestObject('pages/homepage/btn_sign_in'))

//Input correct email
WebUI.setText(findTestObject('pages/login/input_email'), findTestData('data user').getValue(2, 1))

//Click continue button 
WebUI.click(findTestObject('pages/login/btn_continue'))

//Input correct password
WebUI.setText(findTestObject('pages/login/input_password'), findTestData('data user').getValue(3, 1))

//Click sign in button
WebUI.click(findTestObject('pages/login/btn_sign_in'))

//Wait skip button appear
def wait_btn_skip = WebUI.waitForElementPresent(findTestObject('pages/login/btn_skip'), 10)

//Condition to check if skip button appears
if (wait_btn_skip == true) {
	
	//If skip button appear, click it
	WebUI.click(findTestObject('pages/login/btn_skip'))
	
}