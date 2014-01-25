package clojure;

import clojure.lang.*;

public final class core_keep_indexed extends clojure.lang.AFunction {
 public static final java.lang.Object const__0;
 static {
  const__0 = (java.lang.Object)0L;
 }
 public core_keep_indexed() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object f1, java.lang.Object coll2) {
  IFn keepi3 = new clojure.core_keep_indexed_keepi__6407(f1);
  return ((IFn)keepi3).invoke(const__0, coll2);
 }
}
