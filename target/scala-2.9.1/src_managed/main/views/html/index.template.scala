
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
<div id="site_content">
	<div id="sidebar_container">
		<img class="paperclip" src="style/paperclip.png" alt="paperclip" />
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
		<img class="paperclip" src="style/paperclip.png" alt="paperclip" />
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
		<img class="paperclip" src="style/paperclip.png" alt="paperclip" />
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
	<div id="content">
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
""")))})))}
    }
    
    def render(message:String) = apply(message)
    
    def f:((String) => play.api.templates.Html) = (message) => apply(message)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Jan 30 15:44:47 GMT+02:00 2013
                    SOURCE: /Users/andrey/IdeaProjects/SimpleBlog/app/views/index.scala.html
                    HASH: 46deb261b09dee18876f9d2f08689c1a47a63a35
                    MATRIX: 505->1|599->18|636->21|671->48|710->50
                    LINES: 19->1|22->1|24->3|24->3|24->3
                    -- GENERATED --
                */
            