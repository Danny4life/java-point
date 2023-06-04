//package com.osiki.javatpoint.jenkov;
//
//import javax.enterprise.context.spi.CreationalContext;
//import javax.enterprise.inject.spi.InjectionPoint;
//import javax.enterprise.inject.spi.Producer;
//import java.util.Set;
//import java.util.concurrent.ArrayBlockingQueue;
//import java.util.concurrent.BlockingQueue;
//import java.util.function.Consumer;
//
//public class BlockingQueueEx {
//
//    public static void main(String[] args) throws Exception {
//        BlockingQueue queue = new ArrayBlockingQueue(1024);
//
//        Producer producer = new Producer(queue) {
//            @Override
//            public Object produce(CreationalContext creationalContext) {
//                return null;
//            }
//
//            @Override
//            public void dispose(Object o) {
//
//            }
//
//            @Override
//            public Set<InjectionPoint> getInjectionPoints() {
//                return null;
//            }
//        };
//        Consumer consumer = new Consumer(queue);
//
//        new Thread(producer).start();
//        new Thread(consumer).start();
//
//        Thread.sleep(4000);
//
//    }
//}
