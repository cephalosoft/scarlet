package org.cephalosoft.scarlet.stanza

/**
 * Common stanza elements
 */
abstract class Stanza(f: String, t: String, i: String) {
  val from = f
  val to = t
  val id = i
}
