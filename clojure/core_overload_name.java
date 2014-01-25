package clojure;

import clojure.lang.*;

public final class core_overload_name extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final java.lang.Object const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "seq");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "apply");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "str");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "interleave");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "repeat");
  const__5 = (java.lang.Object)Character.valueOf((char)45);
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "map");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "escape-class-name");
 }
 public core_overload_name() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object mname1, java.lang.Object pclasses2) {
  Object __r3525 = ((IFn)const__0.getRawRoot()).invoke(pclasses2);
  if (__r3525 != null && !(__r3525 == Boolean.FALSE)) {
   return ((IFn)const__1.getRawRoot()).invoke(const__2.getRawRoot(), mname1, ((IFn)const__3.getRawRoot()).invoke(((IFn)const__4.getRawRoot()).invoke(const__5), ((IFn)const__6.getRawRoot()).invoke(const__7.getRawRoot(), pclasses2)));
  } else {
   return ((IFn)const__2.getRawRoot()).invoke(mname1, "-void");
  }
 }
}
