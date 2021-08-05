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

//+++++++++++++++++++Accessing the Your Logo+++++++++++++++++++++
//Opening Browser
WebUI.openBrowser(GlobalVariable.url)

//WebUI.maximizeWindow()
//navigating to url
//WebUI.navigateToUrl('http://automationpractice.com/index.php?controller=authentication&back=my-account')
//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
//++++++++++++++++++++Login Functio++++++++++++++++++++++++++++++
// Capture UserName
WebUI.setText(findTestObject('YourLogo/LoginPage/txtUsername'), GlobalVariable.strUsername)

//capturing Password
WebUI.setText(findTestObject('YourLogo/LoginPage/txtPasswd'), GlobalVariable.strPasswrd)

//clicking on SignIn Button
WebUI.click(findTestObject('YourLogo/LoginPage/btnSignIn'))

//++++++++++++++++++++++++++++++++++++++++++++++++++
WebUI.click(findTestObject('YourLogo/Page_My account - My Store/lnkT-shirts'))

WebUI.click(findTestObject('YourLogo/Page_TShirt/btnAddToCart'))

WebUI.click(findTestObject('YourLogo/Page_TShirt/btnPopUpCheckout'))

WebUI.click(findTestObject('YourLogo/Page_Order - My Store/btnSummaryCheckout (1)'))

//Add new address Button
WebUI.click(findTestObject('YourLogo/Page_Order - My Store/btnNewAddress'))

//Add Address Details
WebUI.setText(findTestObject('YourLogo/Page_Address - Details/txtAddress'), Address)

WebUI.setText(findTestObject('YourLogo/Page_Address - Details/txtCity'), City)

WebUI.selectOptionByValue(findTestObject('YourLogo/Page_Address - Details/drpState'), State, true)

WebUI.setText(findTestObject('YourLogo/Page_Address - Details/txtPostcode'), Postcode)

WebUI.setText(findTestObject('YourLogo/Page_Address - Details/txtPhone'), Phone)

WebUI.setText(findTestObject('YourLogo/Page_Address - Details/txtTitle'), AddressRef)
WebUI.click(findTestObject('YourLogo/Page_Address - Details/btnSave'))

WebUI.selectOptionByLabel(findTestObject('Object Repository/YourLogo/Page_Address - Details/drpDlryAddrs'), AddressRef, true)


//Proceed to check out
WebUI.click(findTestObject('YourLogo/Page_Order - My Store/btnAddressCheckout (1)'))

//+++++++++++++++++++++SHIPPING PAGE++++++++++++++++++++++++++++++++++++++++++++++++++++++++
WebUI.click(findTestObject('YourLogo/Page_Order - My Store/chkTnC (1)'))

WebUI.click(findTestObject('YourLogo/Page_Order - My Store/btnAddressCheckout (1)'))

//++++++++++++++++++PAYMENT-SCREEN+++++++++++++++++++++++++++++++++++++++++++++++++++++++
WebUI.click(findTestObject('YourLogo/Page_Order - My Store/btnPBWire'))

WebUI.click(findTestObject('YourLogo/Page_My Store/btnCnfmOrder'))

WebUI.click(findTestObject('null'))
WebUI.closeBrowser()

