<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Registration</title>
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
<!--                            <form action="#">
                                <input type="search" required="required" class="page_menu_search_input menu_mm" placeholder="Search for products...">
                            </form>-->
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
                                                <li>Register</li>
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

            <form action="NouveauUtilisateur" name="registration_form" id="registration_form" class="checkout_form">    
                <div class="checkout">
                    <div class="container">
                        <div class="row">

            <!--Billing Info -->
                            <div class="col-lg-6">
                                <div class="billing checkout_section">
                                    <div class="section_title">Register Information</div>
                                    <p class="message_error">${requestScope.errorRegistration}</p>
                                    <div class="section_subtitle">Enter your register info</div>
                                    <div class="checkout_form_container">
                                        <div class="col-xl-6 title_left">
                                                 Title 
                                                <label>Title</label>
                                                <select name="title" id="checkout_country" class="dropdown_item_select checkout_input">
                                                    <option></option>
                                                    <option>Mme</option>
                                                    <option>Miss</option>
                                                    <option>Mr.</option>
                                                </select>
                                        </div>
                                                                                    
                                            <div >
                                                 Name 
                                                <label>First Name*</label>
                                                <input type="text" name="name" class="checkout_input" required="required">
                                            </div>
                                            <div >
                                                 Last Name 
                                                <label>Last Name*</label>
                                                <input type="text" name="last_name" class="checkout_input" required="required">
                                            </div>
                                        								
                                        <div>
                                             Country 
                                            <label>Country*</label>
                                            <select name="country" id="checkout_country" class="dropdown_item_select checkout_input">
                                                <option></option>
                                                <option>Canada</option>										
                                            </select>
                                        </div>
                                        <div>
                                             Province 
                                            <label>Province*</label>
                                            <select name="province" id="checkout_province" class="dropdown_item_select checkout_input" >
                                                <option></option>
                                                <option>Alberta</option>
                                                <option>Colombie-Britannique</option>                                                
                                                <option>Ile-du-Prince-Edouard</option>
                                                <option>Manitoba</option>
                                                <option>Nouveau-Brunswick</option>
                                                <option>Nouvelle-Ecosse</option>
                                                <option>Nunavut</option>                                                
                                                <option>Ontario</option>
                                                <option>Québec</option>
                                                <option>Saskatchewan</option>
                                                <option>Terre-Neuve-et-Labrador</option>
                                                <option>Territoires-du-Nord-Ouest</option>
                                                <option>Yukon</option>
                                            </select>
                                        </div>
                                        <div>
                                             Zipcode 
                                            <label>Zipcode*</label>
                                            <input type="text" name="zipcode" class="checkout_input" required="required">
                                        </div>
                                        <div>
                                             City / Town 
                                            <label>City/Town*</label>
                                            <input type="text" name="city" class="checkout_input" required="required">
                                        </div>
                                        <div>
                                             Address 
                                            <label>Address*</label>
                                            <input type="text" name="address" class="checkout_input" required="required">                                            
                                        </div>
                                        <div>
                                             Phone no 
                                            <label>Phone no*</label>
                                            <input type="tel" name="phone" class="checkout_input" required="required">
                                        </div>
                                        <div>
                                             Email 
                                            <label>Email Address*</label>
                                            <input type="email" name="email" class="checkout_input" required="required">
                                        </div>
                                        <div>
                                             Password 
                                            <label>Create Password</label>
                                            <input type="password" name="password" class="checkout_input" required="required">
                                        </div>
                                        <div>
                                             Confirm Password 
                                            <label>Confirm Password</label>
                                            <input type="password" name="confirm_password" class="checkout_input" required="required">
                                        </div>
                                        <div class="checkout_extra">
                                            <div>
                                                <input type="checkbox" id="checkbox_terms" name="regular_checkbox" class="regular_checkbox" checked="checked">
                                                <label><img src="images/check.png" alt=""></label>
                                                <span class="checkbox_title">Terms and conditions</span>
                                            </div>                                            
                                            <div>
                                                <input type="checkbox" id="checkbox_newsletter" name="regular_checkbox" class="regular_checkbox">
                                                <label><img src="images/check.png" alt=""></label>
                                                <span class="checkbox_title">Subscribe to our newsletter</span>
                                            </div>


                                        </div>

                                    </div>
                                </div>
                            </div>

                        <!--Picture Lavande1 -->

                            <div class="col-lg-6">
                                <div class="billing checkout_section">
                                    <div class="section_title register_img">
                                        <div>
                                            <img src="Images/Lavande1.jpg" alt="">
                                          
                                            <div class=" order_button button register" onclick="document.forms['registration_form'].submit();"><a href="#">Register</div>
                                        </div>

                                    </div>
                                </div>   
                            </div>
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

