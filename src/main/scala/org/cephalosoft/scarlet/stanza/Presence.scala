package org.cephalosoft.scarlet.stanza

/**
 * Presence stanza
 */
class Presence(sh: String, st: String, f: String, t: String, i: String) extends Stanza(f, t, i) {
  val show = sh
  val status = st
}
