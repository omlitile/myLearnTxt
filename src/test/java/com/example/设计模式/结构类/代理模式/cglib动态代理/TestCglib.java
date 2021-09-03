package com.example.设计模式.结构类.代理模式.cglib动态代理;

/**
 * 可以代理没有实现接口的类。
 CGLIB是一个强大的高性能的代码生成包，它可以在运行期扩展Java类与实现Java接口。它广泛的被许多AOP的框架使用， 例如Spring AOP和dynaop，
 为他们提供方法的interception（拦截）。
 CGLIB包的底层是通过使用一个小而快的字节码处理框架ASM，来转换字节码并生成新的类。不鼓励直接使用ASM，因为它需要你对JVM内部结构包括class文件的格式和指令集都很熟悉
 */

public class TestCglib {
    public static void main(String[] args) {
        CglibProxy cglibProxy = new CglibProxy();
        RealSubject proxy = (RealSubject) cglibProxy.getProxy(RealSubject.class);
        proxy.say();
    }
}
