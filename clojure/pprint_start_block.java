package clojure;

import clojure.lang.*;

public final class pprint_start_block extends clojure.lang.AFunction {
 static {
 }
 public pprint_start_block() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object this1, java.lang.Object prefix2, java.lang.Object per_line_prefix3, java.lang.Object suffix4) {
  try {
   return ((java.lang.Object)clojure.lang.LockingTransaction.runInTransaction((java.util.concurrent.Callable)((java.util.concurrent.Callable)new clojure.pprint_start_block_fn__7579(this1, per_line_prefix3, suffix4, prefix2))));
  } catch (Exception ___e) {
   throw Util.sneakyThrow(___e);
  }
 }
}
