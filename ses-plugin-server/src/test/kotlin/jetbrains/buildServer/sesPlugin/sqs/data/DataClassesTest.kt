@file:Suppress("UNUSED_VARIABLE")

package jetbrains.buildServer.sesPlugin.sqs.data

import jetbrains.buildServer.sesPlugin.sqs.SQSNotificationParseException
import jetbrains.buildServer.sesPlugin.sqs.result.AmazonSQSCommunicationResult
import jetbrains.buildServer.sesPlugin.sqs.result.AmazonSQSNotificationParseResult
import jetbrains.buildServer.sesPlugin.sqs.result.CheckConnectionResult
import org.testng.annotations.Test

@Suppress("UnusedEquals")
/**
 * Stub test for data classes
 */
class DataClassesTest {
    @Test
    fun testAmazonSQSNotification() {
        val data = AmazonSQSNotification("", "", "", "", "", "", "", "", "", "")
        with(data) {
            Type
            MessageId
            TopicArn
            Subject
            Message
            Timestamp
            Signature
            SigningCertURL
            UnsubscribeURL
            SignatureVersion

            Type = "!"
            MessageId = "!"
            TopicArn = "!"
            Subject = "!"
            Message = "!"
            Timestamp = "!"
            Signature = "!"
            SigningCertURL = "!"
            UnsubscribeURL = "!"
            SignatureVersion = "!"
        }

        val (Type, MessageId, TopicArn, Subject, Message, Timestamp, SignatureVersion, Signature, SigningCertURL, UnsubscribeURL) = AmazonSQSNotification("", "", "", "", "", "", "", "", "", "")

        val copy = data.copy()
        data.toString()
        data == data
        data == copy
        data.hashCode()
    }

    @Test
    fun testSESNotificationData() {
        val data = SESNotificationData("", BounceData("", "", listOf(Recipient("", "", "", "")),
                "", "", ""), MailData("", "", "", "", "",
                emptyList(), false, listOf(HeaderData("", ""))))
        with(data) {
            eventType
            with(bounce) {
                bounceType
                bounceSubType
                for (recipient in bouncedRecipients) {
                    with(recipient) {
                        emailAddress
                        action
                        status
                        diagnosticCode

                        toString()
                        val copy = copy()
                        hashCode()
                        this == this
                        this == copy
                    }
                }
                timestamp
                feedbackId
                reportingMTA
                with(mail) {
                    timestamp
                    source
                    sourceArn
                    sendingAccountId
                    messageId
                    destination
                    headersTruncated
                    for (header in headers) {
                        with(header) {
                            name
                            value

                            toString()
                            val copy = copy()
                            hashCode()
                            this == this
                            this == copy
                        }
                    }

                    toString()
                    val copy = copy()
                    hashCode()
                    this == this
                    this == copy
                }

                toString()
                val copy = copy()
                hashCode()
                this == this
                this == copy
            }

            eventType = "!"
            with(bounce) {
                bounceType = "!"
                bounceSubType = "!"
                for (recipient in bouncedRecipients) {
                    with(recipient) {
                        emailAddress = "!"
                        action = "!"
                        status = "!"
                        diagnosticCode = "!"
                    }
                }
                bouncedRecipients = emptyList()
                timestamp = "!"
                feedbackId = "!"
                reportingMTA = "!"
                with(mail) {
                    timestamp = "!"
                    source = "!"
                    sourceArn = "!"
                    sendingAccountId = "!"
                    messageId = "!"
                    destination = emptyList()
                    headersTruncated = true
                    for (header in headers) {
                        with(header) {
                            name = "!"
                            value = "!"
                        }
                    }
                    headers = emptyList()
                }
                mail = MailData("", "", "", "", "", emptyList(), false, emptyList())
            }
        }

        val copy = data.copy()
        data.toString()
        data == data
        data == copy
        data.hashCode()
    }

    @Test
    fun testAmazonSQSNotificationParseResult() {
        val data = AmazonSQSNotificationParseResult("", SQSNotificationParseException(""))
        with(data) {
            result
            exception
        }

        val copy = data.copy()
        data.toString()
        data == data
        data == copy
        data.hashCode()
    }

    @Test
    fun testCheckConnectionResult() {
        val data = CheckConnectionResult(true, SQSNotificationParseException(""), "")
        with(data) {
            status
            exception
            description
        }

        val copy = data.copy()
        data.toString()
        data == data
        data == copy
        data.hashCode()
    }

    @Test
    fun testReceiveMessagesResult() {
        val data = AmazonSQSCommunicationResult<String>(emptyList(), SQSNotificationParseException(""), "")
        with(data) {
            messages
            exception
            description
        }

        val copy = data.copy()
        data.toString()
        data == data
        data == copy
        data.hashCode()
    }
}