package clojure;

import clojure.lang.*;

public final class core_get extends clojure.lang.AFunction {
 static {
 }
 public core_get() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object map1, java.lang.Object key2, java.lang.Object not_found3) {
  return ((java.lang.Object)clojure.lang.RT.get(((java.lang.Object)map1), ((java.lang.Object)key2), ((java.lang.Object)not_found3)));
 }
 public java.lang.Object invoke(java.lang.Object map1, java.lang.Object key2) {
  return ((java.lang.Object)clojure.lang.RT.get(((java.lang.Object)map1), ((java.lang.Object)key2)));
 }
}
