<%--
  Created by IntelliJ IDEA.
  User: sonnh
  Date: 10/21/18
  Time: 8:30 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Sonnh</title>
    <style type="text/css">
      .import {
        height: 250px;
        width: 300px;
        margin: 0 auto;
        padding: 10px;
        border: 1px lightblue solid;
      }
      .import input {
        padding: 5px;
        margin: 5px;
      }
      h2 {
        text-align: center;
      }
    </style>
  </head>
  <body>
  <form method="post" action="/display-discount" >
    <div class="import">
      <h2>Sonnh</h2>
      <input type="text" name="productdescription" size="30px" placeholder="Product Description">
      <input type="text" name="listprice" size="30px" placeholder="List Description">
      <input type="text" name="discountpercent" size="30px" placeholder="Discount Percent">
      <input type="submit" value="Calculate Discount">
    </div>
  </form>
  </body>
</html>
