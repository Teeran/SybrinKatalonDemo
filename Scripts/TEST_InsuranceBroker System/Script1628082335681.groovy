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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://demo.guru99.com/insurance/v1/index.php')

WebUI.setText(findTestObject('Object Repository/Insurance/Page_Insurance Broker System - Login/input_Email_email'), 'arvind.moosanah@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Insurance/Page_Insurance Broker System - Login/input_Password_password'), 
    'CTQcpoW5Jj8FF1nxKxqeow==')

WebUI.click(findTestObject('Object Repository/Insurance/Page_Insurance Broker System - Login/input_Password_submit'))

WebUI.click(findTestObject('Object Repository/Insurance/Page_Insurance Broker System/a_Request Quotation'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Insurance/Page_Insurance Broker System/select_No coverRoadsideAt homeEuropean'), 
    '3', true)

WebUI.setText(findTestObject('Object Repository/Insurance/Page_Insurance Broker System/input_incidents_incidents'), Incident)

WebUI.setText(findTestObject('Object Repository/Insurance/Page_Insurance Broker System/input_Registration_registration'), 
    Registration)

WebUI.setText(findTestObject('Object Repository/Insurance/Page_Insurance Broker System/input_Annual mileage_mileage'), '5000')

WebUI.setText(findTestObject('Object Repository/Insurance/Page_Insurance Broker System/input_Estimated value_value'), '120 000')

WebUI.selectOptionByValue(findTestObject('Object Repository/Insurance/Page_Insurance Broker System/select_SelectDrivewayCarportLocked GaragePu_7dae45'), 
    'Garage', true)

WebUI.click(findTestObject('Object Repository/Insurance/Page_Insurance Broker System/input_Start of policy_submit'))

WebUI.click(findTestObject('Object Repository/Insurance/Page_/b_Your identification number is'))

WebUI.closeBrowser()

