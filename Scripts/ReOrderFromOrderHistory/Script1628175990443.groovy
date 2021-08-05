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

//Opening Browser
WebUI.openBrowser(GlobalVariable.url)

// Capture UserName
WebUI.setText(findTestObject('YourLogo/LoginPage/txtUsername'), GlobalVariable.strUsername)

//capturing Password
WebUI.setText(findTestObject('YourLogo/LoginPage/txtPasswd'), GlobalVariable.strPasswrd)

//clicking on SignIn Button
WebUI.click(findTestObject('YourLogo/LoginPage/btnSignIn'))

//Accessing on the Order History Detail 
WebUI.click(findTestObject('YourLogo/Page_My account - My Store/btnOrderHstrynDtls'))

//Need to try use search later, to look for the ref.
WebUI.click(findTestObject('YourLogo/Page_Order history - My Store/span_Reorder_footable-toggle'))

WebUI.click(findTestObject('YourLogo/Page_Order history - My Store/btnReOrder'))

WebUI.click(findTestObject('YourLogo/Page_Order - My Store/btnSummaryCheckout'))

//Comment regarding Order
WebUI.setText(findTestObject('YourLogo/Page_Order - My Store/txtfreetext'), Comment)

WebUI.click(findTestObject('YourLogo/Page_Order - My Store/btnAddressCheckout'))

WebUI.click(findTestObject('YourLogo/Page_Order - My Store/chkTnC'))

WebUI.click(findTestObject('YourLogo/Page_Order - My Store/btnAddressCheckout'))

WebUI.click(findTestObject('YourLogo/Page_Order - My Store/btnPBCheck'))

WebUI.click(findTestObject('YourLogo/Page_Order confirmation - My Store/btnShippingCheckout'))

WebUI.closeBrowser()

