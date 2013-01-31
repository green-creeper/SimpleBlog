
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import play.api.i18n._
import play.api.mvc._
import play.api.data._
import views.html._
/**/
object main extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,Html,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(title: String)(content: Html):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.32*/("""
<!DOCTYPE html>

<html>
<head>
	<title>"""),_display_(Seq[Any](/*6.10*/title)),format.raw/*6.15*/("""</title>
	<meta name="description" content="website description" />
	<meta name="keywords" content="website keywords, website keywords" />
	<link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*9.47*/routes/*9.53*/.Assets.at("stylesheets/style.css"))),format.raw/*9.88*/("""">
	<link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*10.52*/routes/*10.58*/.Assets.at("images/favicon.png"))),format.raw/*10.90*/("""">
	<meta http-equiv="content-type" content="text/html; charset=utf-8" />
	<script src=""""),_display_(Seq[Any](/*12.16*/routes/*12.22*/.Assets.at("javascripts/jquery-1.7.1.min.js"))),format.raw/*12.67*/("""" type="text/javascript"></script>
	<link rel="stylesheet" type="text/css" href="http://fonts.googleapis.com/css?family=Tangerine&amp;v1" />
	<link rel="stylesheet" type="text/css" href="http://fonts.googleapis.com/css?family=Yanone+Kaffeesatz" />
</head>
<body>
	<div id="main">
		<div id="header">
			<div id="logo">
				<h1>
					green-creeper`s
					<a href="#">_codeblog</a>
				</h1>
				<div class="slogan">Cool slogan goes here!</div>
			</div>
			<div id="menubar">
				<ul id="menu">
					<!-- put class="current" in the li tag for the selected page - to highlight which page you're on -->
					<li class="current">
						<a href="index.html">Home</a>
					</li>
					<li>
						<a href="examples.html">Examples</a>
					</li>
					<li>
						<a href="page.html">A Page</a>
					</li>
					<li>
						<a href="another_page.html">Another Page</a>
					</li>
					<li>
						<a href="contact.html">Contact Us</a>
					</li>
				</ul>
			</div>
		</div>
		<div id="site_content">
			<div id="sidebar_container">
				<div class="sidebar">
					<!-- insert your sidebar items here -->
					<h3>Latest News</h3>
					<h4>What's the News?</h4>
					<h5>1st July 2011</h5>
					<p>
						Put your latest news item here, or anything else you would like in the sidebar!
						<br />
						<a href="#">Read more</a>
					</p>
				</div>				
				<div class="sidebar">
					<h3>Newsletter</h3>
					<p>
						If you would like to receive our newletter, please enter your email address and click 'Subscribe'.
					</p>
					<form method="post" action="#" id="subscribe">
						<p style="padding: 0 0 9px 0;">
							<input class="search" type="text" name="email_address" value="your email address" onclick="javascript: document.forms['subscribe'].email_address.value=''" />
						</p>
						<p>
							<input class="subscribe" name="subscribe" type="submit" value="Subscribe" />
						</p>
					</form>
				</div>
				<div class="sidebar">
					<h3>Latest Blog</h3>
					<h4>Website Goes Live</h4>
					<h5>1st July 2011</h5>
					<p>
						We have just launched our new website. Take a look around, we'd love to know what you think.....
						<br />
						<a href="#">read more</a>
					</p>
				</div>
			</div>
			"""),_display_(Seq[Any](/*85.5*/content)),format.raw/*85.12*/("""
		</div>
		<div id="footer">
			<p>
				Copyright &copy; simplestyle_7 |
				<a href="http://validator.w3.org/check?uri=referer">HTML5</a>
				|
				<a href="http://jigsaw.w3.org/css-validator/check/referer">CSS</a>
				|
				<a href="http://www.html5webtemplates.co.uk">design from HTML5webtemplates.co.uk</a>
			</p>
		</div>
	</div>
</body>
</html>"""))}
    }
    
    def render(title:String,content:Html) = apply(title)(content)
    
    def f:((String) => (Html) => play.api.templates.Html) = (title) => (content) => apply(title)(content)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Jan 30 16:09:35 GMT+02:00 2013
                    SOURCE: /Users/andrey/IdeaProjects/SimpleBlog/app/views/main.scala.html
                    HASH: 3fa745f6f06ef8faee19b9701c86d5c7462314e2
                    MATRIX: 509->1|616->31|692->72|718->77|938->262|952->268|1008->303|1098->357|1113->363|1167->395|1292->484|1307->490|1374->535|3623->2749|3652->2756
                    LINES: 19->1|22->1|27->6|27->6|30->9|30->9|30->9|31->10|31->10|31->10|33->12|33->12|33->12|106->85|106->85
                    -- GENERATED --
                */
            