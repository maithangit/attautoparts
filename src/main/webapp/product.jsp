<!--Thang Mai-->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="resources/common/header.jsp"></jsp:include>

<div id="productTitle"><h1>New Products</h1></div>
<div class="container">
<div class="row">
    <c:forEach items="${newProducts}" var="product">
        <div class="col-lg-3 col-md-4 col-xs-6 item">
            <div class="card h-100">
                <a href="productdetails?id=${product.productId}"><img class="card-img-top" src="<c:url value="resources/images/${product.images[0].url}" />" alt=${product.briefInformation}></a>
                <div class="card-body">
                    <h4 class="card-title">
                        <a href="productdetails?id=${product.productId}"><span id="item_${product.productId}">${product.productName}</span></a>
                    </h4>
                    <h5>$${product.price}</h5>
                    <p class="card-text">${product.briefInformation}</p>
                </div>
                <div class="card-footer text-center">
                    <a href="shopping-cart?id=${product.productId}" class="btn btn-primary btn-sml active addToCart" role="button" aria-pressed="true">Add to cart</a>
                </div>
            </div>
        </div>
    </c:forEach>
</div>
</div>

<div id="productTitle"><h1>Best Seller Products</h1></div>
<div class="container">
<div class="row">
    <c:forEach items="${bestSeller}" var="product">
        <div class="col-lg-3 col-md-4 col-xs-6 item">
            <div class="card h-100">
                <a href="productdetails?id=${product.productId}"><img class="card-img-top" src="<c:url value="resources/images/${product.images[0].url}" />" alt=${product.briefInformation}></a>
                <div class="card-body">
                    <h4 class="card-title">
                        <a href="productdetails?id=${product.productId}"><span id="item_${product.productId}">${product.productName}</span></a>
                    </h4>
                    <h5>$${product.price}</h5>
                    <p class="card-text">${product.briefInformation}</p>
                </div>
                <div class="card-footer text-center">
                    <a href="shopping-cart?id=${product.productId}" class="btn btn-primary btn-sml active addToCart" role="button" aria-pressed="true">Add to cart</a>
                </div>
            </div>
        </div>
    </c:forEach>
</div>
</div>

<jsp:include page="resources/common/footer.jsp"></jsp:include>