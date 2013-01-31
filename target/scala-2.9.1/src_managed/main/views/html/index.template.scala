
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
object index extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(message: String):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.19*/("""

"""),_display_(Seq[Any](/*3.2*/main("Welcome to Play 2.0")/*3.29*/ {_display_(Seq[Any](format.raw/*3.31*/("""

	<div id="content">
		<div class="post">
		<!-- insert the page content here -->
		<h1>Welcome to the simplestyle_7 template</h1>
		<p>
			This standards compliant, simple, fixed width website template is released as an 'open source' design (under a
			<a href="http://creativecommons.org/licenses/by/3.0">Creative Commons Attribution 3.0 Licence</a>
			), which means that you are free to download and use it for anything you want (including modifying and amending it). All I ask is that you leave the 'design from HTML5webtemplates.co.uk' link in the footer of the template, but other than that...
		</p>
		<p>
			This template is written entirely in <strong>HTML5</strong>
			and <strong>CSS</strong>
			, and can be validated using the links in the footer.
		</p>
		<p>
			You can view more free HTML5 web templates
			<a href="http://www.html5webtemplates.co.uk">here</a>
			.
		</p>
		<p>
			This template is a fully functional 5 page website, with an
			<a href="examples.html">examples</a>
			page that gives examples of all the styles available with this design.
		</p>
		<h2>Browser Compatibility</h2>
		<p>This template has been tested in the following browsers:</p>
		<ul>
			<li>Internet Explorer 8</li>
			<li>Internet Explorer 7</li>
			<li>FireFox 3.5</li>
			<li>Google Chrome 6</li>
			<li>Safari 4</li>
		</ul>
	</div>
	</div>
""")))})))}
    }
    
    def render(message:String) = apply(message)
    
    def f:((String) => play.api.templates.Html) = (message) => apply(message)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Jan 30 16:06:51 GMT+02:00 2013
                    SOURCE: /Users/andrey/IdeaProjects/SimpleBlog/app/views/index.scala.html
                    HASH: 99be55455d61f32c4d485e5270b5ab0c98f3f0fc
                    MATRIX: 505->1|599->18|636->21|671->48|710->50
                    LINES: 19->1|22->1|24->3|24->3|24->3
                    -- GENERATED --
                */
            