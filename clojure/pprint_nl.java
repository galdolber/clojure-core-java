package clojure;

import clojure.lang.*;

public final class pprint_nl extends clojure.lang.AFunction {
 static {
 }
 public pprint_nl() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object this1, java.lang.Object type2) {
  try {
   return ((java.lang.Object)clojure.lang.LockingTransaction.runInTransaction((java.util.concurrent.Callable)((java.util.concurrent.Callable)new clojure.pprint_nl_fn__7587(this1, type2))));
  } catch (Exception ___e) {
   throw Util.sneakyThrow(___e);
  }
 }
}
