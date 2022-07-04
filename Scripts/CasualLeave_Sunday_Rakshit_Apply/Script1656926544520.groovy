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

WebUI.navigateToUrl('http://192.168.6.18:501/')

WebUI.setText(findTestObject('Object Repository/CasualLeave_Sunday_Rakshit_Apply/Page_ERP/input_Login_LoginName'), '000851')

WebUI.setEncryptedText(findTestObject('Object Repository/CasualLeave_Sunday_Rakshit_Apply/Page_ERP/input_Login_Password'), 
    'ZyJNmQzJyQg=')

WebUI.setText(findTestObject('Object Repository/CasualLeave_Sunday_Rakshit_Apply/Page_ERP/input__submit__input'), '10')

WebUI.click(findTestObject('Object Repository/CasualLeave_Sunday_Rakshit_Apply/Page_ERP/button_Sign in'))

WebUI.click(findTestObject('Object Repository/CasualLeave_Sunday_Rakshit_Apply/Page_iERP Suite/a_Employee Self Service'))

WebUI.click(findTestObject('Object Repository/CasualLeave_Sunday_Rakshit_Apply/Page_iERP Suite/a_Leave Request'))

WebUI.click(findTestObject('Object Repository/CasualLeave_Sunday_Rakshit_Apply/Page_iERP Suite/input_Leave Request Details_New Leave Request'))

WebUI.click(findTestObject('Object Repository/CasualLeave_Sunday_Rakshit_Apply/Page_iERP Suite/span_000851  DIPAK  DEBNATH'))

WebUI.click(findTestObject('Object Repository/CasualLeave_Sunday_Rakshit_Apply/Page_iERP Suite/li_000852  Druba  Rakshit'))

WebUI.click(findTestObject('Object Repository/CasualLeave_Sunday_Rakshit_Apply/Page_iERP Suite/a_-Select-'))

WebUI.click(findTestObject('Object Repository/CasualLeave_Sunday_Rakshit_Apply/Page_iERP Suite/li_LEAVE REQUEST'))

WebUI.click(findTestObject('Object Repository/CasualLeave_Sunday_Rakshit_Apply/Page_iERP Suite/span_-Select-'))

WebUI.click(findTestObject('Object Repository/CasualLeave_Sunday_Rakshit_Apply/Page_iERP Suite/li_CASUAL LEAVE'))

WebUI.click(findTestObject('Object Repository/CasualLeave_Sunday_Rakshit_Apply/Page_iERP Suite/input__LeaveStartDate'))

WebUI.click(findTestObject('Object Repository/CasualLeave_Sunday_Rakshit_Apply/Page_iERP Suite/a_Next'))

WebUI.click(findTestObject('Object Repository/CasualLeave_Sunday_Rakshit_Apply/Page_iERP Suite/a_Next'))

WebUI.click(findTestObject('Object Repository/CasualLeave_Sunday_Rakshit_Apply/Page_iERP Suite/a_25'))

WebUI.click(findTestObject('Object Repository/CasualLeave_Sunday_Rakshit_Apply/Page_iERP Suite/input__LeaveEndDate'))

WebUI.click(findTestObject('Object Repository/CasualLeave_Sunday_Rakshit_Apply/Page_iERP Suite/a_25'))

WebUI.setText(findTestObject('Object Repository/CasualLeave_Sunday_Rakshit_Apply/Page_iERP Suite/textarea__LeaveReason'), 
    'Sick Leave')

WebUI.click(findTestObject('Object Repository/CasualLeave_Sunday_Rakshit_Apply/Page_iERP Suite/button_Choose Action'))

