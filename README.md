# Multithreading  
Java多线程编程核心实战指南(核心篇)  
# Multithreading  
Java多线程编程核心实战指南(核心篇)  
线程的生命周期:  
1.new-创建而为启动 (线程实例只能被启动一次,所以一个线程可能只有一次处于此状态)  
2.runable-又可以分为两个状态1.ready 2.running ready表示该线程可以被线程调度器调用变为running 状态.running表示正在运行的状态,run方法的代码正在执行.执行Thread.yield()可以把线程running状态改为ready状态.  

