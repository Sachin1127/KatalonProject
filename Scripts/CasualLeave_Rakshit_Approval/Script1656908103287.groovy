import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.common.WebUiCommonHelper as WebUiCommonHelper
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')

WebUI.navigateToUrl('http://192.168.6.18:501/')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/CasualLEAVE_Rakshit_LeaveRequest_Apply/Page_ERP/input_Login_LoginName'), username)

WebUI.setText(findTestObject('Object Repository/CasualLEAVE_Rakshit_LeaveRequest_Apply/Page_ERP/input_Login_Password'), password)

WebUI.setText(findTestObject('Object Repository/CasualLEAVE_Rakshit_LeaveRequest_Apply/Page_ERP/input__submit__input'), '8')

WebUI.click(findTestObject('Object Repository/CasualLEAVE_Rakshit_LeaveRequest_Apply/Page_ERP/button_Sign in'))

WebUI.mouseOver(findTestObject('Object Repository/CasualLEAVE_Rakshit_LeaveRequest_Apply/Page_iERP Suite/i_Policy And Procedure_menu-icon fa fa-thumbs-o-up'))

WebElement element = WebUiCommonHelper.findWebElement(findTestObject('Object Repository/CasualLEAVE_Gopi_LeaveRequest_Apply/Page_iERP Suite/span_Inbox'), 30)

WebUI.executeJavaScript('arguments[0].click()', Arrays.asList(element))

//WebUI.click(findTestObject('Object Repository/CasualLEAVE_Rakshit_LeaveRequest_Apply/Page_iERP Suite/a_Inbox'))
WebUI.click(findTestObject('Object Repository/CasualLEAVE_Rakshit_LeaveRequest_Apply/Page_iERP Suite/td_Leave request for Employee  000851  DIPA_3f7aa3'))

WebUI.setText(findTestObject('Object Repository/CasualLEAVE_Rakshit_LeaveRequest_Apply/Page_iERP Suite/textarea__Remarks'), 'Sick Leave')

WebUI.scrollToPosition(0, 95)

WebUI.click(findTestObject('Object Repository/CasualLEAVE_Rakshit_LeaveRequest_Apply/Page_iERP Suite/button_Choose Action'))

