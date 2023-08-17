package org.example.Task1;

import java.io.*;

public class Test {

    public static void main(String[] args) throws IOException {
        System.out.println("POST");;
        System.out.println("send POST = " + Http.sendPost("src/post.json"));

        System.out.println("PUT");
        System.out.println("send PUT = " + Http.sendPut("src/put.json"));

        System.out.println("DELETE");
        System.out.println("send DELETE = " + Http.sendDelete("src/put.json"));

        System.out.println("GET");
        System.out.println("send GET = " + Http.sendGet());

        System.out.println("GET BY INDEX");
        System.out.println("send GET (By Index) = " + Http.sendGetByIndex(2));

        System.out.println("GET BY USERNAME");
        System.out.println("send GET (By Username) = " + Http.sendGetByUsername("Antonette"));

        System.out.println("FROM LAST POST TO A FILE");

        Http.sendGetLastPostComments(1);
        Http.sendGetLastPostComments(2);
        Http.sendGetLastPostComments(3);
        Http.sendGetLastPostComments(4);
        Http.sendGetLastPostComments(5);
        Http.sendGetLastPostComments(6);
        Http.sendGetLastPostComments(7);
        Http.sendGetLastPostComments(8);
        Http.sendGetLastPostComments(9);
        Http.sendGetLastPostComments(10);

        System.out.println("ALL OPENED TODOS OF USER");
        System.out.println("HttpTask.sendGetAllOpenedTodos(2) = " + Http.sendGetAllOpenedTodos(2));
    }
}
