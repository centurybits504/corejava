<!DOCTYPE html>
<html>
<head>
	<!-- CSS -->
    <link rel="stylesheet" href="demo.css" type="text/css" />
    <!-- /CSS -->

<style type="text/css">
.collapse-open span {
    background:url(<%=request.getContextPath()%>/assets/img/minus.png) center center no-repeat;
}
.collapse-close span {
    display:block;
    float:left;
    background:url(<%=request.getContextPath()%>/assets/img/plus.png) center center no-repeat;
    padding:10px;
}
</style>
</head>
<body>


<%--  <img alt="" src="<%=request.getContextPath()%>/assets/img/plus.png"/> --%>
 
 <br><br><br><br>

<div id="content">

    <a href="#" id="closeAll" title="Close all">Close All</a> | <a href="#" id="openAll" title="Open All">Open All</a>

    <!-- collapsible -->
    <div class="page_collapsible" id="body-section1">Overview<span></span></div>
    <div class="container">
        <div class="content">
            <p>
                
            </p>
            
        </div>
    </div>
    <!-- end collapsible -->
    <!-- collapsible -->
	
    <div class="page_collapsible" id="body-section2">Add HTML<span></span></div>
    <div class="container">
        <div class="content">
            <p>
                You have to create your own html for the collapsible. You need a header element
                (here as div, can be div or etc) that gets the "collapsible" class assigned and a
                body element. However, the slide effect will be choppy if you have margins and
                padding for the container, so here we just use a div. Here I've used
                "collapsible" but you can choose any other selector, also i have added classes to
                aid with styling the collapsible, the containers do not have to have these class
                names. Here is an example:
            </p>
    
        </div>
    </div>
    <!-- end collapsible -->
    <!-- collapsible -->
    



<!-- JS -->
<script type="text/javascript" src="jquery.min.js"></script>
<script type="text/javascript" src="highlight.pack.js"></script>
<script type="text/javascript" src="jquery.collapsible.js"></script>

<script type="text/javascript">
    $(document).ready(function() {

        //syntax highlighter
        hljs.tabReplace = '    ';
        hljs.initHighlightingOnLoad();

        $.fn.slideFadeToggle = function(speed, easing, callback) {
            return this.animate({opacity: 'toggle', height: 'toggle'}, speed, easing, callback);
        };

        //collapsible management
        $('.collapsible').collapsible({
            defaultOpen: 'section1',
            cookieName: 'nav',
            speed: 'slow',
            animateOpen: function (elem, opts) { //replace the standard slideUp with custom function
                elem.next().slideFadeToggle(opts.speed);
            },
            animateClose: function (elem, opts) { //replace the standard slideDown with custom function
                elem.next().slideFadeToggle(opts.speed);
            },
            loadOpen: function (elem) { //replace the standard open state with custom function
                elem.next().show();
            },
            loadClose: function (elem, opts) { //replace the close state with custom function
                elem.next().hide();
            }
        });
        $('.page_collapsible').collapsible({
            defaultOpen: 'body_section1',
            cookieName: 'body2',
            speed: 'slow',
            animateOpen: function (elem, opts) { //replace the standard slideUp with custom function
                elem.next().slideFadeToggle(opts.speed);
            },
            animateClose: function (elem, opts) { //replace the standard slideDown with custom function
                elem.next().slideFadeToggle(opts.speed);
            },
            loadOpen: function (elem) { //replace the standard open state with custom function
                elem.next().show();
            },
            loadClose: function (elem, opts) { //replace the close state with custom function
                elem.next().hide();
            }

        });

        //assign open/close all to functions
        function openAll() {
            $('.page_collapsible').collapsible('openAll');
        }
        function closeAll() {
            $('.page_collapsible').collapsible('closeAll');
        }

        //listen for close/open all
        $('#closeAll').click(function(event) {
            event.preventDefault();
            closeAll();

        });
        $('#openAll').click(function(event) {
            event.preventDefault();
            openAll();
        });

    });
</script>
<!-- /JS -->

</body>
</html>