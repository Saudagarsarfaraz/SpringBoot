<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="from" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
     <from:form action="saveForm" modelAttribute="product" method="post">
     <table>
         <tr>
             <td>Product Id</td>
             <td><from:input path="productId"/></td>
         </tr>
         <tr>
             <td>Product Name</td>
             <td><from:input path="productName"/></td>
         </tr>
         <tr>
             <td>Product Price</td>
             <td><from:input path="productPrice"/></td>
         </tr>
         <tr>
            <td><input type="submit" value="Save" /></td>
         </tr>
     
     
     
     </table>  
     </from:form> 

</body>
</html>