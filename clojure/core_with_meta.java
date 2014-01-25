package clojure;

import clojure.lang.*;

public final class core_with_meta extends clojure.lang.AFunction {
 static {
 }
 public core_with_meta() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object x1, java.lang.Object m2) {
  return ((clojure.lang.IObj)((clojure.lang.IObj)x1).withMeta((clojure.lang.IPersistentMap)((clojure.lang.IPersistentMap)m2)));
 }
}
