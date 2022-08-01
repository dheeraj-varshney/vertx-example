package org.example;

import io.vertx.core.Vertx;
import io.vertx.core.http.HttpServer;
import io.vertx.core.http.HttpServerResponse;
import io.vertx.ext.web.Route;
import io.vertx.ext.web.Router;

import java.util.Date;

public class App {
    public static void main(String[] args) {
        Integer port = 8091;
        Vertx vertx = Vertx.vertx();
        HttpServer httpServer = vertx.createHttpServer();

        Router router = Router.router(vertx);

        Route handler1 = router
                .post("/hello")
                .handler(routingContext -> {
                    HttpServerResponse response = routingContext.response();
                    System.out.println(new Date());
                    response.putHeader("content-type", "application/json");
                    response.end("Post Hello world");
                });

        Route handler2 = router
                .get("/hello*")
                .handler(routingContext -> {
                    HttpServerResponse response = routingContext.response();
                    System.out.println(new Date());
                    response.putHeader("content-type", "application/json");
                    String name = "world";
                    response.end("Get Hello " + name.toUpperCase() + "!!");
                });

        httpServer
                .requestHandler(router::accept)
                .listen(port, res -> {
                    if (res.succeeded()) {
                        System.out.println("Server listening at http://locahost:" + port);
                    }
                });
    }
}
