package clojure;

import clojure.lang.*;

public final class pprint_set_max_column extends clojure.lang.AFunction {
 static {
 }
 public pprint_set_max_column() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object this1, java.lang.Object new_max2) {
  try {
   clojure.lang.LockingTransaction.runInTransaction((java.util.concurrent.Callable)((java.util.concurrent.Callable)new clojure.pprint_set_max_column_fn__7393(this1, new_max2)));
   return null;
  } catch (Exception ___e) {
   throw Util.sneakyThrow(___e);
  }
 }
}
