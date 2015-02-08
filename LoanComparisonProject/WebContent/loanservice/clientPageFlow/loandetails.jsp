<%@ page language="java" contentType="text/html;charset=UTF-8"%>
<%@taglib uri="http://beehive.apache.org/netui/tags-html-1.0" prefix="netui"%>
<%@taglib uri="http://beehive.apache.org/netui/tags-databinding-1.0" prefix="netui-data"%>
<%@taglib uri="http://beehive.apache.org/netui/tags-template-1.0" prefix="netui-template"%>
<netui-data:declarePageInput name="requestLoanResult" type="loanservice.Loan[]" required="true"/>

<netui:html>
    <head>
        <netui:base/>
    </head>
    <netui:body>
    <h1>Loan Comparison</h1>
    	<img src="../../money.jpg" width="300" height="100"/>
    	<h3>This is the best loans quotes....Click on any quote to go direrct to the lender web site</h3>
	<netui-data:repeater dataSource="pageInput.requestLoanResult">
		<div>PageInput.requestLoanResult:&nbsp; <netui:span value="${container.item}" defaultValue="&nbsp;" /></div>
		<p />
	</netui-data:repeater>
</netui:body>
</netui:html>