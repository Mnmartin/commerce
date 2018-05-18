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

WebUI.callTestCase(findTestCase('Checkout/verify checkout'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('proccessing/button uncheck address'))

WebUI.click(findTestObject('proccessing/input-country'))

WebUI.setText(findTestObject('proccessing/input-city'), city)

WebUI.setText(findTestObject('proccessing/input-Address'), addres)

WebUI.setText(findTestObject('proccessing/input-zipcode'), zip)

WebUI.setText(findTestObject('proccessing/input-phone'), phone)

WebUI.click(findTestObject('proccessing/button-billing address'))

WebUI.delay(2)

WebUI.click(findTestObject('proccessing/button-shipping Address'))

WebUI.delay(2)

WebUI.click(findTestObject('proccessing/button -radio options'))

WebUI.click(findTestObject('proccessing/button-shipping method'))

WebUI.delay(2)

WebUI.click(findTestObject('proccessing/button-radio credit'))

WebUI.delay(0)

WebUI.click(findTestObject('proccessing/button-payement method'))

WebUI.delay(2)

WebUI.click(findTestObject('proccessing/button-payement info'))

WebUI.delay(2)

WebUI.click(findTestObject('proccessing/button confirm'))

WebUI.delay(3)

WebUI.verifyElementPresent(findTestObject('proccessing/verify-process success'), 2)

WebUI.closeBrowser()

