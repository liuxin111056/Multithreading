# Multithreading  
Java多线程编程核心实战指南(核心篇)  
# Multithreading  
Java多线程编程核心实战指南(核心篇)  
线程的生命周期:  
1.new-创建而为启动 (线程实例只能被启动一次,所以一个线程可能只有一次处于此状态)  
2.runable-又可以分为两个状态1.ready 2.running ready表示该线程可以被线程调度器调用变为running 状态.running表示正在运行的状态,run方法的代码正在执行.执行Thread.yield()可以把线程running状态改为ready状态. 
3.blocked-一个线程发起阻塞IO操作后或者申请或者申请一个其他的线程独占的资源时,线程就会处于此状态.  
4.waiting-线程执行wait,join等方法  
5.time_waiting.带有时间限制的等待  
6.terminated.已经执行结束的线程处于此状态.线程正常结束,抛出异常提前终止都会处于此状态.  
一个线程在整个生命周期中,只有一次处于new或terminated状态.


