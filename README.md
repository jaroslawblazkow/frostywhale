
# Description

Create microservice that issues an invoice when it receives event "OrderPaid".

use DDD, hexagonal architecture (domain layer, application layer, infrastructure layer), CQRS and basics of event sourcing

messaging queue of your choice

Invoice Aggregate should contain domain objects such as invoice itemsdomain objects and events should contain basic properties of your choice.

# Notes
java 17
- 3 domains
  - customer - without logic
  - order - presents CQRS (separation between Query and Command in application layer)
  - invoice - consumer of event
- not implemented infrastracture layer
- avoided autowired, easy context management
- basic of event sourcing shown as saving events to store
- messaging queue - kafka

nth: probably better encapsulation + UTs
