package clojure;

import clojure.lang.*;

public final class core_distinct extends clojure.lang.AFunction {
 static {
 }
 public core_distinct() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object coll1) {
  {
   Object step2 = new clojure.core_distinct_step__4699();
   return ((IFn)step2).invoke(coll1, clojure.lang.PersistentHashSet.EMPTY);
  }
 }
}
