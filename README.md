
Centralized Authorization with JWT using Spring Boot 2

This guide walks through the process to create a centralized authentication and authorization server with Spring Boot 2, a demo resource server will also be provided.

Pre-req
    
    JDK 1.8
    MySQL

Implementation Overview

For this project Spring Security 5.x has been used through Spring Boot 2.2.0.

OAuth2 Terminology

    Resource Owner
        The user who authorizes an application to access his account. The access is limited to the scope.
    Resource Server:
        A server that handles authenticated requests after the client has obtained an access token.
    Client
        An application that access protected resources on behalf of the resource owner.
    Authorization Server
        A server which issues access tokens after successfully authenticating a client and resource owner, and authorizing the request.
    Access Token
        A unique token used to access protected resources
    Scope
        A Permission
    JWT
        JSON Web Token is a method for representing claims securely between two parties as defined in RFC 7519
    Grant type
        A grant is a method of acquiring an access token.
