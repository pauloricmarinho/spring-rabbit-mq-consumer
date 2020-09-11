package br.edu.infnet.rabbit.mq;

import javax.websocket.server.PathParam;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")
public class MinhaFilaMQ {

	@Autowired
	private RabbitTemplate rabbitTemplate;

	@GetMapping("/mq-spring")
	public void enviarMensagemFila(@PathParam(value = "msg")String msg) throws InterruptedException {
			// Envio Assincrono de Mensagens para a Fila MQ	
			System.out.println("Enviado Mensagem para a Fila...");
			// Template do Rabbit para Envio de mensagem, ExchangeTopic, Chave e Mensagem
			rabbitTemplate.convertAndSend("infnet-mq-exchange", "br.edu.infnet.msg", msg);
		
	}
}
