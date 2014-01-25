package clojure;

import clojure.lang.*;

public final class core_load_all extends clojure.lang.AFunction {
 static {
 }
 public core_load_all() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object lib1, java.lang.Object need_ns2, java.lang.Object require3) {
  try {
   return ((java.lang.Object)clojure.lang.LockingTransaction.runInTransaction((java.util.concurrent.Callable)((java.util.concurrent.Callable)new clojure.core_load_all_fn__4980(require3, need_ns2, lib1))));
  } catch (Exception ___e) {
   throw Util.sneakyThrow(___e);
  }
 }
}
