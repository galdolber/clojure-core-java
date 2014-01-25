package clojure;

import clojure.lang.*;

public final class pprint_indent extends clojure.lang.AFunction {
 static {
 }
 public pprint_indent() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object this1, java.lang.Object relative_to2, java.lang.Object offset3) {
  try {
   return ((java.lang.Object)clojure.lang.LockingTransaction.runInTransaction((java.util.concurrent.Callable)((java.util.concurrent.Callable)new clojure.pprint_indent_fn__7590(relative_to2, this1, offset3))));
  } catch (Exception ___e) {
   throw Util.sneakyThrow(___e);
  }
 }
}
