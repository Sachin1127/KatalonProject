import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')

WebUI.navigateToUrl('http://192.168.6.18:501/')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/HALF_PAY_LEAVE_Gopi_Approval/Page_ERP/input_Login_LoginName'), '000850')

WebUI.setEncryptedText(findTestObject('Object Repository/HALF_PAY_LEAVE_Gopi_Approval/Page_ERP/input_Login_Password'), 'ZyJNmQzJyQg=')

WebUI.setText(findTestObject('Object Repository/HALF_PAY_LEAVE_Gopi_Approval/Page_ERP/input__submit__input'), '7')

WebUI.click(findTestObject('Object Repository/HALF_PAY_LEAVE_Gopi_Approval/Page_ERP/button_Sign in'))

WebUI.mouseOver(findTestObject('Object Repository/HALF_PAY_LEAVE_Gopi_Approval/Page_iERP Suite/a_Approval Inbox'))

//WebUI.click(findTestObject('Object Repository/HALF_PAY_LEAVE_Gopi_Approval/Page_iERP Suite/a_Inbox'))
WebElement element = WebUiCommonHelper.findWebElement(findTestObject('Object Repository/CasualLEAVE_Gopi_LeaveRequest_Apply/Page_iERP Suite/span_Inbox'), 
    30)

WebUI.executeJavaScript('arguments[0].click()', Arrays.asList(element))

WebUI.click(findTestObject('Object Repository/HALF_PAY_LEAVE_Gopi_Approval/Page_iERP Suite/td_Leave request for Employee  000851  DIPA_914c88'))

WebUI.scrollToPosition(0, 100)

WebUI.setText(findTestObject('Object Repository/HALF_PAY_LEAVE_Gopi_Approval/Page_iERP Suite/textarea__Remarks'), 'NA')

WebUI.scrollToPosition(0, 100)

WebUI.click(findTestObject('Object Repository/HALF_PAY_LEAVE_Gopi_Approval/Page_iERP Suite/button_Choose Action'))

