<%--Thang Mai--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="resources/common/header.jsp"></jsp:include>

<div class="container">

    <div id="productTitle"><h1>Product information</h1></div>

    <div class="row shopping-cart">
        <table class="table table-bordered table-striped">
            <thead>
            <tr>
                <th>Product Name</th>
                <th>Images</th>
                <th>Detail Information</th>
                <th>Price</th>
            </tr>
            </thead>
            <tbody id="tblproductdetails">
            <tr class="item">
                <td>${product.productName}</td>
                <td><img src="<c:url value="resources/images/${product.images[0].url}" />" class="product-image"></td>
                <td>${product.detailInformation}
                    <div class="card-footer text-center">
                        <a href="shopping-cart?id=${product.productId}" class="btn btn-primary btn-sml active addToCart" role="button" aria-pressed="true">Add to cart</a>
                    </div>
                </td>
                <td>${product.price}</td>
            </tr>

            </tbody>
        </table>

    </div>
</div>

<jsp:include page="resources/common/footer.jsp"></jsp:include>