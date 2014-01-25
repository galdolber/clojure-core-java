package clojure;

import clojure.lang.*;

public final class core_vector_of extends clojure.lang.RestFn {
 public static final clojure.lang.Var const__0;
 public static final java.lang.Object const__1;
 public static final java.lang.Object const__2;
 public static final clojure.lang.Var const__3;
 public static final java.lang.Object const__4;
 public static final java.lang.Object const__5;
 public static final java.lang.Object const__6;
 public static final java.lang.Object const__7;
 public static final clojure.lang.Var const__8;
 public static final clojure.lang.Var const__9;
 public static final clojure.lang.Var const__10;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "ams");
  const__1 = (java.lang.Object)0L;
  const__2 = (java.lang.Object)5L;
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "EMPTY-NODE");
  const__4 = (java.lang.Object)1L;
  const__5 = (java.lang.Object)2L;
  const__6 = (java.lang.Object)3L;
  const__7 = (java.lang.Object)4L;
  const__8 = (clojure.lang.Var)RT.var("clojure.core", "vector-of");
  const__9 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__10 = (clojure.lang.Var)RT.var("clojure.core", "next");
 }
 public core_vector_of() {
  super();
 }
 public java.lang.Object doInvoke(java.lang.Object t1, java.lang.Object x12, java.lang.Object x23, java.lang.Object x34, java.lang.Object x45, java.lang.Object xn6) {
  {
   Object v7 = ((IFn)const__8.getRawRoot()).invoke(t1, x12, x23, x34, x45);
   Object xn8 = xn6;
   while(true) {
    Object __r4019 = xn8;
    if (__r4019 != null && !(__r4019 == Boolean.FALSE)) {
     java.lang.Object v7___aux = Reflector.invokeInstanceMethod(v7, "cons", new Object[]{((IFn)const__9.getRawRoot()).invoke(xn8)});
     java.lang.Object xn8___aux = ((IFn)const__10.getRawRoot()).invoke(xn8);
     v7 = v7___aux;
     xn8 = xn8___aux;
     continue;
    } else {
     return v7;
    }
   }
  }
 }
 public java.lang.Object invoke(java.lang.Object t1, java.lang.Object x12, java.lang.Object x23, java.lang.Object x34, java.lang.Object x45) {
  {
   Object am6 = ((IFn)const__0.getRawRoot()).invoke(t1);
   Object arr7 = ((java.lang.Object)((clojure.core.ArrayManager)am6).array((int)RT.intCast(4L)));
   ((clojure.core.ArrayManager)am6).aset(((java.lang.Object)arr7), (int)RT.intCast(0L), ((java.lang.Object)x12));
   ((clojure.core.ArrayManager)am6).aset(((java.lang.Object)arr7), (int)RT.intCast(1L), ((java.lang.Object)x23));
   ((clojure.core.ArrayManager)am6).aset(((java.lang.Object)arr7), (int)RT.intCast(2L), ((java.lang.Object)x34));
   ((clojure.core.ArrayManager)am6).aset(((java.lang.Object)arr7), (int)RT.intCast(3L), ((java.lang.Object)x45));
   return new clojure.core.Vec(((java.lang.Object)am6), (int)RT.intCast(4L), (int)RT.intCast(5L), ((java.lang.Object)const__3.getRawRoot()), ((java.lang.Object)arr7), ((java.lang.Object)null));
  }
 }
 public java.lang.Object invoke(java.lang.Object t1, java.lang.Object x12, java.lang.Object x23, java.lang.Object x34) {
  {
   Object am5 = ((IFn)const__0.getRawRoot()).invoke(t1);
   Object arr6 = ((java.lang.Object)((clojure.core.ArrayManager)am5).array((int)RT.intCast(3L)));
   ((clojure.core.ArrayManager)am5).aset(((java.lang.Object)arr6), (int)RT.intCast(0L), ((java.lang.Object)x12));
   ((clojure.core.ArrayManager)am5).aset(((java.lang.Object)arr6), (int)RT.intCast(1L), ((java.lang.Object)x23));
   ((clojure.core.ArrayManager)am5).aset(((java.lang.Object)arr6), (int)RT.intCast(2L), ((java.lang.Object)x34));
   return new clojure.core.Vec(((java.lang.Object)am5), (int)RT.intCast(3L), (int)RT.intCast(5L), ((java.lang.Object)const__3.getRawRoot()), ((java.lang.Object)arr6), ((java.lang.Object)null));
  }
 }
 public java.lang.Object invoke(java.lang.Object t1, java.lang.Object x12, java.lang.Object x23) {
  {
   Object am4 = ((IFn)const__0.getRawRoot()).invoke(t1);
   Object arr5 = ((java.lang.Object)((clojure.core.ArrayManager)am4).array((int)RT.intCast(2L)));
   ((clojure.core.ArrayManager)am4).aset(((java.lang.Object)arr5), (int)RT.intCast(0L), ((java.lang.Object)x12));
   ((clojure.core.ArrayManager)am4).aset(((java.lang.Object)arr5), (int)RT.intCast(1L), ((java.lang.Object)x23));
   return new clojure.core.Vec(((java.lang.Object)am4), (int)RT.intCast(2L), (int)RT.intCast(5L), ((java.lang.Object)const__3.getRawRoot()), ((java.lang.Object)arr5), ((java.lang.Object)null));
  }
 }
 public java.lang.Object invoke(java.lang.Object t1, java.lang.Object x12) {
  {
   Object am3 = ((IFn)const__0.getRawRoot()).invoke(t1);
   Object arr4 = ((java.lang.Object)((clojure.core.ArrayManager)am3).array((int)RT.intCast(1L)));
   ((clojure.core.ArrayManager)am3).aset(((java.lang.Object)arr4), (int)RT.intCast(0L), ((java.lang.Object)x12));
   return new clojure.core.Vec(((java.lang.Object)am3), (int)RT.intCast(1L), (int)RT.intCast(5L), ((java.lang.Object)const__3.getRawRoot()), ((java.lang.Object)arr4), ((java.lang.Object)null));
  }
 }
 public java.lang.Object invoke(java.lang.Object t1) {
  {
   Object am2 = ((IFn)const__0.getRawRoot()).invoke(t1);
   return new clojure.core.Vec(((java.lang.Object)am2), (int)RT.intCast(0L), (int)RT.intCast(5L), ((java.lang.Object)const__3.getRawRoot()), ((java.lang.Object)((java.lang.Object)((clojure.core.ArrayManager)am2).array((int)RT.intCast(0L)))), ((java.lang.Object)null));
  }
 }
 public int getRequiredArity() {
  return 5;
 }
}
