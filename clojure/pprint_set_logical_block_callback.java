package clojure;

import clojure.lang.*;

public final class pprint_set_logical_block_callback extends clojure.lang.AFunction {
 static {
 }
 public pprint_set_logical_block_callback() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object this1, java.lang.Object f2) {
  try {
   return ((java.lang.Object)clojure.lang.LockingTransaction.runInTransaction((java.util.concurrent.Callable)((java.util.concurrent.Callable)new clojure.pprint_set_logical_block_callback_fn__7600(this1, f2))));
  } catch (Exception ___e) {
   throw Util.sneakyThrow(___e);
  }
 }
}
