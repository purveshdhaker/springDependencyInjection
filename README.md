# How Spring Boot’s Autoconfigurations Work

https://www.marcobehler.com/guides/spring-boot-autoconfiguration

## Final Answer: What is Spring Boot?
Spring Boot is just a couple of AutoConfigurations classes (== normal Spring @Configurations), that create @Beans for you if certain @Conditions are met.

Three of the most important conditions are

@ConditionalOnClass. Checking for dependencies or rather specific classes of dependencies (think: Tomcat, HikariCP, etc).

@ConditionalOnProperty. Self-explanatory.

@ConditionalOnMissingBean. If the user specified his own, e.g. DataSource, already, then Spring Boot won’t try to create its auto-configured one.

That is what is meant by "opinionated defaults" on the Spring Boot homepage.

### What is the difference between Spring and Spring Boot?
Spring, as in Spring Framework is a set of tools that help you build Java applications faster (hopefully).

After having read this article, you should understand that Spring Boot merely preconfigures these tools for you with sane settings (i.e. let’s always read in an classpath:application.properties file and use the property server.port to preconfigure a Tomcat server on a specific port). Hence, Spring Boot builds on top of Spring Framework.

Things get confusing, though, as the current marketing push is to call everything Spring Boot or Spring Framework simply "Spring"