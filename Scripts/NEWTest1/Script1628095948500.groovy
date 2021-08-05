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

WebUI.navigateToUrl('http://automationpractice.com/index.php?controller=authentication&back=my-account')

WebUI.setText(findTestObject('YourLogo/LoginPage/txtUsername'), 'arvind.moosanah@gmail.com')

WebUI.setEncryptedText(findTestObject('YourLogo/LoginPage/txtPasswd'), 'CTQcpoW5Jj8FF1nxKxqeow==')

WebUI.click(findTestObject('YourLogo/LoginPage/btnSignIn'))

WebUI.click(findTestObject('YourLogo/Page_My account - My Store/lnkT-shirts'))

WebUI.click(findTestObject('YourLogo/Page_TShirt/btnAddToCart'))

WebUI.click(findTestObject('YourLogo/Page_TShirt/btnPopUpCheckout'))

WebUI.click(findTestObject('YourLogo/Page_Order - My Store/btnSummaryCheckout (1)'))

WebUI.click(findTestObject('YourLogo/Page_Order - My Store/btnNewAddress'))

WebUI.setText(findTestObject('YourLogo/Page_Address - Details/txtAddress'), 'Road')

WebUI.setText(findTestObject('YourLogo/Page_Address - Details/txtCity'), 'JHB')

WebUI.selectOptionByValue(findTestObject('YourLogo/Page_Address - Details/drpState'), 
    '11', true)

WebUI.setText(findTestObject('YourLogo/Page_Address - Details/txtPostcode'), '09223')

WebUI.setText(findTestObject('YourLogo/Page_Address - Details/txtPhone'), '089822344')

WebUI.setText(findTestObject('YourLogo/Page_Address - Details/txtTArea'), 
    'TEST')

WebUI.setText(findTestObject('YourLogo/Page_Address - Details/txtTitle'), 'Address 2')

WebUI.click(findTestObject('YourLogo/Page_Address - Details/btnSave'))

WebUI.click(findTestObject('YourLogo/Page_Order - My Store/btnSummaryCheckout (1)'))

WebUI.click(findTestObject('YourLogo/Page_Order - My Store/chkTnC (1)'))

WebUI.click(findTestObject('YourLogo/Page_Order - My Store/btnAddressCheckout (1)'))

WebUI.click(findTestObject('YourLogo/Page_Order - My Store/btnPBWire'))

WebUI.click(findTestObject('YourLogo/Page_My Store/btnCnfmOrder'))

WebUI.click(findTestObject('null'))

WebUI.closeBrowser()

