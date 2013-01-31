package models

/**
 * Created with IntelliJ IDEA.
 * User: andrey
 * Date: 30.01.13
 * Time: 16:36
 * To change this template use File | Settings | File Templates.
 */
import org.codehaus.jackson.annotate.JsonProperty
import reflect.BeanProperty
import javax.persistence.Id
import play.api.Play.current
import play.modules.mongodb.jackson.MongoDB
import scala.collection.JavaConversions._
import play.api.Play.current
import net.vz.mongodb.jackson.ObjectId
import java.util.Date

class BlogPost(@ObjectId @Id val id: String,
               @BeanProperty @JsonProperty("date") val date: Date,
               @BeanProperty @JsonProperty("title") val title: String,
               @BeanProperty @JsonProperty("author") val author: String,
               @BeanProperty @JsonProperty("content") val content: String,
               @BeanProperty @JsonProperty("comments") val comments: List[Comment]) {
  @ObjectId @Id def getId = id;
}

object BlogPost {
  private lazy val db = MongoDB.collection("blogposts", classOf[BlogPost], classOf[String])

  def save(blogPost: BlogPost) { db.save(blogPost) }
  def findById(id: String) = Option(db.findOneById(id))
  def findByAuthor(author: String) = db.find().is("author", author).asScala
}