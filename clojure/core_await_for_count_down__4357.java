package clojure;

import clojure.lang.*;

public final class core_await_for_count_down__4357 extends clojure.lang.AFunction {
 static {
 }
 Object latch3;
 public core_await_for_count_down__4357(final Object latch3) {
  super();
  this.latch3 = latch3;
 }
 public java.lang.Object invoke(java.lang.Object agent1) {
  ((java.util.concurrent.CountDownLatch)this.latch3).countDown();
  return agent1;
 }
}
