package clojure;

import clojure.lang.*;

public final class pprint_add_to_buffer extends clojure.lang.AFunction {
 static {
 }
 public pprint_add_to_buffer() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object this1, java.lang.Object token2) {
  try {
   return ((java.lang.Object)clojure.lang.LockingTransaction.runInTransaction((java.util.concurrent.Callable)((java.util.concurrent.Callable)new clojure.pprint_add_to_buffer_fn__7539(token2, this1))));
  } catch (Exception ___e) {
   throw Util.sneakyThrow(___e);
  }
 }
}
