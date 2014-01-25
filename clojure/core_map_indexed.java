package clojure;

import clojure.lang.*;

public final class core_map_indexed extends clojure.lang.AFunction {
 public static final java.lang.Object const__0;
 static {
  const__0 = (java.lang.Object)0L;
 }
 public core_map_indexed() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object f1, java.lang.Object coll2) {
  IFn mapi3 = new clojure.core_map_indexed_mapi__6395(f1);
  return ((IFn)mapi3).invoke(const__0, coll2);
 }
}
