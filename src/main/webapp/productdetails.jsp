<%--Thang Mai--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="resources/common/header.jsp"></jsp:include>

<div class="container">

    <div id="productTitle"><h1>${product.productName}</h1></div>

    <div class="row shopping-cart">
        <div class="col-lg-2 col-md-4 col-xs-6 item">
            <img src="<c:url value="resources/images/${product.images[0].url}" />" class="product-image" />
        </div>
        <div class="col-lg-10 col-md-4 col-xs-6 item">
            <h5>$${product.price}</h5>
            <div>
                ${product.detailInformation}
            </div>
            <div class="text-left">
                <a href="shopping-cart?id=${product.productId}" class="btn btn-primary btn-sml active addToCart" role="button" aria-pressed="true">Add to cart</a>
            </div>
        </div>

    </div>
</div>

<jsp:include page="resources/common/footer.jsp"></jsp:include>