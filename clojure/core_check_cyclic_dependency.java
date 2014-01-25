package clojure;

import clojure.lang.*;

public final class core_check_cyclic_dependency extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final clojure.lang.Var const__5;
 public static final clojure.lang.Var const__6;
 public static final clojure.lang.Var const__7;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "some");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "rest");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "*pending-paths*");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "map");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "cons");
  const__5 = (clojure.lang.Var)RT.var("clojure.core", "apply");
  const__6 = (clojure.lang.Var)RT.var("clojure.core", "str");
  const__7 = (clojure.lang.Var)RT.var("clojure.core", "interpose");
 }
 public core_check_cyclic_dependency() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object path1) {
  Object __r3219 = ((IFn)const__0.getRawRoot()).invoke(RT.set(path1), ((IFn)const__1.getRawRoot()).invoke(const__2.get()));
  if (__r3219 != null && !(__r3219 == Boolean.FALSE)) {
   {
    Object pending2 = ((IFn)const__3.getRawRoot()).invoke(new clojure.core_check_cyclic_dependency_fn__5027(path1), ((IFn)const__4.getRawRoot()).invoke(path1, const__2.get()));
    Object chain3 = ((IFn)const__5.getRawRoot()).invoke(const__6.getRawRoot(), ((IFn)const__7.getRawRoot()).invoke("->", pending2));
    Util.trow((Throwable)new java.lang.Exception((java.lang.String)((java.lang.String)((IFn)const__6.getRawRoot()).invoke("Cyclic load dependency: ", chain3))));
    return null;
   }
  } else {
   return null;
  }
 }
}
