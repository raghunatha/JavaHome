package com.kairos.jms;

import java.util.Hashtable;

import javax.jms.JMSException;
import javax.jms.Queue;
import javax.jms.QueueConnection;
import javax.jms.QueueConnectionFactory;
import javax.jms.QueueSender;
import javax.jms.QueueSession;
import javax.jms.TextMessage;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class QueueMessageSender {

	private static InitialContext ctx = null;
	private static QueueConnectionFactory queueConnectionFactory = null;
	private static QueueConnection queueConnection = null;
	private static QueueSession queueSession = null;
	private static Queue queue = null;
	private static QueueSender queueSender = null;
	private static TextMessage message = null;
	// NOTE: The next two lines set the name of the Queue Connection Factory
	// and the Queue that we want to use.
	private static final String QCF_NAME = "jms/myQueueConnectionFactory";
	private static final String QUEUE_NAME = "jms/myQueue";

	public QueueMessageSender() {
		super();
	}

	public static void sendMessage(String messageText) {

		// create InitialContext
		Hashtable properties = new Hashtable();
		properties.put(Context.INITIAL_CONTEXT_FACTORY,
				"weblogic.jndi.WLInitialContextFactory");
		properties.put(Context.PROVIDER_URL, "t3://192.168.10.216:7001");
		properties.put(Context.SECURITY_PRINCIPAL, "weblogic");
		properties.put(Context.SECURITY_CREDENTIALS, "Kairos12");
		try {

			ctx = new InitialContext(properties);
			System.out.println("Got InitialContext " + ctx.toString());

			// create QueueConnectionFactory
			queueConnectionFactory = (QueueConnectionFactory) ctx
					.lookup(QCF_NAME);
			System.out.println("Got QueueConnectionFactory "
					+ queueConnectionFactory.toString());

			// create QueueConnection
			queueConnection = queueConnectionFactory.createQueueConnection();
			System.out.println("Created QueueConnection "
					+ queueConnection.toString());

			// create QueueSession
			queueSession = queueConnection.createQueueSession(false, 0);
			System.out.println("Created QueueSession " + queueSession.toString());

			// lookup Queue
			queue = (Queue) ctx.lookup(QUEUE_NAME);
			System.out.println("Got Queue " + queue.toString());

			// create QueueSender
			queueSender = queueSession.createSender(queue);
			System.out.println("Created QueueSender " + queueSender.toString());

			// create TextMessage
			message = queueSession.createTextMessage();
			System.out.println("Got TextMessage " + message.toString());

			// set message text in TextMessage
			message.setText(messageText);
			
			System.out.println("Set text in TextMessage " + message.toString());

			// send message
			queueSender.send(message);
			System.out.println("Sent message ");

		} catch (NamingException ne) {
			ne.printStackTrace(System.err);
			System.exit(0);
		} catch (JMSException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// clean up

			message = null;
			try {
				queueSender.close();
				queueSender = null;
				queue = null;
				queueSession.close();
				queueSession = null;
				queueConnection.close();
				queueConnection = null;
				queueConnectionFactory = null;
				ctx = null;
			} catch (JMSException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.println("Cleaned up and done.");

		}

	}

	public static void main(String[] args) {
		//sendMessage("Text message to queue from JMS Program by Siva");
		sendMessage("quit");
	}
}