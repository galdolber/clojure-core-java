package clojure;

import clojure.lang.*;

public final class core_partial extends clojure.lang.RestFn {
 static {
 }
 public core_partial() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object f1, java.lang.Object arg12, java.lang.Object arg23, java.lang.Object arg34, java.lang.Object more5) {
  return new clojure.core_partial_fn__4221(arg12, f1, arg34, arg23, more5);
 }
 public java.lang.Object invoke(java.lang.Object f1, java.lang.Object arg12, java.lang.Object arg23, java.lang.Object arg34) {
  return new clojure.core_partial_fn__4219(arg12, arg34, arg23, f1);
 }
 public java.lang.Object invoke(java.lang.Object f1, java.lang.Object arg12, java.lang.Object arg23) {
  return new clojure.core_partial_fn__4217(arg12, arg23, f1);
 }
 public java.lang.Object invoke(java.lang.Object f1, java.lang.Object arg12) {
  return new clojure.core_partial_fn__4215(arg12, f1);
 }
 public java.lang.Object invoke(java.lang.Object f1) {
  return f1;
 }
 public int getRequiredArity() {
  return 4;
 }
}
