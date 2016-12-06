import scala.beans.BeanInfo

@BeanInfo
case class Application(var name: String) extends Serializable