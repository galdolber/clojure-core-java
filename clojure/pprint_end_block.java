package clojure;

import clojure.lang.*;

public final class pprint_end_block extends clojure.lang.AFunction {
 static {
 }
 public pprint_end_block() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object this1) {
  try {
   return ((java.lang.Object)clojure.lang.LockingTransaction.runInTransaction((java.util.concurrent.Callable)((java.util.concurrent.Callable)new clojure.pprint_end_block_fn__7583(this1))));
  } catch (Exception ___e) {
   throw Util.sneakyThrow(___e);
  }
 }
}
