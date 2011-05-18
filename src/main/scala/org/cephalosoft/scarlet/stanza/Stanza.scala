package org.cephalosoft.scarlet.stanza

/**
 * Common stanza elements
 */
abstract class Stanza(from: String, to: String, id: String) {
  val mFrom = from
  val mTo = to
  val mId = id
}
