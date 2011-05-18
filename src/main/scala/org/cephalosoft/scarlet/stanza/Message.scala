package org.cephalosoft.scarlet.stanza

import scala.xml._

class Message(body: String, from: String, to: String, id: String) extends Stanza(from, to, id) {
  val mBody = body
}

object Message {
  def apply(stanza: String): Message = {
    val xmlStanza = XML.loadString(stanza)
    var from: String = xmlStanza.attributes.get("from").toString
    var to: String = xmlStanza.attributes.get("to").toString
    var body: String = null
    for (node <- xmlStanza.child)
      {
	if (node.label.equals("body"))
	  {
	    body = node.text
	  }
      }
    return new Message(body, from, to, null)
  }
}
