package com.kairos.jms;
import java.io.*;
import java.util.*;
import javax.transaction.*;
import javax.naming.*;
import javax.jms.*;
/**
*
* This example shows how to establish a connection to and receive
* messages from a JMS topic. The classes in this package operate
* on the same JMS topic. Run the classes together to observe messages
* being sent and received. This class is used to receive messages from
* the topic.
* @author Copyright (c) 1999-2001 by BEA Systems, Inc. All Rights Reserved.
*/
public class TopicReceiver
implements MessageListener
{
/**
* Defines the JNDI context factory.
*/
public final static String JNDI_FACTORY="weblogic.jndi.WLInitialContextFactory";
/**
* Defines the JMS connection factory for the topic.
*/
public final static String JMS_FACTORY="jms/myTopicConnectionFactory";
/**
* Defines the topic.
*/
public final static String TOPIC="jms/myTopic";
private TopicConnectionFactory tconFactory;
private TopicConnection tcon;
private TopicSession tsession;
private TopicSubscriber tsubscriber;
private Topic topic;
private boolean quit = false;
/**
* Message listener interface.
* @param msg message
*
*/
// MessageListener interface
public void onMessage(Message msg)
{
try {
String msgText;
if (msg instanceof TextMessage) {
msgText = ((TextMessage)msg).getText();
} else {
msgText = msg.toString();
}
System.out.println("JMS Message Received: "+ msgText );
if (msgText.equalsIgnoreCase("quit")) {
synchronized(this) {
quit = true;
this.notifyAll(); // Notify main thread to quit
}
}
} catch (JMSException jmse) {
jmse.printStackTrace();
}
}
/**
* Creates all the necessary objects for sending
* messages to a JMS topic.
*
* @param ctx JNDI initial context
* @param topicNamename of topic
* @exception NamingExceptionif problem occurred with JNDI context interface
* @exception JMSException if JMS fails to initialize due to internal error
*/
public void init(Context ctx, String topicName)
throws NamingException, JMSException
{
tconFactory = (TopicConnectionFactory) ctx.lookup(JMS_FACTORY);
tcon = tconFactory.createTopicConnection();
tsession = tcon.createTopicSession(false, Session.AUTO_ACKNOWLEDGE);
topic = (Topic) ctx.lookup(topicName);
tsubscriber = tsession.createSubscriber(topic);
tsubscriber.setMessageListener(this);
tcon.start();
}
/**
* Closes JMS objects.
*
* @exception JMSException if JMS fails to close objects due to internal error
*/
public void close()
throws JMSException
{
tsubscriber.close();
tsession.close();
tcon.close();
}
/**
* main() method.
*
* @params args WebLogic Server URL
* @exception Exception if execution fails
*/
public static void main(String[] args)
throws Exception
{
InitialContext ic = getInitialContext();
TopicReceiver tr = new TopicReceiver();
tr.init(ic, TOPIC);
System.out.println("JMS Ready To Receive Messages (To quit, send a \"quit\" message).");
// Wait until a "quit" message has been received.
synchronized(tr) {
while (! tr.quit) {
try {
tr.wait();
} catch (InterruptedException ie) {}
}
}
tr.close();
}
private static InitialContext getInitialContext()
throws NamingException
{
Hashtable env = new Hashtable();
env.put(Context.INITIAL_CONTEXT_FACTORY, JNDI_FACTORY);
env.put(Context.PROVIDER_URL, "t3://localhost:7001");
env.put("weblogic.jndi.createIntermediateContexts", "true");
env.put(Context.SECURITY_PRINCIPAL, "weblogic");
env.put(Context.SECURITY_CREDENTIALS, "Kairos12");

return new InitialContext(env);
}
}