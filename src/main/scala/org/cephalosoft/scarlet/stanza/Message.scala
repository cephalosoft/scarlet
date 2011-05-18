package org.cephalosoft.scarlet.stanza

import scala.xml._

class Message(body: String, from: String, to: String, id: String) extends Stanza(from, to, id) {
  val mBody = body
}

object Message {
  def apply(stanza: String) = {
    val xmlStanza = XML.loadString(stanza)

  }
}
