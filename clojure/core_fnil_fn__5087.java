package clojure;

import clojure.lang.*;

public final class core_fnil_fn__5087 extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "nil?");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "apply");
 }
 Object f1;
 Object x2;
 public core_fnil_fn__5087(final Object f1, final Object x2) {
  super();
  this.f1 = f1;
  this.x2 = x2;
 }
 public java.lang.Object doInvoke(java.lang.Object a1, java.lang.Object b2, java.lang.Object c3, java.lang.Object ds4) {
  Object __r3254;
  if (clojure.lang.Util.identical(((java.lang.Object)a1), ((java.lang.Object)null))) {
   __r3254 = this.x2;
  } else {
   __r3254 = a1;
  }
  return ((IFn)const__1.getRawRoot()).invoke(this.f1, __r3254, b2, c3, ds4);
 }
 public java.lang.Object invoke(java.lang.Object a1, java.lang.Object b2, java.lang.Object c3) {
  Object __r3255;
  if (clojure.lang.Util.identical(((java.lang.Object)a1), ((java.lang.Object)null))) {
   __r3255 = this.x2;
  } else {
   __r3255 = a1;
  }
  return ((IFn)this.f1).invoke(__r3255, b2, c3);
 }
 public java.lang.Object invoke(java.lang.Object a1, java.lang.Object b2) {
  Object __r3256;
  if (clojure.lang.Util.identical(((java.lang.Object)a1), ((java.lang.Object)null))) {
   __r3256 = this.x2;
  } else {
   __r3256 = a1;
  }
  return ((IFn)this.f1).invoke(__r3256, b2);
 }
 public java.lang.Object invoke(java.lang.Object a1) {
  Object __r3257;
  if (clojure.lang.Util.identical(((java.lang.Object)a1), ((java.lang.Object)null))) {
   __r3257 = this.x2;
  } else {
   __r3257 = a1;
  }
  return ((IFn)this.f1).invoke(__r3257);
 }
 public int getRequiredArity() {
  return 3;
 }
}
