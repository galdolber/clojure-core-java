package clojure;

import clojure.lang.*;

public final class core_pref extends clojure.lang.AFunction {
 static {
 }
 public core_pref() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object a1, java.lang.Object b2) {
  if (((java.lang.Class)a1).isAssignableFrom((java.lang.Class)((java.lang.Class)b2))) {
   return b2;
  } else {
   return a1;
  }
 }
 public java.lang.Object invoke(java.lang.Object a1) {
  return a1;
 }
 public java.lang.Object invoke() {
  return null;
 }
}
