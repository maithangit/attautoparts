<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>ATT AutoParts Store</title>

    <!-- Bootstrap core CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.1.0/css/all.css" integrity="sha384-lKuwvrZot6UHsBSfcMvOkWwlCMgc0TaWr+30HWe3a4ltaBwTZhyTEggF5tJv8tbt" crossorigin="anonymous">
    <!-- Custom styles for this template -->
    <link href="<c:url value="/resources/css/style.css" />" rel="stylesheet">
    <link href="<c:url value="/resources/css/toastr.css" />" rel="stylesheet">
    <link rel="icon" type="image/png" href="resources/images/icon.png" sizes="16x16">

</head>

<body>

<!-- Navigation -->
<nav class="navbar navbar-expand-lg navbar-light bg-light border-bottom fixed-top shadow-sm p-3 mb-5">
    <div class="container">
        <a href="home" class="logo">ATT Auto Parts</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarResponsive">
            <ul class="navbar-nav ml-auto">
                <li class="nav-item active">
                    <a class="nav-link" href="home">Home     </a>
                </li>
                <li class="nav-item active">
                    <a class="nav-link" href="product">Product</a>
                </li>
                <li class="nav-item active">
                    <!--<a href="shopping-cart" class="list-group-item d-flex justify-content-between align-items-center">-->
                    <a class="nav-link" href="shopping-cart" >
                        <span>
                        <i class="fa fa-shopping-cart" id="icon-basket"></i>
                        <span id="num-of-items" class="badge badge-primary badge-pill">${numItems}</span>
                    </span>
                    </a>
                </li>
                <c:if test="${user_info == null}">
                    <li class="nav-item active">
                        <a class="nav-link" href="login">Login</a>
                    </li>
                    <li class="nav-item active">
                        <a class="nav-link" href="register">Register</a>
                    </li>
                </c:if>
                <c:if test="${user_info != null}">
                    <li class="nav-item active">
                        <a class="nav-link" href="profile">${user_info}</a>
                    </li>
                    <li class="nav-item active">
                        <a class="nav-link" href="logout">Logout</a>
                    </li>
                </c:if>
            </ul>
        </div>
    </div>
</nav>
