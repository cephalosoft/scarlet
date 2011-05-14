package org.cephalosoft.scarlet.stanza

class Message(b: String, f: String, t: String, i: String) extends Stanza(f, t, i) {
  val body = b
}
