
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!-- JS file -->
<!-- Using jQuery with a CDN -->
<script src="http://code.jquery.com/jquery-1.11.2.min.js"></script>
<script src="js/jquery-3.3.1.js" type="text/javascript"></script>
<script src="plugins/EasyAutocomplete-1.3.5/jquery.easy-autocomplete.min.js" type="text/javascript"></script>
<!-- CSS file -->

<link href="plugins/EasyAutocomplete-1.3.5/easy-autocomplete.min.css" rel="stylesheet" type="text/css"/>
<!-- Additional CSS Themes file - not required-->

<link href="plugins/EasyAutocomplete-1.3.5/easy-autocomplete.themes.min.css" rel="stylesheet" type="text/css"/>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <input id="provider-json" />
        <script>

             
             
            var options = {
                
               
	url: "people.json",
        
	getValue: "name",

	list: {
		match: {
			enabled: true
		}
	}
};

$("#provider-json").easyAutocomplete(options);
        </script>
    </body>
</html>
