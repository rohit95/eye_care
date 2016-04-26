package io.vertx.eye_care;

import java.awt.Desktop;
import java.net.URI;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Future;

public class AppVerticle extends AbstractVerticle {
	
	@Override
	public void start(Future<Void> future) {
		
		/*
		 * server that displays Message
		 * if clash in port change port
		 */
		vertx.createHttpServer()
		.requestHandler(request -> {
			request.response().end("<h1>Rest your eyes, Take a Break..</h1>");
		})
		.listen(5599, result -> {
			if(result.succeeded()) {
				System.out.println("server running on 5599");
			}
		});
		
		/*
		 * callback after 20min.
		 */
		vertx.setPeriodic(1200000, handler -> {
			System.out.println("Fired");
			
			if(Desktop.isDesktopSupported()) {
				try {
					Desktop.getDesktop().browse(new URI("http://localhost:5599"));
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			else {
				System.out.println("No desktop mode suppoted...watch console triggers");
			}
		});
	}
}
