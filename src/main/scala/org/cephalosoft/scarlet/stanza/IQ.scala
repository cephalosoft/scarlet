package org.cephalosoft.scarlet.stanza

class IQ(iq: String, b: String, f: String, t: String, i: String) extends Stanza(f, t, i) {
  val iqType = iq
  val body = b
}
