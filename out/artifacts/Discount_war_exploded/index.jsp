<%--
  Created by IntelliJ IDEA.
  User: Do Trang Hoang PC
  Date: 18/09/2019
  Time: 15:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<style type="text/css">
    .login {
        height: 320px;
        width: 230px;
        margin: 0;
        padding: 10px;
        border: 5px #CCCCCC solid;
    }

    .login input {
        padding: 5px;
        margin: 5px
    }
</style>
<head>
    <title>Product Discount Calculator</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
<center>
<form method="get" action="/result">

    <div class="login">
        <h2>Product Discount Calculator</h2>
            <label>Product Description: <input type="text" name="product"/></label><br/>
            <label>List Price : <input type="number" name="price"/></label><br/>
            <label>Discount Percent : <input type="number" name="discount"/></label><br/>
            <label><input type="submit" value="Calculator"/></label><br/>

          <div/>
</form>
</center>
</body>
</html>
