import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://github.com/')

WebUI.click(findTestObject('Object Repository/TC01 - Create gist/a_Signin'))

WebUI.setText(findTestObject('Object Repository/TC01 - Create gist/input_Username or email addres'), findTestData('Credential').getValue(
        1, 1))

WebUI.setText(findTestObject('Object Repository/TC01 - Create gist/input_Forgot password_password'), findTestData('Credential').getValue(
        2, 1))

WebUI.click(findTestObject('Object Repository/TC01 - Create gist/input_Forgot password_commit'))

'dynamic code\r\n'
not_run: WebUI.setText(findTestObject('Object Repository/TC01 - Create gist/input_Device verification code'), '')

'dynamic condition'
not_run: WebUI.click(findTestObject('Object Repository/TC01 - Create gist/button_Verify'))

