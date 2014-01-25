package clojure;

import clojure.lang.*;

public final class core_shuffle extends clojure.lang.AFunction {
 static {
 }
 public core_shuffle() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object coll1) {
  {
   Object al2 = new java.util.ArrayList((java.util.Collection)((java.util.Collection)coll1));
   java.util.Collections.shuffle((java.util.List)((java.util.List)al2));
   return ((clojure.lang.IPersistentVector)clojure.lang.RT.vector((java.lang.Object[])((java.lang.Object[])((java.lang.Object[])((java.util.ArrayList)al2).toArray()))));
  }
 }
}
