package clojure.core;

import clojure.lang.*;

public final class reducers_monoid_m__6746 extends clojure.lang.AFunction {
 static {
 }
 Object op1;
 Object ctor2;
 public reducers_monoid_m__6746(final Object op1, final Object ctor2) {
  super();
  this.op1 = op1;
  this.ctor2 = ctor2;
 }
 public java.lang.Object invoke(java.lang.Object a1, java.lang.Object b2) {
  return ((IFn)this.op1).invoke(a1, b2);
 }
 public java.lang.Object invoke() {
  return ((IFn)this.ctor2).invoke();
 }
}
