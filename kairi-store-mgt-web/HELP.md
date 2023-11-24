# Kairi Store Mgt Web
This project is the web layer which will be responsible for serving the data by one of their presentations
either SSR templates or a REST API.

### Templates Workflow
Idea of the project is relied on Tailwind CSS for styling templates are served, which required some additional
set-up to do so. Following steps must be performed to run and understand how it works.

- Creation of fe folder to init a npm project.
- Init a npm project using the command `npm init`. Add the following dependencies: 
  _webpack-cli, webpack-dev-server, npm-run-all, style-loader, css-loader, postcss-loader, postcss-preset-env, tailwindcss, webpack._ 
  Among other to customize postcss.
- Create `webpack.config.js` file with multiple entries according the number style files required per page or component. These files will compiled
  under the folder _/resources/static/dist_ where will be available to be imported by the templates that need it.
- In case some modern css feature needs to added just like "CSS-IN-JS" the `postcss.config.js`.
- Webpack cli command `npx webpack --mode development` is used to compile the files.

 - - - - - - - 

### Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.1.5/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/3.1.5/maven-plugin/reference/html/#build-image)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/3.1.5/reference/htmlsingle/index.html#using.devtools)
* [Spring Configuration Processor](https://docs.spring.io/spring-boot/docs/3.1.5/reference/htmlsingle/index.html#appendix.configuration-metadata.annotation-processor)
* [Spring Web](https://docs.spring.io/spring-boot/docs/3.1.5/reference/htmlsingle/index.html#web)
* [Thymeleaf](https://docs.spring.io/spring-boot/docs/3.1.5/reference/htmlsingle/index.html#web.servlet.spring-mvc.template-engines)
* [Validation](https://docs.spring.io/spring-boot/docs/3.1.5/reference/htmlsingle/index.html#io.validation)
* [Spring Data Redis (Access+Driver)](https://docs.spring.io/spring-boot/docs/3.1.5/reference/htmlsingle/index.html#data.nosql.redis)
* [Spring Web Services](https://docs.spring.io/spring-boot/docs/3.1.5/reference/htmlsingle/index.html#io.webservices)
* [Spring HATEOAS](https://docs.spring.io/spring-boot/docs/3.1.5/reference/htmlsingle/index.html#web.spring-hateoas)
* [Spring Data Reactive Redis](https://docs.spring.io/spring-boot/docs/3.1.5/reference/htmlsingle/index.html#data.nosql.redis)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)
* [Handling Form Submission](https://spring.io/guides/gs/handling-form-submission/)
* [Validation](https://spring.io/guides/gs/validating-form-input/)
* [Messaging with Redis](https://spring.io/guides/gs/messaging-redis/)
* [Producing a SOAP web service](https://spring.io/guides/gs/producing-web-service/)
* [Building a Hypermedia-Driven RESTful Web Service](https://spring.io/guides/gs/rest-hateoas/)
* [Messaging with Redis](https://spring.io/guides/gs/messaging-redis/)

