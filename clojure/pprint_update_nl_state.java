package clojure;

import clojure.lang.*;

public final class pprint_update_nl_state extends clojure.lang.AFunction {
 static {
 }
 public pprint_update_nl_state() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object lb1) {
  try {
   return ((java.lang.Object)clojure.lang.LockingTransaction.runInTransaction((java.util.concurrent.Callable)((java.util.concurrent.Callable)new clojure.pprint_update_nl_state_fn__7512(lb1))));
  } catch (Exception ___e) {
   throw Util.sneakyThrow(___e);
  }
 }
}
