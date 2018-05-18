import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser(GlobalVariable.url)

WebUI.maximizeWindow()

WebUI.click(findTestObject('Registration/button-top register'))

WebUI.click(findTestObject('Registration/button-radio gender'))

WebUI.setText(findTestObject('Registration/input-First name'), fname)

WebUI.setText(findTestObject('Registration/input last name'), lname)

WebUI.click(findTestObject('Registration/input-Date of birth'))

WebUI.click(findTestObject('Registration/input-month'))

WebUI.click(findTestObject('Registration/input-year'))

WebUI.setText(findTestObject('Registration/input- Email'), email)

WebUI.delay(2)

WebUI.setText(findTestObject('Registration/input company name'), company)

WebUI.delay(2)

WebUI.setText(findTestObject('Registration/input password'), password)

WebUI.setText(findTestObject('Registration/input confirm password'), password)

WebUI.click(findTestObject('Registration/button-register'))

WebUI.verifyElementPresent(findTestObject('Registration/verify registration'), 2)

WebUI.click(findTestObject('Registration/button continue'))

