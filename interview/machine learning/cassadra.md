NoSQL distributed database 

Each instance of cassandra called a node

1 installation = 1 NODE
capacity = ~2-4 TB
Throughput = LOTS tx/sec/core 

GOSSIP 

##
1. Petabye Database 
1 000 000 000 000 000 
2. hIGH Availability
3. Geographic Distribution 
4. erforamcne 
5. vendor independent 


## Take our data on table, distributed all over the country using partition 

you choose cassandra for your table, and cassandra will handle rest of for you 

## Advantage of cassandra 
1. Replication: partition tokens
Add partition key to the table, value will automatically hash to the table 

RF = 1: 1 copy of that partition one node, can increase to RT = 3 

2. Coordinator node to 3 nodes, each has a copy 

3. Consistency  

CL = QUORUM :  user quorum - immediate consistency 


Scalability
Availability

katacoda.com/datastax/courses/cassandra-intro

ASTRA Database 

create database and astra database 

## Key space 

clustering columns: data being read with database 

## Cassandra primary key
at least one partition key: like city
 
Primary key: must uniqueness, define unique role 
Partition key: partition rows 

Roles of a good partition: 
store together what you retrieve together 
avoid big partitions 
avoid unbounded partitions 
avoid hot partitions 


## create your database, then go to CQL counsole 

## Normalization: process of structuring a relational database in accordance with a series of so-called normal forms in order to reduce data reduandancy

Pros: simple write, data integrity
Cons: slow read, complex queries 

## Denormalization 
A strategy used on a database to increase data perforamnce, at the expense of losing some write performance, by adding redundant copies of data 
Pros: quick read, simple queries 
Cons;  multiple writes, manual integrity 

## NoSQL data modeling
ANalyze user behavior (Customer first)
Identify workflows, their dependencies and needs 
Define queriess to fulfill these workflows 
knowing the queries, design tables, using denormalization 
Use BATCH when inserting or updating denormalized data of multiple tables 

