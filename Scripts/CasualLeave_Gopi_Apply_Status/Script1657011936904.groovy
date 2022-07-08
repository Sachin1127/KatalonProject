import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')

WebUI.navigateToUrl('http://192.168.6.18:501/')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/CasualLeave_Gopi_Apply_Status1/Page_ERP/input_Login_LoginName'), username)

WebUI.setText(findTestObject('Object Repository/CasualLeave_Gopi_Apply_Status1/Page_ERP/input_Login_Password'), password)

WebUI.setText(findTestObject('Object Repository/CasualLeave_Gopi_Apply_Status1/Page_ERP/input__submit__input'), '15')

WebUI.click(findTestObject('Object Repository/CasualLeave_Gopi_Apply_Status1/Page_ERP/button_Sign in'))

WebUI.mouseOver(findTestObject('Object Repository/CasualLeave_Gopi_Apply_Status1/Page_iERP Suite/a_Payroll'))

WebElement element = WebUiCommonHelper.findWebElement(findTestObject('Object Repository/CasualLEAVE_Gopi_LeaveRequest_Apply/Page_iERP Suite/span_Inbox'), 
    30)

WebUI.executeJavaScript('arguments[0].click()', Arrays.asList(element))

//WebUI.click(findTestObject('Object Repository/CasualLeave_Gopi_Apply_Status1/Page_iERP Suite/a_Monthly Attendance'))
WebUI.click(findTestObject('Object Repository/CasualLeave_Gopi_Apply_Status1/Page_iERP Suite/input_July 2022_btnLoad'))

WebUI.scrollToPosition(0, 100)

WebUI.click(findTestObject('Object Repository/CasualLeave_Gopi_Apply_Status1/Page_iERP Suite/span_Approved'))

