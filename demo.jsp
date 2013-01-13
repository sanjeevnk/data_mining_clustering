<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 

<% session = request.getSession();  %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Clustering Management Console Login</title>

<body>
<form action="<%=request.getContextPath() + "/servlet/TextClusteringServlet"%>" method="POST">
<table>
  <tr>
        <td>User Id</td>
        <td><input type="text" name="username" value="dmuser"/></td>        
    </tr>
    <tr>
        <td>Password</td>
        <td><input type="password" name="password" value="dmuser"/></td>        
    </tr>
    <tr>
        <td>Application</td>
        <td><input type="text" name="application" value=
        "Excalibur Call Centre"/></td>        
    </tr>
    
    <tr>
        <td>Algorithm Used</td> 
         <td nowrap="nowrap"><select name="algorithm">
         <option value="kmeans">kmeans</option>
         <option value="bayesian">Bayesian</option>
         </select></td>
    </tr>
    <tr>
        <td><input type="submit" name="submit" value="Demo Text Clusters"></td>        
    </tr>
</table>


</form>
</body>
</html>


