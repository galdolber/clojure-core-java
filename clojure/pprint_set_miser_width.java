package clojure;

import clojure.lang.*;

public final class pprint_set_miser_width extends clojure.lang.AFunction {
 static {
 }
 public pprint_set_miser_width() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object this1, java.lang.Object new_miser_width2) {
  try {
   return ((java.lang.Object)clojure.lang.LockingTransaction.runInTransaction((java.util.concurrent.Callable)((java.util.concurrent.Callable)new clojure.pprint_set_miser_width_fn__7597(new_miser_width2, this1))));
  } catch (Exception ___e) {
   throw Util.sneakyThrow(___e);
  }
 }
}
