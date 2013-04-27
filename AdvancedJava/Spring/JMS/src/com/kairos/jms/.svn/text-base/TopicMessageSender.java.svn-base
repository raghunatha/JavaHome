package com.kairos.jms;

import java.util.Hashtable;

import javax.naming.*;

import javax.jms.*;

public class TopicMessageSender {

	private static InitialContext ctx = null;
	private static TopicConnectionFactory topicConnectionFactory = null;
	private static TopicConnection topicConnection = null;
	private static TopicSession topicSession = null;
	private static Topic topic = null;
	private static TopicPublisher topicPublisher = null;
	private static TextMessage message = null;
	// NOTE: The next two lines set the name of the Topic Connection Factory
	// and the Topic that we want to use.
	private static final String TOPIC_CONNECTION_FACTORY = "jms/myTopicConnectionFactory";
	private static final String TOPIC_NAME = "jms/myTopic";

	public TopicMessageSender() {
		super();
	}

	public static void sendMessage(String messageText) {
		// create InitialContext
		Hashtable properties = new Hashtable();
		properties.put(Context.INITIAL_CONTEXT_FACTORY,
				"weblogic.jndi.WLInitialContextFactory");
		properties.put(Context.PROVIDER_URL, "t3://localhost:7001");
		properties.put(Context.SECURITY_PRINCIPAL, "weblogic");
		properties.put(Context.SECURITY_CREDENTIALS, "Kairos12");

		try {
			ctx = new InitialContext(properties);
			System.out.println("Got InitialContext " + ctx.toString());

			// create TopicConnectionFactory
			topicConnectionFactory = (TopicConnectionFactory) ctx
					.lookup(TOPIC_CONNECTION_FACTORY);
			System.out.println("Got TopicConnectionFactory "
					+ topicConnectionFactory.toString());

			// create TopicConnection
			topicConnection = topicConnectionFactory.createTopicConnection();
			System.out.println("Got TopicConnection "
					+ topicConnection.toString());

			// create TopicSession
			topicSession = topicConnection.createTopicSession(false, 0);
			System.out.println("Got TopicSession " + topicSession.toString());

			// lookup Topic
			topic = (Topic) ctx.lookup(TOPIC_NAME);
			System.out.println("Got Topic " + topic.toString());

			// create TopicPublisher
			topicPublisher = topicSession.createPublisher(topic);
			System.out.println("Got TopicSender " + topicPublisher.toString());

			// create TextMessage
			message = topicSession.createTextMessage();
			System.out.println("Got TextMessage " + message.toString());

			// set message text in TextMessage
			message.setText(messageText);
			System.out.println("Set text in TextMessage " + message.toString());

			// send message
			topicPublisher.send(message);
			System.out.println("Sent message ");

		} catch (NamingException ne) {
			ne.printStackTrace(System.err);
			System.exit(0);
		} catch (JMSException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// clean up
		finally {
			message = null;
			try {
				topicPublisher.close();
				topicPublisher = null;
				topic = null;
				topicSession.close();
				topicSession = null;
				topicConnection.close();
				topicConnection = null;
				topicConnectionFactory = null;
				ctx = null;
			} catch (JMSException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.println("Cleaned up and done.");

		}
	}

	public static void main(String[] args) {
		//sendMessage("sending text message to topic from Siva's program");
		sendMessage("quit");
	}
}