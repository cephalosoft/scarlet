package org.cephalosoft.scarlet.stanza.test

import scala.collection.mutable.Stack
import org.scalatest.Assertions
import org.junit.Test

import org.cephalosoft.scarlet.stanza.Message

class MessageTest extends Assertions {
  @Test def verifyCreateMessageFromString {
    val xmlString = "<message to='jerjanssen@cephalosoft.org' from='benjamin@redwoolf.net'><body>Hello</body></message>"
    val message = Message(xmlString)
    assert(message.mBody === "Hello")
  }

  @Test def verifyCreateMessageFromXMLLiteral {
    val xmlString = <message to='jerjanssen@cephalosoft.org' from='benjamin@redwoolf.net'><body>Hello</body></message>
    val message = Message(xmlString)
    assert(message.mBody === "Hello")
  }
}
