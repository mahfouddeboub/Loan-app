<%@ page language="java" contentType="text/html;charset=UTF-8"%>
<%@taglib uri="http://beehive.apache.org/netui/tags-html-1.0" prefix="netui"%>
<%@taglib uri="http://beehive.apache.org/netui/tags-databinding-1.0" prefix="netui-data"%>
<%@taglib uri="http://beehive.apache.org/netui/tags-template-1.0" prefix="netui-template"%>
<netui:html>
    <head>
        <netui:base/>
    </head>
    <netui:body>
    
    <h1>Loan Comparison</h1>
    	<img src="../../money.jpg" width="300" height="100"/> 
    
   <p>Get the best quotes loans in few clicks!!!!!</p> 
	<netui:form action="requestLoan">
		<div>
		<table>
			<tr valign="top">
				<td><netui:label for="actionForm_minLoan_arg" value=" How much are you looking to borrow? " /></td>
				<td><netui:textBox dataSource="actionForm.minLoan_arg" tagId="actionForm_minLoan_arg"></netui:textBox></td>
			</tr>
			<tr valign="top">
				<td><netui:label for="actionForm_period_arg" value="Period of Loan:" /></td>
				<td><netui:textBox dataSource="actionForm.period_arg" tagId="actionForm_period_arg"></netui:textBox></td>
			</tr>
		</table>
		</div>
		<netui:button value="requestLoan" type="submit" />
	</netui:form>
    	<hr align="center" size="1" style="" width="1"/>
    	<p> Check your Credit Rating?</p>	
	<netui:form action="checkCreditRating">
		<div>
		<table>
			<tr valign="top">
				<td><netui:label for="actionForm_emp_arg" value="Tick the box if employed:" /></td>
				<td><netui:checkBox dataSource="actionForm.emp_arg" tagId="actionForm_emp_arg"></netui:checkBox></td>
			</tr>
			<tr valign="top">
				<td><netui:label for="actionForm_ni_arg" value="National Insurance Num:" /></td>
				<td><netui:textBox dataSource="actionForm.ni_arg" tagId="actionForm_ni_arg"></netui:textBox></td>
			</tr>
			<tr valign="top">
				<td><netui:label for="actionForm_salary_arg" value="Salary:" /></td>
				<td><netui:textBox dataSource="actionForm.salary_arg" tagId="actionForm_salary_arg"></netui:textBox></td>
			</tr>
		</table>
		</div>
		<netui:button value="checkCreditRating" type="submit" />
	</netui:form>
</netui:body>
</netui:html>