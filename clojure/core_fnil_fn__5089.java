package clojure;

import clojure.lang.*;

public final class core_fnil_fn__5089 extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "nil?");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "apply");
 }
 Object y3;
 Object x2;
 Object f1;
 public core_fnil_fn__5089(final Object y3, final Object x2, final Object f1) {
  super();
  this.y3 = y3;
  this.x2 = x2;
  this.f1 = f1;
 }
 public java.lang.Object doInvoke(java.lang.Object a1, java.lang.Object b2, java.lang.Object c3, java.lang.Object ds4) {
  Object __r3258;
  if (clojure.lang.Util.identical(((java.lang.Object)a1), ((java.lang.Object)null))) {
   __r3258 = this.x2;
  } else {
   __r3258 = a1;
  }
  Object __r3259;
  if (clojure.lang.Util.identical(((java.lang.Object)b2), ((java.lang.Object)null))) {
   __r3259 = this.y3;
  } else {
   __r3259 = b2;
  }
  return ((IFn)const__1.getRawRoot()).invoke(this.f1, __r3258, __r3259, c3, ds4);
 }
 public java.lang.Object invoke(java.lang.Object a1, java.lang.Object b2, java.lang.Object c3) {
  Object __r3260;
  if (clojure.lang.Util.identical(((java.lang.Object)a1), ((java.lang.Object)null))) {
   __r3260 = this.x2;
  } else {
   __r3260 = a1;
  }
  Object __r3261;
  if (clojure.lang.Util.identical(((java.lang.Object)b2), ((java.lang.Object)null))) {
   __r3261 = this.y3;
  } else {
   __r3261 = b2;
  }
  return ((IFn)this.f1).invoke(__r3260, __r3261, c3);
 }
 public java.lang.Object invoke(java.lang.Object a1, java.lang.Object b2) {
  Object __r3262;
  if (clojure.lang.Util.identical(((java.lang.Object)a1), ((java.lang.Object)null))) {
   __r3262 = this.x2;
  } else {
   __r3262 = a1;
  }
  Object __r3263;
  if (clojure.lang.Util.identical(((java.lang.Object)b2), ((java.lang.Object)null))) {
   __r3263 = this.y3;
  } else {
   __r3263 = b2;
  }
  return ((IFn)this.f1).invoke(__r3262, __r3263);
 }
 public int getRequiredArity() {
  return 3;
 }
}
