package clojure;

import clojure.lang.*;

public final class core_nth extends clojure.lang.AFunction {
 static {
 }
 public core_nth() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object coll1, java.lang.Object index2, java.lang.Object not_found3) {
  return ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)coll1), (int)RT.intCast(index2), ((java.lang.Object)not_found3)));
 }
 public java.lang.Object invoke(java.lang.Object coll1, java.lang.Object index2) {
  return ((java.lang.Object)clojure.lang.RT.nth(((java.lang.Object)coll1), (int)RT.intCast(index2)));
 }
}
