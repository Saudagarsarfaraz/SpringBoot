<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <h2>Product Catalog</h2>  
    <form action="saveProduct" method="post">
        <table> 
            <tr>
               <td>Product Id : </td>
               <td><input type="text" name="pId"></td>
            </tr>        
            <tr>
               <td>Product Name : </td>
               <td><input type="text" name="pName"></td>
            </tr>
            <tr>
               <td>Product Price :</td>
               <td><input type="text" name="pPrice"></td>
            </tr>
            <tr>
                <td><input type="reset" value="Reset"></td> 
               <td><input type="submit" value="save"></td> 
               
            </tr>    
        
        </table> 
    </form> 
</body>
</html>