package clojure;

import clojure.lang.*;

public final class core_destructure_pb__4569 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Keyword const__4;
 public static final clojure.lang.Var const__5;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "symbol?");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "conj");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "vector?");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "map?");
  const__4 = (clojure.lang.Keyword)Keyword.intern(null, "else");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "str");
 }
 public core_destructure_pb__4569() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object bvec1, java.lang.Object b2, java.lang.Object v3) {
  {
   Object pvec4 = new clojure.core_destructure_pb__4569_pvec__4570(this);
   Object pmap5 = new clojure.core_destructure_pb__4569_pmap__4572(this);
   Object __r2803 = ((IFn)const__0.getRawRoot()).invoke(b2);
   if (__r2803 != null && !(__r2803 == Boolean.FALSE)) {
    return ((IFn)const__1.getRawRoot()).invoke(((IFn)const__1.getRawRoot()).invoke(bvec1, b2), v3);
   } else {
    Object __r2805 = ((IFn)const__2.getRawRoot()).invoke(b2);
    if (__r2805 != null && !(__r2805 == Boolean.FALSE)) {
     return ((IFn)pvec4).invoke(bvec1, b2, v3);
    } else {
     Object __r2807 = ((IFn)const__3.getRawRoot()).invoke(b2);
     if (__r2807 != null && !(__r2807 == Boolean.FALSE)) {
      return ((IFn)pmap5).invoke(bvec1, b2, v3);
     } else {
      Object __r2809 = const__4;
      if (__r2809 != null && !(__r2809 == Boolean.FALSE)) {
       Util.trow((Throwable)new java.lang.Exception((java.lang.String)((java.lang.String)((IFn)const__5.getRawRoot()).invoke("Unsupported binding form: ", b2))));
       return null;
      } else {
       return null;
      }
     }
    }
   }
  }
 }
}
