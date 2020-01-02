package com.cam.orchestration.config;

import javax.jms.ConnectionFactory;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jms.config.DefaultJmsListenerContainerFactory;
import org.springframework.jms.core.JmsTemplate;

@Configuration
public class JmsConfig {

	@Value("${spring.activemq.broker-url}")
	String BROKER_URL;
	@Value("${spring.activemq.user}")
	String BROKER_USERNAME;
	@Value("${spring.activemq.password}")
	String BROKER_PASSWORD;

	@Value("${mdm.ibm.connectionfactory}")
	String IBM_MDM_CF;
	@Value("${mdm.ibmmq.bindings}")
	String IBM_JNDI_FILE;

	@Bean
	public ActiveMQConnectionFactory activemqConnectionFactory() {
		ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory();
		connectionFactory.setBrokerURL(BROKER_URL);
		connectionFactory.setUserName(BROKER_USERNAME);
		connectionFactory.setPassword(BROKER_PASSWORD);
		return connectionFactory;
	}

	@Bean("activemq2ConnectionFactory")
	public ActiveMQConnectionFactory activemq2ConnectionFactory() {
		ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory();
		connectionFactory.setBrokerURL(BROKER_URL);
		connectionFactory.setUserName(BROKER_USERNAME);
		connectionFactory.setPassword(BROKER_PASSWORD);

		return connectionFactory;
	}

	@Bean("activemq")
	@Primary
	public JmsTemplate getActivemq(@Qualifier("activemqConnectionFactory") ConnectionFactory factory) {
		JmsTemplate template = new JmsTemplate();
		template.setConnectionFactory(activemqConnectionFactory());
		return template;
	}

	/*
	 * @Bean
	 * 
	 * @Qualifier("activemq2") public JmsComponent
	 * createJmsComponent(@Qualifier("activemq2ConnectionFactory") ConnectionFactory
	 * factory) { // Initialise component from externalised configs return
	 * JmsComponent.jmsComponentAutoAcknowledge(factory); }
	 */

	@Bean
	public DefaultJmsListenerContainerFactory jmsListenerContainerFactory() {
		DefaultJmsListenerContainerFactory factory = new DefaultJmsListenerContainerFactory();
		factory.setConnectionFactory(activemq2ConnectionFactory());
		factory.setConcurrency("1-1");
		return factory;
	}

//	@Bean("ibmMQConnectionFactory")
//	public MQQueueConnectionFactory mqQueueConnectionFactory() throws Exception {
//		
//		Properties props = new Properties();
//		props.put(Context.PROVIDER_URL, IBM_JNDI_FILE);
//		props.put("java.naming.security.authentication", "none");
//		props.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.fscontext.RefFSContextFactory");
//		props.put("java.naming.security.authentication", "none");
//		JndiTemplate jndiTemplate = new JndiTemplate(props);
//		Context ctx =  jndiTemplate.getContext();
//
//		MQQueueConnectionFactory initFactory = new MQQueueConnectionFactory();
//		ctx.unbind("ibm:mq:queue");
//		ctx.bind("ibm:mq:queue", initFactory);
//		MQQueueConnectionFactory factory = (MQQueueConnectionFactory) ctx.lookup(IBM_MDM_CF);
//		factory.setMQConnectionOptions(WMQConstants.AUTO_ACKNOWLEDGE);
//		System.out.println();
//		System.out.println("*** InformaticaMDM( " + ctx.lookup("InformaticaMDM") + ") - hostName "
//				+ factory.getHostName() + " - Port " + factory.getPort() + " - Channel " + factory.getChannel() + " "
//				+ factory.getLocalAddress());
//		System.out.println();
//
//		return factory;
//	}
//
//	@Bean
//	@Qualifier("mdm-mq")
//	public JmsComponent getIBMMQ(@Qualifier("ibmMQConnectionFactory") ConnectionFactory factory) {
//		JmsTransactionManager jtm = new JmsTransactionManager(factory);
//		JmsComponent ibmmq = JmsComponent.jmsComponentAutoAcknowledge(factory);
//		ibmmq.setTransacted(true);
//
//		ibmmq.setTransactionManager(jtm);
//		ibmmq.setAcknowledgementModeName("AUTO_ACKNOWLEDGE");
//		return ibmmq;
//	}

}