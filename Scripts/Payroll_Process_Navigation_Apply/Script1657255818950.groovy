import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.openqa.selenium.WebElement

import com.kms.katalon.core.webui.common.WebUiCommonHelper
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')

WebUI.navigateToUrl('http://192.168.6.18:501/')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Payroll_Process_Navigation_Apply/Page_ERP/input_Click Here For Advocate Login_LoginName'), 
    '000851')

WebUI.setEncryptedText(findTestObject('Object Repository/Payroll_Process_Navigation_Apply/Page_ERP/input_Click Here For Advocate Login_Password'), 
    'ZyJNmQzJyQg=')

WebUI.setText(findTestObject('Object Repository/Payroll_Process_Navigation_Apply/Page_ERP/input__submit__input'), '8')

WebUI.click(findTestObject('Object Repository/Payroll_Process_Navigation_Apply/Page_ERP/button_Sign in'))

WebUI.mouseOver(findTestObject('Object Repository/Payroll_Process_Navigation_Apply/Page_iERP Suite/a_Payroll'))

//WebUI.click(findTestObject('Object Repository/Payroll_Process_Navigation_Apply/Page_iERP Suite/a_Payroll Process'))
WebElement element = WebUiCommonHelper.findWebElement(findTestObject('Object Repository/Payroll_Process_Navigation_Apply/Page_iERP Suite/a_Payroll Process'),
	30)

WebUI.executeJavaScript('arguments[0].click()', Arrays.asList(element))

WebUI.click(findTestObject('Object Repository/Payroll_Process_Navigation_Apply/Page_iERP Suite/input_Payroll Process Details_btnCreate'))

WebUI.click(findTestObject('Object Repository/Payroll_Process_Navigation_Apply/Page_iERP Suite/input_Next_btnLoad'))

