package clojure;

import clojure.lang.*;

public final class core_fnil_fn__5091 extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "nil?");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "apply");
 }
 Object y3;
 Object z4;
 Object x2;
 Object f1;
 public core_fnil_fn__5091(final Object y3, final Object z4, final Object x2, final Object f1) {
  super();
  this.y3 = y3;
  this.z4 = z4;
  this.x2 = x2;
  this.f1 = f1;
 }
 public java.lang.Object doInvoke(java.lang.Object a1, java.lang.Object b2, java.lang.Object c3, java.lang.Object ds4) {
  Object __r3264;
  if (clojure.lang.Util.identical(((java.lang.Object)a1), ((java.lang.Object)null))) {
   __r3264 = this.x2;
  } else {
   __r3264 = a1;
  }
  Object __r3265;
  if (clojure.lang.Util.identical(((java.lang.Object)b2), ((java.lang.Object)null))) {
   __r3265 = this.y3;
  } else {
   __r3265 = b2;
  }
  Object __r3266;
  if (clojure.lang.Util.identical(((java.lang.Object)c3), ((java.lang.Object)null))) {
   __r3266 = this.z4;
  } else {
   __r3266 = c3;
  }
  return ((IFn)const__1.getRawRoot()).invoke(this.f1, __r3264, __r3265, __r3266, ds4);
 }
 public java.lang.Object invoke(java.lang.Object a1, java.lang.Object b2, java.lang.Object c3) {
  Object __r3267;
  if (clojure.lang.Util.identical(((java.lang.Object)a1), ((java.lang.Object)null))) {
   __r3267 = this.x2;
  } else {
   __r3267 = a1;
  }
  Object __r3268;
  if (clojure.lang.Util.identical(((java.lang.Object)b2), ((java.lang.Object)null))) {
   __r3268 = this.y3;
  } else {
   __r3268 = b2;
  }
  Object __r3269;
  if (clojure.lang.Util.identical(((java.lang.Object)c3), ((java.lang.Object)null))) {
   __r3269 = this.z4;
  } else {
   __r3269 = c3;
  }
  return ((IFn)this.f1).invoke(__r3267, __r3268, __r3269);
 }
 public java.lang.Object invoke(java.lang.Object a1, java.lang.Object b2) {
  Object __r3270;
  if (clojure.lang.Util.identical(((java.lang.Object)a1), ((java.lang.Object)null))) {
   __r3270 = this.x2;
  } else {
   __r3270 = a1;
  }
  Object __r3271;
  if (clojure.lang.Util.identical(((java.lang.Object)b2), ((java.lang.Object)null))) {
   __r3271 = this.y3;
  } else {
   __r3271 = b2;
  }
  return ((IFn)this.f1).invoke(__r3270, __r3271);
 }
 public int getRequiredArity() {
  return 3;
 }
}
