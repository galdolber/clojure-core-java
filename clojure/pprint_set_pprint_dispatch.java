package clojure;

import clojure.lang.*;

public final class pprint_set_pprint_dispatch extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "meta");
  const__1 = (clojure.lang.Var)RT.var("clojure.pprint", "*print-pprint-dispatch*");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "alter-var-root");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "constantly");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "alter-meta!");
 }
 public pprint_set_pprint_dispatch() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object function1) {
  {
   Object old_meta2 = ((IFn)const__0.getRawRoot()).invoke(const__1);
   ((IFn)const__2.getRawRoot()).invoke(const__1, ((IFn)const__3.getRawRoot()).invoke(function1));
   ((IFn)const__4.getRawRoot()).invoke(const__1, ((IFn)const__3.getRawRoot()).invoke(old_meta2));
  }
  return null;
 }
}
