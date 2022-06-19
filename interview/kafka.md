## https://www.interviewbit.com/kafka-interview-questions/
## What is Kafka

Apache Kafka is a streaming platform that is free and open-source. Kafka was first built at LinkedIn as a messaging queue, but it has evolved into much more. It's a versatile tool for working with data streams that may be applied to a variety of scenarios.

Kafka is a distributed system, which means it can scale up as needed. All you have to do now is add new Kafka nodes (servers) to the cluster.

Kafka can process a large amount of data in a short amount of time. It also has low latency, making it possible to process data in real-time. Although Apache Kafka is written in Scala and Java, it may be used with a variety of different programming languages.

Traditional message queues, like RabbitMQ, are not the same as Kafka. RabbitMQ eliminates messages immediately after the consumer confirms them, whereas Kafka keeps them for a period of time (default is 7 days) after they've been received. RabbitMQ also sends messages to consumers and monitors their load. It determines how many messages each consumer should be processing at any one time. On the other hand, Consumers can retrieve messages from Kafka by pulling. It is built to be scalable horizontally by adding more nodes.

It is used for fault-tolerant storage as well as publishing and subscribing to a stream of records. The programs are intended to process timing and consumption records. Kafka replicates log partitions from many hosts. Developers and users contribute coding updates, which it keeps, reads, and analyses in real-time. For messaging, website activity tracking, log aggregation, and commit logs, Kafka is employed. Although Kafka can be used as a database, it lacks a data schema and indexes.

Now, let’s dive deep into the plethora of commonly asked Kafka interview questions and answers for both freshers as well as experienced.

## 1. What are some of the features of Kafka?

Following are the key features of Kafka:-

    Kafka is a messaging system built for high throughput and fault tolerance.
    Kafka has a built-in patriation system known as a Topic.
    Kafka Includes a replication feature as well.
    Kafka provides a queue that can handle large amounts of data and move messages from one sender to another.
    Kafka can also save the messages to storage and replicate them across the cluster.
    For coordination and synchronization with other services, Kafka collaborates with Zookeeper.
    Apache Spark is well supported by Kafka.

## What are the traditional methods of message transfer? How is Kafka better from them?
Following are the traditional methods of message transfer:-

    Message Queuing:- 
    A point-to-point technique is used in the message queuing pattern. A message in the queue will be destroyed once it has been consumed, similar to how a message is removed from the server once it has been delivered in the Post Office Protocol. Asynchronous messaging is possible with these queues.
    If a network problem delays a message's delivery, such as if a consumer is unavailable, the message will be held in the queue until it can be sent. This means that messages aren't always sent in the same order. Instead, they are given on a first-come, first-served basis, which can improve efficiency in some situations.
         Publisher - Subscriber Model:- 
    The publish-subscribe pattern entails publishers producing ("publishing") messages in multiple categories and subscribers consuming published messages from the various categories to which they are subscribed. Unlike point-to-point texting, a message is only removed once it has been consumed by all category subscribers.
    Kafka caters to a single consumer abstraction that encompasses both of the aforementioned- the consumer group. Following are the benefits of using Kafka over the traditional messaging transfer techniques:
        Scalable: A cluster of devices is used to partition and streamline the data thereby, scaling up the storage capacity.
        Faster: Thousands of clients can be served by a single Kafka broker as it can manage megabytes of reads and writes per second.
        Durability and Fault-Tolerant: The data is kept persistent and tolerant to any hardware failures by copying the data in the clusters.
