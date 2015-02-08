<%@ page language="java" contentType="text/html;charset=UTF-8"%>
<%@taglib uri="http://beehive.apache.org/netui/tags-html-1.0" prefix="netui"%>
<%@taglib uri="http://beehive.apache.org/netui/tags-databinding-1.0" prefix="netui-data"%>
<%@taglib uri="http://beehive.apache.org/netui/tags-template-1.0" prefix="netui-template"%>
<netui-data:declarePageInput name="checkCreditRatingResult" type="java.lang.String" required="true"/>

<netui:html>
    <head>
        <netui:base/>
    </head>
    <netui:body>
    <h1>Loan Comparison</h1>
    	<img src="../../money.jpg" width="300" height="100"/> 
    <h3>This is your Credit Rating :</h3>
<netui:span value="${pageInput.checkCreditRatingResult}"></netui:span>>
</netui:body>
</netui:html>