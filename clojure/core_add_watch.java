package clojure;

import clojure.lang.*;

public final class core_add_watch extends clojure.lang.AFunction {
 static {
 }
 public core_add_watch() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object reference1, java.lang.Object key2, java.lang.Object fn3) {
  return ((clojure.lang.IRef)((clojure.lang.IRef)reference1).addWatch(((java.lang.Object)key2), (clojure.lang.IFn)((clojure.lang.IFn)fn3)));
 }
}
