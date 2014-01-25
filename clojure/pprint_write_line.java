package clojure;

import clojure.lang.*;

public final class pprint_write_line extends clojure.lang.AFunction {
 static {
 }
 public pprint_write_line() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object this1) {
  try {
   return ((java.lang.Object)clojure.lang.LockingTransaction.runInTransaction((java.util.concurrent.Callable)((java.util.concurrent.Callable)new clojure.pprint_write_line_fn__7536(this1))));
  } catch (Exception ___e) {
   throw Util.sneakyThrow(___e);
  }
 }
}
