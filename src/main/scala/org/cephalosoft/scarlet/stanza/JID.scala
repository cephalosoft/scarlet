package org.cephalosoft.scarlet.stanza

/**
 * Represents an XMPP Jabber ID.
 *
 * @author benjamin
 */

class JID (localPart: String, domainPart: String, resourcePart: String) {
  val local = localPart
  val domain = domainPart
  val resource = resourcePart
  override def toString = local + "@" + domain + "/" + resource
}

object JID {
  def apply(jid: String): JID = {
    var local: String = null
    var domain: String = null
    var resource: String = null
    if (jid.indexOf('@') > 0) {
      local = jid.substring(0, jid.indexOf('@'))
    } else {
      // throw exception
    }

    if (jid.indexOf('/') > 0) {
      domain = jid.substring(jid.indexOf('@') + 1, jid.indexOf('/'))
      resource = jid.substring(jid.indexOf('/') + 1, jid.length)
    } else {
      domain = jid.substring(jid.indexOf('@') + 1, jid.length)
    }
    return new JID(local, domain, resource)
  }

  def apply(localPart: String, domainPart: String) {
    return new JID(localPart, domainPart, "")
  }
}
