package reflect.entry;

import java.lang.ref.*;

public class ReferenceDetail {
    public static void main(String[] args) throws InterruptedException {
        ReferenceQueue<String> queue = new ReferenceQueue<>();

        String strong = new String("strong");
        WeakReference<String> weak = new WeakReference<>(strong, queue);
        // SoftReference<String> soft = new SoftReference<>(strong, queue);
        // PhantomReference<String> phantom = new PhantomReference<>(strong, queue);

        System.out.println("初始同时连接强引用和弱引用gc------------");
        Runtime.getRuntime().gc();
        System.out.println("弱引用是否还引用堆中对象？" + (weak.get()));
        System.out.println("Queue中存在引用对象？" + (queue.poll()));

        strong = null;
        System.out.println("去除强引用并gc-----------------------");
        Runtime.getRuntime().gc();
        System.out.println("弱引用是否还引用堆中对象？" + (weak.get()));
        System.out.println("去除强引用后Queue中存在弱引用对象？" + (queue.poll()));
    }
}
