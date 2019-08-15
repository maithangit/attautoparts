<%--
  Created by IntelliJ IDEA.
  User: alicanozer
  Date: 2019-08-14
  Time: 00:15
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="resources/common/header.jsp"></jsp:include>
<div class="container">

    <div id="productTitle"><h1>Your Cart</h1></div>

    <div class="row shopping-cart">

        <table class="table table-bordered table-striped">
            <thead>
            <tr>
                <th>Select</th>
                <th>Image</th>
                <th>Product Name</th>
                <th>Quantity</th>
                <th>Unit Price</th>
                <th>Total</th>
            </tr>
            </thead>
            <tbody id="tblMyCart">
            <c:forEach items="${cartItems}" var="item">
                <tr class="item" id="item_${item.item.productId}">
                    <td><input class="check" type="checkbox" value="${item.item.productId}"></td>
                    <td class="muted center_text"><a href="productdetails?id=${item.item.productId}"><img src="<c:url value="resources/images/${item.item.images[0].url}" />" class="img-thumbnail width100"></a></td>
                    <td>${item.item.productName}</td>
                    <td><input class="qty" type="number" placeholder="1" class="input-mini" value="${item.quantity}" min="1" id="quantity_${item.item.productId}"></td>
                    <td class="price format-money">${item.item.price}</td>
                    <td class="total format-money">${item.item.price * item.quantity}</td>
                </tr>
            </c:forEach>
            <tr>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
                <td>&nbsp;</td>
                <td><strong>Total</strong></td>
                <td><strong id="sum">$${totalPrice}</strong></td>
            </tr>
            </tbody>
        </table>
    </div>
    <div class="row shopping-cart">
        <div class="col-sm-12 text-right">
            <button type="button" class="btn btn-sml btn-danger" id="btnRemove" value="remove">
                <span class="fa fa-check-circle"></span> Remove
            </button>
            <button type="button" class="btn btn-sml btn-outline-primary" id="btnUpdate" value="update">
                <span class="fa fa-check-circle"></span> Update
            </button>
            <button type="button" class="btn btn-sml btn-info" id="btnContinueShopping">
                <span class="fa fa-forward"></span> Continue shopping
            </button>
            <button type="button" class="btn btn-sml btn-primary" id="btnCheckout">
                <span class="fa fa-calendar"></span> Checkout
            </button>
        </div>
    </div>
</div>
<jsp:include page="resources/common/footer.jsp"></jsp:include>