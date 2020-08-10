# wild-micro-services-java
Wilfly micro services playground

Narrative:
   To help activist protecting wild monkey population a set of services need to be developed
to register events as monkey registration, eating times and related behaviour.
   Activist also require scalable architecture as to adapt the usage depending on world events and
founding.



Technological aspects:
   - micro-services architecture based on wildfly swarm and micro profile
       * run individual modules via mvn plugin
   - testing via arquilian, wiremock, mockito
   - containerisation
   - health checks
   - fault tolerance
   - api gateway
   - security via jwt tokens
   - metrics for scaling deployments

Requires:
   java and maven already installed