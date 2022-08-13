商品数据(inventory)用SQL, order什么的用NoSQL

Inventory数据量不大，order数据量大

Inventory数据不大的话就存SQL，然后访问量大的话，也可以多弄几个replicas

order db 需要transaction， data consistent， 还是觉得 SQL 比 NOSQL好用些。

不同的service用不同的数据库，比如商品信息inventory service就用SQL，review service用NoSQL，
order service也用MySQL，然后可能还需要一个queue service，各个service之间用来通信数据

order db 和 inventory db 需要数据一致

Inventory需要transaction是因为很多人都会买同一样商品，比如某个商品还剩多少件，这个信息肯定是需要存在SQL

下order需要进行好几步操作，检查库存-》创建order-》计算order pay number-->减少库存

但是order是用户产生 他的状态就是order的状态 

order是海量的数据，如果存SQL 只能存还能关闭的交易 完成后的交易再存NoSQL
但这样太复杂了 还不如一开始就存NoSQL 用user id当key


当order的状态是pending的时候 库存就-1了，这个时候对于其他用户来说 如果看到库存为0就不能下单。
然后等到该order成功之后，库存不需要更新因为已经-1了。而如果order失败或者cancel了，库存需要再+1回去，这都是应用层的逻辑

而库存+1/-1这个操作是SQL transaction保证的

Payment service从消息队列拿order 消息 处理完了再扔消息回去

从用户查询pattern来看 order查询其实更频繁，而且往往是一下子查询某个用户最近一段时间的所有order，如果order放SQL，这个查询代价是很高的，但放NoSQL 因为以user ID做key, 这个查询就很easy 查一个node就行

order 的response要求没那么高
你下单以后 初始状态就是pending, 等你付完款 几秒内变成completed也没事
