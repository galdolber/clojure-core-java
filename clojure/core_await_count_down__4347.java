package clojure;

import clojure.lang.*;

public final class core_await_count_down__4347 extends clojure.lang.AFunction {
 static {
 }
 Object latch2;
 public core_await_count_down__4347(final Object latch2) {
  super();
  this.latch2 = latch2;
 }
 public java.lang.Object invoke(java.lang.Object agent1) {
  ((java.util.concurrent.CountDownLatch)this.latch2).countDown();
  return agent1;
 }
}
