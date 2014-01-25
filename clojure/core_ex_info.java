package clojure;

import clojure.lang.*;

public final class core_ex_info extends clojure.lang.AFunction {
 static {
 }
 public core_ex_info() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object msg1, java.lang.Object map2, java.lang.Object cause3) {
  return new clojure.lang.ExceptionInfo((java.lang.String)((java.lang.String)msg1), (clojure.lang.IPersistentMap)((clojure.lang.IPersistentMap)map2), (java.lang.Throwable)((java.lang.Throwable)cause3));
 }
 public java.lang.Object invoke(java.lang.Object msg1, java.lang.Object map2) {
  return new clojure.lang.ExceptionInfo((java.lang.String)((java.lang.String)msg1), (clojure.lang.IPersistentMap)((clojure.lang.IPersistentMap)map2));
 }
}
