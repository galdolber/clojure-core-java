package clojure;

import clojure.lang.*;

public final class core_import_fn__4384 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "symbol?");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "conj");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "name");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "first");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "rest");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "into1");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "map");
 }
 public core_import_fn__4384() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object v1, java.lang.Object spec2) {
  Object __r2634 = ((IFn)const__0.getRawRoot()).invoke(spec2);
  if (__r2634 != null && !(__r2634 == Boolean.FALSE)) {
   return ((IFn)const__1.getRawRoot()).invoke(v1, ((IFn)const__2.getRawRoot()).invoke(spec2));
  } else {
   {
    Object p3 = ((IFn)const__3.getRawRoot()).invoke(spec2);
    Object cs4 = ((IFn)const__4.getRawRoot()).invoke(spec2);
    return ((IFn)const__5.getRawRoot()).invoke(v1, ((IFn)const__6.getRawRoot()).invoke(new clojure.core_import_fn__4384_fn__4385(p3), cs4));
   }
  }
 }
}
