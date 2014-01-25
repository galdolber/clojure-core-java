package clojure;

import clojure.lang.*;

public final class test_inc_report_counter extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.test", "*report-counters*");
 }
 public test_inc_report_counter() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object name1) {
  try {
   Object __r4667 = const__0.get();
   if (__r4667 != null && !(__r4667 == Boolean.FALSE)) {
    return ((java.lang.Object)clojure.lang.LockingTransaction.runInTransaction((java.util.concurrent.Callable)((java.util.concurrent.Callable)new clojure.test_inc_report_counter_fn__7091(name1))));
   } else {
    return null;
   }
  } catch (Exception ___e) {
   throw Util.sneakyThrow(___e);
  }
 }
}
