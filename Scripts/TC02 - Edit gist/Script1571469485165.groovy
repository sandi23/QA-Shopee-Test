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

WebUI.callTestCase(findTestCase('TC00 - Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/TC02 - Edit gist/summary_New project_Header-lin'))

WebUI.click(findTestObject('Object Repository/TC02 - Edit gist/a_Your gists'))

WebUI.click(findTestObject('Object Repository/TC02 - Edit gist/span_View create gist number 1'))

WebUI.click(findTestObject('Object Repository/TC02 - Edit gist/a_Edit'))

WebUI.setText(findTestObject('Object Repository/TC02 - Edit gist/input_Delete_gistdescription'), 'edit gist')

WebUI.setText(findTestObject('Object Repository/TC02 - Edit gist/input_Delete_gistcontentsname'), 'edit gist number 1')

WebUI.click(findTestObject('Object Repository/TC02 - Edit gist/span_sdsd'))

WebUI.setText(findTestObject('Object Repository/TC02 - Edit gist/div_1sdsssd'), '<div style="position: relative;"><div class="CodeMirror-gutter-wrapper" contenteditable="false" style="left: -53px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 21px;">1</div></div><pre class=" CodeMirror-line " role="presentation" style=""><span role="presentation" style="padding-right: 0.1px;">sdsssd</span></pre></div>')

WebUI.click(findTestObject('Object Repository/TC02 - Edit gist/button_Update public gist'))

WebUI.rightClick(findTestObject('Object Repository/TC02 - Edit gist/button_Delete'))

