
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
					simplestyle
					<a href="#">_7</a>
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
		"""),_display_(Seq[Any](/*47.4*/content)),format.raw/*47.11*/("""
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
                    DATE: Wed Jan 30 15:41:53 GMT+02:00 2013
                    SOURCE: /Users/andrey/IdeaProjects/SimpleBlog/app/views/main.scala.html
                    HASH: 9eacb44764fa8043cb0696dcbb0f9e1b59665473
                    MATRIX: 509->1|616->31|692->72|718->77|938->262|952->268|1008->303|1098->357|1113->363|1167->395|1292->484|1307->490|1374->535|2362->1488|2391->1495
                    LINES: 19->1|22->1|27->6|27->6|30->9|30->9|30->9|31->10|31->10|31->10|33->12|33->12|33->12|68->47|68->47
                    -- GENERATED --
                */
            