import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('http://192.168.6.18:501/')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Monthly_Attendance_Details_Apply/Page_ERP/input_Click Here For Advocate Login_LoginName'), 
    '000851')

WebUI.setEncryptedText(findTestObject('Object Repository/Monthly_Attendance_Details_Apply/Page_ERP/input_Click Here For Advocate Login_Password'), 
    'ZyJNmQzJyQg=')

WebUI.setText(findTestObject('Object Repository/Monthly_Attendance_Details_Apply/Page_ERP/input__submit__input'), '13')

WebUI.click(findTestObject('Object Repository/Monthly_Attendance_Details_Apply/Page_ERP/button_Sign in'))

WebUI.mouseOver(findTestObject('Object Repository/Monthly_Attendance_Details_Apply/Page_iERP Suite/a_Payroll'))

//WebUI.click(findTestObject('Object Repository/Monthly_Attendance_Details_Apply/Page_iERP Suite/a_Monthly Attendance'))
WebElement element = WebUiCommonHelper.findWebElement(findTestObject('Object Repository/Monthly_Attendance_Details_Apply/Page_iERP Suite/a_Monthly Attendance'), 
    30)

WebUI.executeJavaScript('arguments[0].click()', Arrays.asList(element))

WebUI.scrollToPosition(0, 100)

WebUI.click(findTestObject('Object Repository/Monthly_Attendance_Details_Apply/Page_iERP Suite/input_Monthly Attendance Details_btnCreate'))

WebUI.scrollToElement(findTestObject('Monthly_Attendance_Details_Apply/Page_iERP Suite/Page_iERP Suite/button_Choose Action'), 
    1)

WebUI.click(findTestObject('Monthly_Attendance_Details_Apply/Page_iERP Suite/Page_iERP Suite/button_Choose Action'))

