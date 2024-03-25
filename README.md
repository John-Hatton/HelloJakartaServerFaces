# Hello Jakarta Server Faces

---

### Introduction

This project is the beginning of my research into JSF. After much effort, I was finally able to get a modern app 
working. The problem is, when we use Jakarta, and the newer versions of the Java EE, we have to use the newest version 
of Tomcat, i.e. version 10. I was facing several issues, which would look for javax.faces..., but I would have 
jakarta.faces... and so on. 

---

### Project Structure


    HelloJakartaServerFaces/
    ├── src/
    │   ├── main/
    │   │   │── java/
    │   │   │    └── mars/
    │   │   │        └── hatton/
    │   │   │            └── jsf/
    │   │   │                │── HelloJSF.java
    │   │   │                └── MessageBean.java
    │   │   └── webapp/
    │   │       │── WEB-INF/ 
    │   │       │   │── beans.xml (empty)
    │   │       │   │── faces-config.xml
    │   │       │   └── web.xml
    │   │       └── home.xhtml 
    │   └── test/
    │       └── java/
    │           └── HelloJSFTest.java
    └── build.gradle

---

### Message Bean

We have a simple [Java Bean](https://www.geeksforgeeks.org/javabean-class-java/), which contains a private member 
property, message, which contains "Hello, Jakarta Server Faces!"

We then create an instance of this bean in our main class, HelloJSF.java. For now, we are using the deprecated versions 
of ManagedBean and ManagedProperty, so we can reference them in the jsf page, home.xhtml. I.e. #{helloJSF.message}. The 
goal is to reimplement this using @Named and @Inject, however, I'll need to do some more research before I make those 
changes.

---

### Versions

It's useful to note that you will need to deploy the generated .war file on a Tomcat server, version 10 or higher. I.e. 
newest. This is because we use jakarta server faces api, version 5.0.0. 

We're also using jakarta.faces from glassfish i.e. Mojarra Server Faces, version 3.0.3. 

---