<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Login</title>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="description" content="Sublime project">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" type="text/css" href="styles/bootstrap4/bootstrap.min.css">
        <link href="plugins/font-awesome-4.7.0/css/font-awesome.min.css" rel="stylesheet" type="text/css">
        <link rel="stylesheet" type="text/css" href="styles/checkout.css">
        <link rel="stylesheet" type="text/css" href="styles/checkout_responsive.css">
        <link href="styles/App.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>

        <div class="super_container">

            <!-- Header -->
<jsp:include page="header.jsp"></jsp:include>
            <!-- Menu -->

            <div class="menu menu_mm trans_300">
                <div class="menu_container menu_mm">
                    <div class="page_menu_content">

                        <div class="page_menu_search menu_mm">
                            <form action="#">
                                <input type="search" required="required" class="page_menu_search_input menu_mm" placeholder="Search for products...">
                            </form>
                        </div>
                        <ul class="page_menu_nav menu_mm">
                            <li class="page_menu_item has-children menu_mm">
                                <a href="index.html">Home<i class="fa fa-angle-down"></i></a>
                                <ul class="page_menu_selection menu_mm">
                                    <li class="page_menu_item menu_mm"><a href="categories.html">Categories<i class="fa fa-angle-down"></i></a></li>
                                    <li class="page_menu_item menu_mm"><a href="product.html">Product<i class="fa fa-angle-down"></i></a></li>
                                    <li class="page_menu_item menu_mm"><a href="cart.html">Cart<i class="fa fa-angle-down"></i></a></li>
                                    <li class="page_menu_item menu_mm"><a href="checkout.html">Checkout<i class="fa fa-angle-down"></i></a></li>
                                    <li class="page_menu_item menu_mm"><a href="contact.html">Contact<i class="fa fa-angle-down"></i></a></li>
                                </ul>
                            </li>
                            <li class="page_menu_item has-children menu_mm">
                                <a href="categories.html">Categories<i class="fa fa-angle-down"></i></a>
                                <ul class="page_menu_selection menu_mm">
                                    <li class="page_menu_item menu_mm"><a href="categories.html">Category<i class="fa fa-angle-down"></i></a></li>
                                    <li class="page_menu_item menu_mm"><a href="categories.html">Category<i class="fa fa-angle-down"></i></a></li>
                                    <li class="page_menu_item menu_mm"><a href="categories.html">Category<i class="fa fa-angle-down"></i></a></li>
                                    <li class="page_menu_item menu_mm"><a href="categories.html">Category<i class="fa fa-angle-down"></i></a></li>
                                </ul>
                            </li>
                            <li class="page_menu_item menu_mm"><a href="index.html">Accessories<i class="fa fa-angle-down"></i></a></li>
                            <li class="page_menu_item menu_mm"><a href="#">Offers<i class="fa fa-angle-down"></i></a></li>
                            <li class="page_menu_item menu_mm"><a href="contact.html">Contact<i class="fa fa-angle-down"></i></a></li>
                        </ul>
                    </div>
                </div>

                <div class="menu_close"><i class="fa fa-times" aria-hidden="true"></i></div>

                <div class="menu_social">
                    <ul>
                        <li><a href="#"><i class="fa fa-pinterest" aria-hidden="true"></i></a></li>
                        <li><a href="#"><i class="fa fa-instagram" aria-hidden="true"></i></a></li>
                        <li><a href="#"><i class="fa fa-facebook" aria-hidden="true"></i></a></li>
                        <li><a href="#"><i class="fa fa-twitter" aria-hidden="true"></i></a></li>
                    </ul>
                </div>
            </div>

            <!-- Home -->

            <div class="home">
                <div class="home_container">
                    <div class="home_background" style="background-image:url(Images/deco1.jpg)"></div>
                    <div class="home_content_container">
                        <div class="container">
                            <div class="row">
                                <div class="col">
                                    <div class="home_content">
                                        <div class="breadcrumbs">
                                            <ul>
                                                <li><a href="index.jsp">Home</a></li>
                                                <li>Login</li>
                                            </ul>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

            <!-- Registration -->

            <form action="ConnexionUtilisateur" name="login-form" id="login-form" class="checkout_form" >    
                <div class="checkout">
                    <div class="container">
                        <div class="row" >

                            <!-- Login Info -->
                            <div class="col-3"></div>
                            <div class="col-lg-6" >
                                <div class="billing checkout_section">
                                    <div class="section_title">Login Information
                                        <p class="message_error">${requestScope.errorLogin}</p>
                                    </div>                                    
                                    <div class="checkout_form_container">
                                        <div>
                                            <!-- Email -->
                                            <label>Email</label>
                                            <input type="email" name="email" class="checkout_input" required="required">
                                        </div>
                                        <div>
                                            <!-- Password -->
                                            <label>Password</label>
                                            <input type="password" name="password" class="checkout_input" required="required">
                                        </div>
                                        <div class="section_title">
                                        <div>                                            
                                            <div class=" order_button button register" onclick="document.forms['login-form'].submit();"><a href="#">Login</a></div>
                                        </div>
                                    </div>
                                        <div class="checkout_form_container section_title">
                                            <p><a href="registration.jsp">Not a member ? Register here...</a>  </p>                                      
                                        </div> 
                                    </div>
                                </div>
                            </div>  
                            <div class="col-3"></div>
                        </div>
                    </div>
                </div>

            </form> 
        </div>

        <script src="js/jquery-3.2.1.min.js"></script>
        <script src="styles/bootstrap4/popper.js"></script>
        <script src="styles/bootstrap4/bootstrap.min.js"></script>
        <script src="plugins/greensock/TweenMax.min.js"></script>
        <script src="plugins/greensock/TimelineMax.min.js"></script>
        <script src="plugins/scrollmagic/ScrollMagic.min.js"></script>
        <script src="plugins/greensock/animation.gsap.min.js"></script>
        <script src="plugins/greensock/ScrollToPlugin.min.js"></script>
        <script src="plugins/easing/easing.js"></script>
        <script src="plugins/parallax-js-master/parallax.min.js"></script>
        <script src="js/checkout.js"></script>
    </body>
</html>