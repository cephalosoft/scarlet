package org.cephalosoft.scarlet.stanza.test

import scala.collection.mutable.Stack
import org.scalatest.Assertions
import org.junit.Test

import org.cephalosoft.scarlet.stanza.JID

class JIDTestSuite extends Assertions {

  @Test def verifyCreateJID {
    val jid = JID.apply("benjamin@redwoolf.net/empathy")
    assert(jid.toString === "benjamin@redwoolf.net/empathy");
  }
}
