package clojure;

import clojure.lang.*;

public final class pprint_fn__8041_fn__8042 extends clojure.lang.AFunction {
 public static final clojure.lang.Keyword const__0;
 public static final clojure.lang.Var const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Var const__3;
 public static final clojure.lang.Var const__4;
 public static final java.lang.Object const__5;
 static {
  const__0 = (clojure.lang.Keyword)Keyword.intern(null, "n");
  const__1 = (clojure.lang.Var)RT.var("clojure.core", "print");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "apply");
  const__3 = (clojure.lang.Var)RT.var("clojure.core", "str");
  const__4 = (clojure.lang.Var)RT.var("clojure.core", "repeat");
  const__5 = (java.lang.Object)Character.valueOf((char)126);
 }
 public pprint_fn__8041_fn__8042() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object params1, java.lang.Object arg_navigator2, java.lang.Object offsets3) {
  {
   Object n4 = RT.get(params1, Keyword.intern(null, "n"));
   ((IFn)const__1.getRawRoot()).invoke(((IFn)const__2.getRawRoot()).invoke(const__3.getRawRoot(), ((IFn)const__4.getRawRoot()).invoke(n4, const__5)));
   return arg_navigator2;
  }
 }
}
