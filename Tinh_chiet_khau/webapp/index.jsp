<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <title>Product Discount Calculator</title>

</head>
<body>
<div class="product-discount">
    <h1>Tính chiết khấu</h1>
    <form method="post" action="/discount">
        <input type="text" size="30" name="price" placeholder="price"/>
        <input type="text" size="30" name="discount" placeholder="discount"/>
        <input type="submit" name="calculate" value="Calculate Discount"/>
    </form>
</div>
</body>
</html>
