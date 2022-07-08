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
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint

WebUI.openBrowser('')

WebUI.navigateToUrl('http://192.168.6.18:501/')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/CasualLEAVE_Depak_LeaveRequest_Apply/Page_ERP/input_Login_LoginName'), '000850')

WebUI.setText(findTestObject('Object Repository/CasualLEAVE_Depak_LeaveRequest_Apply/Page_ERP/input_Login_Password'), 'A')

WebUI.setText(findTestObject('Object Repository/CasualLEAVE_Depak_LeaveRequest_Apply/Page_ERP/input__submit__input'), '14')

WebUI.click(findTestObject('Object Repository/CasualLEAVE_Depak_LeaveRequest_Apply/Page_ERP/button_Sign in'))

WebUI.mouseOver(findTestObject('CasualLEAVE_Depak_LeaveRequest_Apply/Page_iERP Suite/Page_iERP Suite/i_Policy And Procedure_menu-icon fa fa-thumbs-o-up'))

//WebUI.click(findTestObject('Object Repository/CasualLEAVE_Depak_LeaveRequest_Apply/Page_iERP Suite/a_Inbox'))
WebElement element = WebUiCommonHelper.findWebElement(findTestObject('Object Repository/CasualLEAVE_Gopi_LeaveRequest_Apply/Page_iERP Suite/span_Inbox'),
	30)

WebUI.executeJavaScript('arguments[0].click()', Arrays.asList(element))

//WebUI.click(findTestObject('Object Repository/CasualLEAVE_Depak_LeaveRequest_Apply/Page_iERP Suite/td_Leave request for Employee  000851  DIPA_3f7aa3'))
WebDriver driver = DriverFactory.getWebDriver()

for (int i = 1; i <= 10; i++) {
	List<List> row = driver.findElements(By.xpath(('(//table[@id=\'GrdInbox\']/tbody/tr/td[3])[\'' + i) + '\']'))

	for (WebElement e1 : row) {
		println(e1.getText())

		String abc = e1.getText()

		String[] ele = abc.split('\\s')

		String A = null

		String B = null

		for (String w : ele) {
			if (w.equals('DIPAK')) {
				A = w
			}
			
			if (w.equals('02-Jul-2022')) {
				B = w
			}
		}
		
		if (A.equals('DIPAK') || B.equals('02-Jul-2022')) {
			e1.click()

			break
		}
	}
}

WebUI.scrollToPosition(0, 100)

WebUI.setText(findTestObject('Object Repository/CasualLEAVE_Gopi_LeaveRequest_Apply/Page_iERP Suite/textarea__Remarks'),
	'NA')

WebUI.scrollToPosition(0, 700)

WebUI.click(findTestObject('Object Repository/CasualLEAVE_Depak_LeaveRequest_Apply/Page_iERP Suite/button_Choose Action'))

WebUI.scrollToPosition(0, 100)

//WebUI.click(findTestObject('submitbuttonapproval/Page_iERP Suite/input_Choose Action_Actionstyle'))

